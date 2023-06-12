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
@Table(name="productos")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int productoId;
	@Column(name="nombre_producto", nullable=false, length=150)
	private String nombreProducto;
	@Column(name="precio", nullable=false)
	private int precioProducto;
	@Column(name="descripcion", nullable=false, length=1000)
	private String descripcionProducto;
	@Column(name="categoria_id", nullable=false)
	private int categoriaProducto;
	@Column(name="imagen", nullable=false, length=1000)
	private String imagenProducto;
	
}
