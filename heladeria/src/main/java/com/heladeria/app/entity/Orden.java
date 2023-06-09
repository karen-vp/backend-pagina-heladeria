package com.heladeria.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data 
@Table(name="ordenes")
public class Orden {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ordenId;
	@Column(name="fk_usuarios_id", nullable=false)
	private int usuarioId;
	
}
