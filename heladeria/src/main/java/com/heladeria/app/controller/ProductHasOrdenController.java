package com.heladeria.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heladeria.app.entity.Orden;
import com.heladeria.app.entity.ProductHasOrden;
import com.heladeria.app.repository.ProductHasOrdenRepository;

@RestController
@RequestMapping("api/productordenes")
public class ProductHasOrdenController {

	@Autowired
	ProductHasOrdenRepository productHasOrdenRepository;
	
	@GetMapping
	public List<ProductHasOrden> getAllProductHasOrden() {
		// TODO Auto-generated method stub
		List<ProductHasOrden> productHasOrden = productHasOrdenRepository.findAll();
		return productHasOrden;
	}
	
	@GetMapping("{id}")
	public List<ProductHasOrden> getProductHasOrdenById(@PathVariable int id) {
		// TODO Auto-generated method stub
		List<ProductHasOrden> productHasOrden = productHasOrdenRepository.findByOrderId(id);
				//.orElseThrow(()-> new IllegalStateException("productHasOrden no encontrada " + id) );;
		return productHasOrden;
	}
	
}
