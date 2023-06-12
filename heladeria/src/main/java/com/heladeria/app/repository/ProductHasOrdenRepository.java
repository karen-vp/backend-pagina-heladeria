package com.heladeria.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.heladeria.app.entity.ProductHasOrden;


public interface ProductHasOrdenRepository extends JpaRepository<ProductHasOrden, Integer>{
	Optional<ProductHasOrden> findById(int id);
}
