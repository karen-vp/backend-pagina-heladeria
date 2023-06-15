package com.heladeria.app.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.heladeria.app.entity.Producto;
import com.heladeria.app.exceptions.HeladeriaAppException;
import com.heladeria.app.repository.ProductoRepository;
import com.heladeria.app.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoRepository productoRepository;

	@Override
	public List<Producto> getAllProductos() {
		List<Producto> productos = productoRepository.findAll();
		if (productos != null) {
			return productos;
		} else {
			throw new HeladeriaAppException(HttpStatus.NOT_FOUND, "No se encontro la lista de productos");
		}
	}

	@Override
	public Producto getProductoById(int id) {
		Producto producto = productoRepository.findById(id);
		if (producto != null) {
			return producto;
		} else {
			throw new HeladeriaAppException(HttpStatus.NOT_FOUND, "No se encontro el producto con ID " + id);
		}
	}

	@Override
	public Producto createProducto(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public void deleteProducto(int id) {
		Producto producto = productoRepository.findById(id);
		if (producto != null) {
			productoRepository.delete(producto);
		} else {
			throw new HeladeriaAppException(HttpStatus.NOT_FOUND, "No se encontro el producto con ID " + id);
		}
	}

	@Override
	public String updateProducto(int id, Producto producto) {
		Producto productoExistente = productoRepository.findById(id);
		if (productoExistente != null) {
			productoExistente.setNombreProducto(producto.getNombreProducto());
			productoExistente.setPrecioProducto(producto.getPrecioProducto());
			productoExistente.setDescripcionProducto(producto.getDescripcionProducto());
			productoExistente.setCategoriaProducto(producto.getCategoriaProducto());
			productoExistente.setImagenProducto(producto.getImagenProducto());

			productoRepository.save(productoExistente);
			return "El usuario se actualizo correctamente";
		} else {
			throw new HeladeriaAppException(HttpStatus.NOT_FOUND, "No se encontro el producto con ID " + id);
		}
	}

	@Override
	public List<Producto> getProductoByNombre(String nombre) {
		List<Producto> producto = productoRepository.findByNombre(nombre);
		return producto;
	}

}