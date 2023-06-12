package com.heladeria.app.exceptions;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HeladeriaAppException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private HttpStatus estado;
	private String mensaje;
	
	public HeladeriaAppException(HttpStatus estado, String mensaje, String mensaje1) {
		super();
		this.estado = estado;
		this.mensaje = mensaje;
		this.mensaje = mensaje1;
	}
	
	
}
