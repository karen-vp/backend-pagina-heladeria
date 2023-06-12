package com.heladeria.app.service;
import java.util.List;

import com.heladeria.app.dto.UsuarioDto;
import com.heladeria.app.entity.Usuario;

public interface UsuarioService {
	
// CRUD usando UsuarioDto
	List<UsuarioDto> getAllUsuarios();
	
	UsuarioDto createUsuarioCliente(UsuarioDto usuarioDto);
	
//	UsuarioDto getUsuarioById(int id);
//CRUD usando Usuario
	
//	List<Usuario> getAllUsuarios();
	
	Usuario createUsuario(Usuario usuario);
	
	void deleteUsuario(int id); 
	
	String updateUsuario (int id, Usuario usuario);
	
	//Usuario getUsuarioById(int id); 
}