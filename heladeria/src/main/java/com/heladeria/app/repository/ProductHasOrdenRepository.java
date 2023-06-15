package com.heladeria.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.heladeria.app.entity.ProductHasOrden;


public interface ProductHasOrdenRepository extends JpaRepository<ProductHasOrden, Integer>{
	
	@Query(value="SELECT * FROM productos_has_ordenes WHERE orden_id = ?", nativeQuery=true)
	List<ProductHasOrden> findByOrderId(int id);
}
