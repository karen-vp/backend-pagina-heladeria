package com.heladeria.app.mapper;


import com.heladeria.app.dto.UsuarioDto;
import com.heladeria.app.entity.Usuario;

public class UsuarioMapper {

		UsuarioDto customerDto;
		Usuario customer;
		
		/**
		 * Convierte un objeto de tipo Usuario a UsuarioDto
		 * @param customer
		 * @return customerDto
		 */
		public static UsuarioDto mapToUsuarioDto(Usuario usuario) {
			UsuarioDto usuarioDto = new UsuarioDto();
			
			usuarioDto.setUsuarioId( usuario.getUsuarioId() );
			usuarioDto.setNombreUsuario( usuario.getNombreUsuario() );
			usuarioDto.setEmailUsuario( usuario.getEmailUsuario() );
			usuarioDto.setContraseña( "***" );
			usuarioDto.setTelefono( usuario.getTelefono() );
			usuarioDto.setUbicacion( usuario.getUbicacion() );
					
			return usuarioDto;
		}
		
		/**
		 * Convierte un objeto de tipo UsuarioDto a Usuario
		 * @param customerDto
		 * @return customer
		 */
		public static Usuario mapToUsuario(UsuarioDto usuarioDto) {
			Usuario usuario = new Usuario();
			
			usuario.setUsuarioId( usuarioDto.getUsuarioId() );
			usuario.setNombreUsuario( usuarioDto.getNombreUsuario() );
			usuario.setEmailUsuario( usuarioDto.getEmailUsuario() );
			usuario.setContraseña( usuarioDto.getContraseña() );
			usuario.setTelefono( usuarioDto.getTelefono() );
			usuario.setUbicacion( usuarioDto.getUbicacion() );
			
			return usuario;
		}
		
		/**
		 * Convierte un objeto de tipo UsuarioDto a Usuario
		 * @param usuarioDto
		 * @return usuario
		 */
		public static Usuario mapToUsuario(UsuarioDto usuarioDto, Usuario usuario) {
				
			usuario.setUsuarioId( usuarioDto.getUsuarioId() );
			usuario.setNombreUsuario( usuarioDto.getNombreUsuario() );
			usuario.setEmailUsuario( usuarioDto.getEmailUsuario() );
			usuario.setContraseña( usuarioDto.getContraseña() );
			usuario.setTelefono( usuarioDto.getTelefono() );
			usuario.setUbicacion( usuarioDto.getUbicacion() );
			
			return usuario;
		}
}
