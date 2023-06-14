package com.heladeria.app.service;
import java.util.List;
import com.heladeria.app.entity.Producto;


public interface ProductoService {
	
	List<Producto> getAllProductos();
	
	Producto createProducto(Producto producto);
	
	void deleteProducto(int id); 
	
	String updateProducto (int id, Producto producto);
	
	Producto getProductoById(int id); 
	
	List<Producto> getProductoByNombre(String nombre);
	
}
