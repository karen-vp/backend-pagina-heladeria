package com.heladeria.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.heladeria.app.entity.Categoria;


public interface CategoriaRepository extends CrudRepository<Categoria, Integer>{
	Categoria findById(int id);
}