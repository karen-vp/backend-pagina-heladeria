package com.heladeria.app.service.impl;

import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.heladeria.app.entity.Rol;
import com.heladeria.app.entity.Usuario;
import com.heladeria.app.exceptions.HeladeriaAppException;
import com.heladeria.app.repository.RolRepository;
import com.heladeria.app.repository.UsuarioRepository;
import com.heladeria.app.service.UsuarioService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {

	UsuarioRepository usuarioRepository;

	RolRepository rolRepository;


	// CRUD usando Usuario

	@Override
	public List<Usuario> getAllUsuarios() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios;
	}

	@Override
	public Usuario createUsuarioCliente(Usuario usuario) {

		usuario.setUsuarioId(0);

		Optional<Usuario> existingUser = usuarioRepository.findByEmailUsuario(usuario.getEmailUsuario());
	    if (existingUser.isPresent()) {
	        throw new HeladeriaAppException(HttpStatus.BAD_REQUEST, "El correo electrónico ya está registrado.");
	    }

		Rol rol = rolRepository.findById(2);
			if (rol != null) {
				usuario.setRol(rol);
					return usuarioRepository.save(usuario);
		} else {
				throw new HeladeriaAppException(HttpStatus.BAD_REQUEST, "El rol con ID " + 2 + " no existe.");
		}
	}

	@Override
	public void deleteUsuario(int id) {
		Usuario usuario = usuarioRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("User does not exist with id " + id));
		if (usuario != null) {
			usuarioRepository.delete(usuario);
		}
	}

	@Override
	public String updateUsuario(int id, Usuario usuario) {
		Usuario usuarioExistente = usuarioRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("User does not exist with id " + id));
		;
		usuarioExistente.setNombreUsuario(usuario.getNombreUsuario());
		usuarioExistente.setEmailUsuario(usuario.getEmailUsuario());
		usuarioExistente.setContraseña(usuario.getContraseña());
		usuarioExistente.setTelefono(usuario.getTelefono());
		usuarioExistente.setUbicacion(usuario.getUbicacion());

		usuarioRepository.save(usuarioExistente);
		return "El usuario se actualizo correctamente";
	}

	@Override
	public Usuario getUsuarioById(int id) {
		Usuario usuario = usuarioRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("User does not exist with id " + id));
		;
		return usuario;
	}

}
