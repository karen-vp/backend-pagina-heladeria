package com.heladeria.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.heladeria.app.entity.Usuario;
import com.heladeria.app.repository.UsuarioRepository;
import com.heladeria.app.service.UsuarioService;

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
}
