package com.heladeria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.heladeria.app.entity.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	Categoria findById(int id);
}