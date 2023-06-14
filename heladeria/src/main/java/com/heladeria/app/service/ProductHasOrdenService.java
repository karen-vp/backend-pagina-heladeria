package com.heladeria.app.service;

import java.util.List;


import com.heladeria.app.entity.ProductHasOrden;

public interface ProductHasOrdenService {

	List<ProductHasOrden> getAllProductHasOrden();

	ProductHasOrden getProductHasOrdenById(int id);
	
	List<ProductHasOrden> getProductHasOrdenByOrdenId(int id);

	ProductHasOrden createProductHasOrden(ProductHasOrden productHasOrden);

	void deleteProductHasOrden(int id);

	ProductHasOrden updateProductHasOrden(int id, ProductHasOrden productHasOrden);

}
