package com.heladeria.app.dto;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class UsuarioDto {

	private int usuarioId;
	private String nombreUsuario;
	private String emailUsuario;
	private String contraseña;
	private String telefono;
	private String ubicacion;

}
