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
import com.heladeria.app.service.ProductHasOrdenService;

@RestController
@RequestMapping("api/carrito")
@CrossOrigin(origins = "*")
public class ProductHasOrdenController {

	@Autowired
	ProductHasOrdenService productHasOrdenService;
	
	@GetMapping("orden/{id}")
	public List<ProductHasOrden> getProductHasOrdenByOrdenId(@PathVariable int id) {
		List<ProductHasOrden> productHasOrdenExistente = productHasOrdenService.getProductHasOrdenByOrdenId(id);
		return productHasOrdenExistente;
	}
	
	@GetMapping
	public List<ProductHasOrden> getAllProductHasOrden() {
		List<ProductHasOrden> productHasOrden = productHasOrdenService.getAllProductHasOrden();
		return productHasOrden;
	}
	
	@GetMapping("{id}")
	public ProductHasOrden getProductOrdenById(@PathVariable int id) {
		ProductHasOrden productHasOrden = productHasOrdenService.getProductOrdenById(id);
		return productHasOrden;
	}
	
	@PostMapping
	public ProductHasOrden createProductHasOrden(@RequestBody ProductHasOrden productHasOrden) {
		return productHasOrdenService.createProductHasOrden(productHasOrden);
	}

	@DeleteMapping("{id}")
	public void deleteProductHasOrden(@PathVariable int id) {
		 productHasOrdenService.deleteProductHasOrden(id);
				
	}

	@PutMapping("{id}")
	public ProductHasOrden updateProductHasOrden(@PathVariable int id, @RequestBody ProductHasOrden productHasOrden) {
		ProductHasOrden productHasOrdenExistente = productHasOrdenService.updateProductHasOrden(id, productHasOrden);
		return productHasOrdenExistente;
		
		}
	}
	
