package com.heladeria.app.service;
import java.util.List;

import com.heladeria.app.entity.Usuario;

public interface UsuarioService {
	List<Usuario> getAllUsuarios();
	
	Usuario createUsuario(Usuario usuario);
	
	void deleteUsuario(int id); 
	
	String updateUsuario (int id, Usuario usuario);
	
	Usuario getUsuarioById(int id); 
}
