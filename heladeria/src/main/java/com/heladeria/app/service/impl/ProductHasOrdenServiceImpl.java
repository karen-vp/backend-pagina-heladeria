package com.heladeria.app.service.impl;

import java.util.List;

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
	public List<ProductHasOrden> getAllProductHasOrden() {
		// TODO Auto-generated method stub
		List<ProductHasOrden> productHasOrden = productHasOrdenRepository.findAll();
		return productHasOrden;
	}

	@Override
	public ProductHasOrden getProductHasOrdenById(int id) {
		// TODO Auto-generated method stub
		ProductHasOrden productHasOrden = productHasOrdenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("productHasOrden no encontrada " + id) );;
				return productHasOrden;
		
	}

	@Override
	public ProductHasOrden createProductHasOrden(ProductHasOrden productHasOrden) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductHasOrden(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductHasOrden updateProductHasOrden(int id, ProductHasOrden productHasOrden) {
		// TODO Auto-generated method stub
		return null;
	}

}
