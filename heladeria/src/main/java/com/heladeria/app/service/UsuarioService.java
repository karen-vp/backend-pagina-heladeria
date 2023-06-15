package com.heladeria.app.service;
import java.util.List;

import com.heladeria.app.dto.UsuarioDto;
import com.heladeria.app.entity.Usuario;

public interface UsuarioService {

	
//CRUD usando Usuario
	
	List<Usuario> getAllUsuarios();
	
	Usuario createUsuarioCliente(Usuario usuario);
	
	void deleteUsuario(int id); 
	
	String updateUsuario (int id, Usuario usuario);
	
	Usuario getUsuarioById(int id); 
}
