package com.heladeria.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.heladeria.app.entity.Producto;
import com.heladeria.app.service.ProductoService;

public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	@GetMapping
    public List<Producto> getAllProductos() {
    List<Producto> productos=  productoService.getAllProductos();
    return productos;
    }
	@PostMapping("create")
	public Producto createProducto(@RequestBody Producto producto) {
		return productoService.createProducto(producto);
	}
	
	@DeleteMapping("{id}")  
	public String deleteProducto(@PathVariable int id) {
		productoService.deleteProducto(id);
		return "El producto se borro correctamente!";
	}
	
	@PutMapping("{id}")
    public String updateProducto(@PathVariable int id, @RequestBody Producto producto) {
        productoService.updateProducto(id, producto);
        return "Producto actualizado exitosamente";
    }
	
	@GetMapping("{id}")  
    public Producto getProductoById(@PathVariable  int id) {
		return productoService.getProductoById(id);
    }
}
