package com.heladeria.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.heladeria.app.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	Optional<Usuario> findById(int id);

}
