package com.heladeria.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.heladeria.app.entity.ProductHasOrden;
import com.heladeria.app.repository.OrdenRepository;
import com.heladeria.app.repository.ProductHasOrdenRepository;
import com.heladeria.app.service.ProductHasOrdenService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductHasOrdenServiceImpl implements ProductHasOrdenService{

	ProductHasOrdenRepository productHasOrdenRepository;
	
	@Override
	public ProductHasOrden getProductOrdenById(int id) {
		// TODO Auto-generated method stub
		ProductHasOrden productHasOrdenExistente = productHasOrdenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Registro de carrito no encontrada " + id) );
		return productHasOrdenExistente;
	}
	
	@Override
	public List<ProductHasOrden> getAllProductHasOrden() {
		// TODO Auto-generated method stub
		List<ProductHasOrden> productHasOrden = productHasOrdenRepository.findAll();
		return productHasOrden;
	}

	@Override
	public List<ProductHasOrden> getProductHasOrdenByOrdenId(int id) {
		// TODO Auto-generated method stub
		List<ProductHasOrden> productHasOrden = productHasOrdenRepository.findByOrderId(id);
				
		return productHasOrden;
		
	}

	@Override
	public ProductHasOrden createProductHasOrden(ProductHasOrden productHasOrden) {
		// TODO Auto-generated method stub
		return productHasOrdenRepository.save(productHasOrden);
	}

	@Override
	public void deleteProductHasOrden(int id) {
		// TODO Auto-generated method stub
		ProductHasOrden productHasOrdenExistente = productHasOrdenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Registro de carrito no encontrada " + id) );
	    if (productHasOrdenExistente!= null) {
	    	productHasOrdenRepository.delete(productHasOrdenExistente);
	    }
		
	}

	@Override
	public ProductHasOrden updateProductHasOrden(int id, ProductHasOrden productHasOrden) {
		// TODO Auto-generated method stub
		ProductHasOrden productHasOrdenExistente = productHasOrdenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Registro de carrito no encontrada " + id) );
		productHasOrdenExistente.setProductHasOrdenId(productHasOrden.getProductHasOrdenId());
		productHasOrdenRepository.save(productHasOrdenExistente);
		return productHasOrdenExistente;
	}

	


}
