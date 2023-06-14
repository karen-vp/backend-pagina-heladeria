package com.heladeria.app.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import com.heladeria.app.security.jwt.JwtAuthenticationFilter;
import lombok.AllArgsConstructor;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class WebSecurityConfig {
	
	
	// STEP 13 Inyectar UserDetailsService
	UserDetailsService userDetailsService;
	
	// STEP 1 realizar configuraciones personalizadas del filterChain
	@Bean                                   // STEP 14.3 inyectar AuthenticationManager 
	SecurityFilterChain filterChain(HttpSecurity http, AuthenticationManager authManager) throws Exception {
		
		// STEP 2 probar deshabilitar la seguridad
	/*return http
				.authorizeHttpRequests( authorize ->
						authorize.anyRequest().permitAll() // Cualquier solicitud es permitida						
						)                                  // No tiene que estar autenticada.
				.csrf( csrf -> csrf.disable() ) // Deshabilita la protección CSRF 
				                               //( Coross-Site Request Forgery).
				.httpBasic( withDefaults() ) // Habilita la autenticación básica.
				.build();*/
			
		// STEP 14.1 Crear un objeto de JwtAuthenticationFilter
		JwtAuthenticationFilter jwtAuthenticationFilter = new JwtAuthenticationFilter();
		// STEP 14.2 Indicar quién maneja la autenticación
		jwtAuthenticationFilter.setAuthenticationManager(authManager);
		// STEP 14.4 Indicar la url de la solicituid
		jwtAuthenticationFilter.setFilterProcessesUrl("/login" ); // localhost:8080/login
		
		// SETP 3 Configurar las reglas de autorización para las diferentes solicitudes HTTP
		return http
				.authorizeHttpRequests( authorize ->				
						authorize
						// STEP 5 Agregar las reglas de autorización para los endpoints
						// Para la url /api/customers/active puede realizarse sin autenticarse
						.requestMatchers(HttpMethod.GET, "/api/products").permitAll()
						.requestMatchers(HttpMethod.POST, "/api/usuarios/signup").permitAll()
						.requestMatchers(HttpMethod.PUT, "/api/usuarios/{id}").hasRole("CLIENTE")
						.requestMatchers("/api/producthasordenes").hasRole("CLIENTE")
						.requestMatchers(HttpMethod.GET,"/api/usuarios").hasAnyRole("ADMIN")	
						.requestMatchers(HttpMethod.GET,"/api/usuarios/{id}").hasAnyRole("ADMIN")	
						.requestMatchers(HttpMethod.PUT,"/api/usuarios/{id}").hasAnyRole("ADMIN")	
						.requestMatchers(HttpMethod.DELETE,"/api/usuarios/{id}").hasAnyRole("ADMIN")	
						.anyRequest().authenticated() // Todas las solicitud deben estar autenticadas					
						)  
				// STEP 14 agregar un filtro que intercepte la autentificación y genere el toke JWT
				.addFilter( jwtAuthenticationFilter  ) 
				// STEP ? agregar un filtro que lea el token que viene acompañado de la solicitud HTTP
				//        y verificar si es válido y no está caducado.
				
				.csrf( csrf -> csrf.disable() ) 			                              
				.httpBasic( withDefaults() ) 
				.build();	
				
	}
	
	// STEP 6 Leer los usuarios de las base de datos
	@SuppressWarnings("removal")
	@Bean
	AuthenticationManager authManager(HttpSecurity http) throws Exception {
		
		return http
				// AuthenticationManagerBuilder es utilizado para construir y configurar el AuthManager
				// que es responsable de autenticar las solicitud de los usuarios.
				.getSharedObject( AuthenticationManagerBuilder.class  )
				.userDetailsService( userDetailsService ) // Leer el usuario de la DB
				.passwordEncoder( passwordEncoder()  ) 
				.and()
				.build();		
	}
	
	/*
	 *  STEP 7 crear un bean de BCripPasswordEncoder.
	 *  BCripPasswordEncoder es una implementación de PasswordEncoder proporcionada
	 *  por Spring Security. Se utiliza para codificar y verificar contraseñas utilizando
	 *  el algoritmo de hashing bcrypt.
	 *  El algoritmo incorpora un sal aleatoria por cada contraseña, lo que agrega un capa
	 *  adicional de seguridad.
	 */	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// STEP 8 obtener una clave encriptada para agregarlo a los usuarios de import.sql
//	public static void main(String[] args) {
//		System.out.println("password: " + new BCryptPasswordEncoder().encode("123") );
//	}
	
}

