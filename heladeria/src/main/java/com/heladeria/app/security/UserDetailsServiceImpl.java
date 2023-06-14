package com.heladeria.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.heladeria.app.entity.Usuario;
import com.heladeria.app.repository.UsuarioRepository;



//STEP 9 Crear la implementación de la interfaz UserDetailsService
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	// STEP 10 Leer el usuario de la solicitud HTTP de la DB
	@Override
	public UserDetails loadUserByUsername(String emailUsuario) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioRepository.findByEmailUsuario(emailUsuario)
				.orElseThrow( ()-> new UsernameNotFoundException("User not found with email " + emailUsuario));
		
		
		return  new UserDetailsImpl(usuario); 
	}
	
	

}
