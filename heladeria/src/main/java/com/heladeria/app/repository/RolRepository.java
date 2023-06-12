package com.heladeria.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.heladeria.app.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer> {
  Rol findById(int id);
}

