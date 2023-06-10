package com.heladeria.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.heladeria.app.entity.Orden;


public interface OrdenRepository extends CrudRepository<Orden, Integer>{
	Orden findById(int id);
}

