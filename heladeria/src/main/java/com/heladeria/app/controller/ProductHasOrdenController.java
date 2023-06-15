package com.heladeria.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.heladeria.app.entity.ProductHasOrden;
import com.heladeria.app.repository.ProductHasOrdenRepository;

@RestController
@RequestMapping("api/carrito")
@CrossOrigin(origins="*")
public class ProductHasOrdenController {

	@Autowired
	ProductHasOrdenRepository productHasOrdenRepository;
	
	@GetMapping("{id}")
	public ProductHasOrden getProductOrdenById(@PathVariable int id) {
		// TODO Auto-generated method stub
		ProductHasOrden productHasOrdenExistente = productHasOrdenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Registro de carrito no encontrada " + id));
		return productHasOrdenExistente;
	}
	
	@GetMapping
	public List<ProductHasOrden> getAllProductHasOrden() {
		// TODO Auto-generated method stub
		List<ProductHasOrden> productHasOrden = productHasOrdenRepository.findAll();
		return productHasOrden;
	}
	
	@GetMapping("orden/{id}")
	public List<ProductHasOrden> getProductHasOrdenByOrdenId(@PathVariable int id) {
		// TODO Auto-generated method stub
		List<ProductHasOrden> productHasOrden = productHasOrdenRepository.findByOrderId(id);
		return productHasOrden;
	}
	
	@PostMapping
	public ProductHasOrden createProductHasOrden(@RequestBody ProductHasOrden productHasOrden) {
		return productHasOrdenRepository.save(productHasOrden);
	}

	@DeleteMapping("{id}")
	public void deleteProductHasOrden(@PathVariable int id) {
		ProductHasOrden productHasOrdenExistente = productHasOrdenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Registro de carrito no encontrada " + id) );
		if(productHasOrdenExistente != null) {
			productHasOrdenRepository.delete(productHasOrdenExistente);
		}
	}

	@PutMapping("{id}")
	public ProductHasOrden updateProductHasOrden(@PathVariable int id, @RequestBody ProductHasOrden productHasOrden) {
		ProductHasOrden productHasOrdenExistente = productHasOrdenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Registro de carrito no encontrada " + id) );
		productHasOrdenExistente.setProductHasOrdenId(productHasOrden.getProductHasOrdenId());
		productHasOrdenRepository.save(productHasOrdenExistente);
		return productHasOrdenExistente;
		
		}
	}
	
