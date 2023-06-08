package com.heladeria.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data 
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productoId;
	private String nombreProducto;
	private int precioProducto;
	private String descripcionProducto;
	private int categoriaProducto;
	private String imagenProducto;
	
}
