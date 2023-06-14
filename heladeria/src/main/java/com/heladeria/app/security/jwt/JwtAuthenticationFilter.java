package com.heladeria.app.security.jwt;


import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.heladeria.app.security.UserDetailsImpl;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//STEP 15 Crear la implementación de la clase JwtAuthenticationFilter

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	
	
	// STEP 17 Sobreescribir el método attempAuthentication
	@Override
	public Authentication attemptAuthentication(
				HttpServletRequest request // body: { "email": "", "password": "" }
				, HttpServletResponse response ) {
	
	// STEP 18 Crear un objeto de la clase creada AuthCredentials		
	AuthCredentials authCredentials = new AuthCredentials();
	try {
	// STEP 19 Leer los datos de la solicitud HTTP y mapearlo al objeto authCredentials	
		authCredentials = new ObjectMapper().readValue( request.getReader() , AuthCredentials.class);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	// STEP 20 usernamePAT es una clase de spring Security que representa un token de autenticación 
	// basado en username y password. Se usa para autenticar a un usuario utilizando credenciales.
	UsernamePasswordAuthenticationToken usernamePAT = new UsernamePasswordAuthenticationToken(
			authCredentials.getEmail(),
			authCredentials.getPassword()
			);
	// STEP 21 Se utiliza para autenticar un objeto Authentication en Spring.
	// Si la autenticación es exitosa se devuelve un objeto Authentication completamente lleno.
	// incluyendo la información como los roles. Si la autenticación falla se lanza
	// una excepción "AuthenticationException".
	return getAuthenticationManager().authenticate( usernamePAT  );
	}

	
	// STEP 22 Si el step 21 es exitoso el siguiente método generará el token JWT
	// y se retorna en el encabezado de la respuesta.
	@Override
	protected void successfulAuthentication(
			HttpServletRequest request 
			, HttpServletResponse response
			, FilterChain chain
			, Authentication authResult) throws IOException, ServletException {
		
		//  STEP 23 hacer un cast de authResult para los detalles del usuario autenticado
		UserDetailsImpl userDetails = (UserDetailsImpl) authResult.getPrincipal();
		
		// STEP 24 crear el token
		String token = JwtTokenUtils.createToken( 
				  userDetails.getUsername()
				, userDetails.getAuthorities());
		
		// STEP 27 agregar el token al header de la respuesta
		response.addHeader("Authorization", "Bearer " + token);
		// Envía los datos escritos en printWriter asociado al objeto HttpServletResponse
		// Forza el envío inmediato de los datos al cliente.
		response.getWriter().flush();
		
		super.successfulAuthentication(request, response, chain, authResult);
		
		
	}
	
}

