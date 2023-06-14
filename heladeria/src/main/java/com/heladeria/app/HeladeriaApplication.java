package com.heladeria.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class HeladeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeladeriaApplication.class, args);
	
	}
	
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//	        return new WebMvcConfigurer() {
//	                @Override
//	                public void addCorsMappings(CorsRegistry registry) {
//	                        registry.addMapping("/api/**")
//	                                .allowedOrigins("http://127.0.0.1:5500")
//	                                .allowedMethods("GET", "POST", "PUT", "DELETE")
//	                                .maxAge(3600);
//	                }
//
//	        };
//	}
	
}


