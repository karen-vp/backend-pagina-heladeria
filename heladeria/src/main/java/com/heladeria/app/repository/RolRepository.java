package com.heladeria.app.repository;
import org.springframework.data.repository.CrudRepository;
import com.heladeria.app.entity.Rol;

public interface RolRepository extends CrudRepository<Rol, Integer> {
  Rol findById(int id);
}

