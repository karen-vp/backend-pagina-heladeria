package com.heladeria.app.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data 
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int usuarioId;
	private String nombreUsuario;
	private String emailUsuario;
	private String contraseña;
	private String telefono; 
	private String ubicación;
	private int rolId;
	
	
}

