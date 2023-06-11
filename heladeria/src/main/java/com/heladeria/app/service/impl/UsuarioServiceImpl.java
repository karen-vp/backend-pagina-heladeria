package com.heladeria.app.service.impl;

import java.util.*;


import org.springframework.stereotype.Service;

import com.heladeria.app.entity.Usuario;
import com.heladeria.app.repository.UsuarioRepository;
import com.heladeria.app.service.UsuarioService;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	UsuarioRepository usuarioRepository;
	@Override
    public List<Usuario> getAllUsuarios() {
    List<Usuario> usuarios=  usuarioRepository.findAll();
    return usuarios;
    }
	
	@Override
	 public Usuario createUsuario (Usuario usuario) {
		 return usuarioRepository.save(usuario);
	}
	
	@Override
	public void deleteUsuario(int id) {
	    Usuario usuario = usuarioRepository.findById(id);
	    if (usuario != null) {
	        usuarioRepository.delete(usuario);
	    }
	}
	
	@Override
	public String  updateUsuario(int id, Usuario usuario) {
	    Usuario usuarioExistente = usuarioRepository.findById(id);
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
	    Usuario usuario = usuarioRepository.findById(id);
	    return usuario;
	}

	
	
}
