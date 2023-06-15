package com.heladeria.app.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data 
@Table(name="productos_has_ordenes")
public class ProductHasOrden {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_has_orden_id")
	private int productHasOrdenId;
	@Column(name="cantidad_productos", nullable=false)
	private int cantidadProducto;
	
//	@OneToMany
//	@JoinColumn(name="product_id")
//	private List<Producto> productos;
	
//	@OneToMany
//	@JoinColumn(name="orden_id") 
//	private List<Orden> ordenes = new ArrayList<>();
	

	@ManyToOne
	@JoinColumn(name="product_id")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="orden_id") 
	private Orden orden;
	
}


