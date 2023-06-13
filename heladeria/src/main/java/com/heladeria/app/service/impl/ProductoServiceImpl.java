package com.heladeria.app.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;

import com.heladeria.app.entity.Producto;
import com.heladeria.app.repository.ProductoRepository;
import com.heladeria.app.service.ProductoService;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductoServiceImpl implements ProductoService {
	
	ProductoRepository productoRepository;
	@Override
    public List<Producto> getAllProductos() {
    List<Producto> productos=  productoRepository.findAll();
    return productos;
    }
	
	@Override
	public Producto getProductoById(int id) {
		Producto producto = productoRepository.findById(id);
	    return producto;
	}
	
	@Override
	 public Producto createProducto (Producto producto) {
		 return productoRepository.save(producto);
	}
	
	@Override
	public void deleteProducto(int id) {
		Producto producto = productoRepository.findById(id);
	    if (producto!= null) {
	    	productoRepository.delete(producto);
	    }
	}
	
	@Override
	public String  updateProducto(int id, Producto producto) {
	    Producto productoExistente = productoRepository.findById(id);
	    productoExistente.setNombreProducto(producto.getNombreProducto());
	    productoExistente.setPrecioProducto(producto.getPrecioProducto());
	    productoExistente.setDescripcionProducto(producto.getDescripcionProducto());
	    productoExistente.setCategoriaProducto(producto.getCategoriaProducto());
	    productoExistente.setImagenProducto(producto.getImagenProducto());

	    productoRepository.save(productoExistente);
	    return "El usuario se actualizo correctamente";
	}
	
	

	
	
}