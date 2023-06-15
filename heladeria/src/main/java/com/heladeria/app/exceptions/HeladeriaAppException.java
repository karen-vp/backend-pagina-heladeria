package com.heladeria.app.exceptions;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class HeladeriaAppException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private HttpStatus estado;
	private String mensaje;
	
	public HeladeriaAppException(HttpStatus estado, String mensaje) {
		super(mensaje);
		this.estado = estado;
		this.mensaje = mensaje;
	}
	
	
}
