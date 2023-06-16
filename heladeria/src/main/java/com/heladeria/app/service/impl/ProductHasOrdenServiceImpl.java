package com.heladeria.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.heladeria.app.entity.ProductHasOrden;
import com.heladeria.app.exceptions.HeladeriaAppException;
import com.heladeria.app.repository.OrdenRepository;
import com.heladeria.app.repository.ProductHasOrdenRepository;
import com.heladeria.app.service.ProductHasOrdenService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductHasOrdenServiceImpl implements ProductHasOrdenService {

	ProductHasOrdenRepository productHasOrdenRepository;

	@Override
	public ProductHasOrden getProductOrdenById(int id) {

		ProductHasOrden productHasOrdenExistente = productHasOrdenRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("Registro de carrito no encontrada " + id));
		return productHasOrdenExistente;
	}

	@Override
	public List<ProductHasOrden> getAllProductHasOrden() {

		List<ProductHasOrden> productHasOrden = productHasOrdenRepository.findAll();
		if (productHasOrden != null) {
			return productHasOrden;
		} else {
			throw new HeladeriaAppException(HttpStatus.NOT_FOUND, "No se encontro la lista de carrito");
		}

	}

	@Override
	public List<ProductHasOrden> getProductHasOrdenByOrdenId(int id) {

		List<ProductHasOrden> productHasOrden = productHasOrdenRepository.findByOrderId(id);
		if (productHasOrden != null) {
			return productHasOrden;
		} else {
			throw new HeladeriaAppException(HttpStatus.NOT_FOUND, "No se encontro la lista de carrito");
		}

	}

	@Override
	public ProductHasOrden createProductHasOrden(ProductHasOrden productHasOrden) {
		return productHasOrdenRepository.save(productHasOrden);
	}

	@Override
	public void deleteProductHasOrden(int id) {

		ProductHasOrden productHasOrdenExistente = productHasOrdenRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("Registro de carrito no encontrada " + id));
		if (productHasOrdenExistente != null) {
			productHasOrdenRepository.delete(productHasOrdenExistente);
		}

	}

	@Override
	public ProductHasOrden updateProductHasOrden(int id, ProductHasOrden productHasOrden) {
		
		ProductHasOrden productHasOrdenExistente = productHasOrdenRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("Registro de carrito no encontrada " + id));
		if (productHasOrdenExistente != null) {

//			productHasOrdenExistente.setProductHasOrdenId(productHasOrden.getProductHasOrdenId());
			productHasOrdenExistente.setCantidadProducto(productHasOrden.getCantidadProducto());
			productHasOrdenExistente.setOrden(productHasOrden.getOrden());
			productHasOrdenExistente.setProducto(productHasOrden.getProducto());
			productHasOrdenRepository.save(productHasOrdenExistente);
			return productHasOrdenExistente;
		} else {

			throw new HeladeriaAppException(HttpStatus.NOT_FOUND, "No se encontro la lista de carrito");

		}

	}

}
