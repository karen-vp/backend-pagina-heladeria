package com.heladeria.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.heladeria.app.entity.Producto;

public interface ProductRepository extends CrudRepository<Producto, Integer>{
	Producto findById(int id);
}
