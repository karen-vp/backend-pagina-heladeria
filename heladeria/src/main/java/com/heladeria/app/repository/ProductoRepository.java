package com.heladeria.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.heladeria.app.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	Producto findById(int id);
	
	@Query(value = "SELECT * FROM productos WHERE nombre_producto LIKE %?%", nativeQuery=true)
	List<Producto> findByNombre(String nombre);
}
