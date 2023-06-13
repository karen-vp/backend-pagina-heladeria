package com.heladeria.app.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
/*
 *  @ControllerAdvice Globaliza el manejo de excepciones.
 *  Permite centralizar el manejo de excepciones en un solo lugar y
 *  aplicarlo a todos los controladores de la aplicación.
 */


@ControllerAdvice
public class GlobalExceptionHandler {
	
	/*
	 *  La clase ResponseEntity se usa para personalizar la respuesta HTTP
	 *  devuelta por un controlador. Permite especificar el código de estado(200, 404, 401, etc),
	 *  la cabecera y el cuerpo de la respuesta.
	 *  
	 *  WebRequest proporciona acceso genérico a los detalles de uan solicitud web.
	 *  Exception representa la excepción durante la ejecución del programa.
	 *  
	 *  @ExceptionHandler maneja las excepciones específicas. Permite capturar y manejar
	 *  una excepción. El método con esta anotación se ejecutará cuando se lance la excepción
	 *  especificada.
	 */
	
	@ExceptionHandler( IllegalStateException.class )
	public ResponseEntity<String> handleIllegalStateException(Exception exception) {
		ResponseEntity<String> response = new ResponseEntity<>(
		exception.getMessage(), HttpStatus.NOT_FOUND);
		return response;
	}
	
	
	@ExceptionHandler( HeladeriaAppException.class )
	public ResponseEntity<String> handleHeladeriaAppException(Exception exception) {
		ResponseEntity<String> response = new ResponseEntity<>(
		exception.getMessage(), HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler( Exception.class )
	public ResponseEntity<String> handleIGlobalException(Exception exception) {
		ResponseEntity<String> response = new ResponseEntity<>(
				exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}
	

}