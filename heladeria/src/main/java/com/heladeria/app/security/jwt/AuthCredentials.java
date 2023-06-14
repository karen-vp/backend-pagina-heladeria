package com.heladeria.app.security.jwt;


import lombok.Data;

//STEP 16 Crear la clase  AuthCredentials que reciba los datos del endopoint de POST /login
@Data
public class AuthCredentials {
	
	private String email;
	private String password;

}