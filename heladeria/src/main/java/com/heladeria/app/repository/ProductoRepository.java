package com.heladeria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.heladeria.app.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	Producto findById(int id);
}
