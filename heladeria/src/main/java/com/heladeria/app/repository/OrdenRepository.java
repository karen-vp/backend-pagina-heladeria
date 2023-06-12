package com.heladeria.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.heladeria.app.entity.Orden;


public interface OrdenRepository extends JpaRepository<Orden, Integer>{
	Optional<Orden> findById(int id);
}

