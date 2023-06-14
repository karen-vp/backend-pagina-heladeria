package com.heladeria.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.heladeria.app.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Optional<Usuario> findByEmailUsuario(String emailUsuario);
	Optional<Usuario> findById(int id);

}
