package com.heladeria.app.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.heladeria.app.entity.Usuario;



// STEP 12 Crear la clase que implementa la interfaz UserDetails
public class UserDetailsImpl implements UserDetails {

	private Usuario usuario;
	

	public UserDetailsImpl(Usuario usuario) {		
		this.usuario = usuario;
	}

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		List<GrantedAuthority> authorities = new ArrayList<>();
//		
//		authorities.add(  new SimpleGrantedAuthority("ROLE_ADMIN") );
//		//authorities.add(  new SimpleGrantedAuthority("ROLE_CUSTOMER") );
//		return authorities;
//	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	    List<GrantedAuthority> authorities = new ArrayList<>();
	    String rolConPrefijo = "ROLE_" + usuario.getRol().getRolNombre().toUpperCase();
	    authorities.add(new SimpleGrantedAuthority(rolConPrefijo));
	    return authorities;
	}
	

	@Override
	public String getPassword() {
		return usuario.getContraseña();
	}

	@Override
	public String getUsername() {
		return usuario.getEmailUsuario();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}
