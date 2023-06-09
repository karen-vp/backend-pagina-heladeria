package com.heladeria.app.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data 
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int usuarioId;
	@Column(name="nombre_usuario", nullable=false, length=45)
	private String nombreUsuario;
	@Column(name="email", nullable=false, length=45, unique=true)
	private String emailUsuario;
	@Column(name="contraseña", nullable=false, length=200)
	private String contraseña;
	@Column(name="telefono", nullable=false, length=45)
	private String telefono; 
	@Column(name="ubicacion", nullable=false, length=200)
	private String ubicación;
	@Column(name="rol_id", nullable=false)
	private int rolId;
	
	
}

