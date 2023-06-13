package com.heladeria.app.service.impl;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.heladeria.app.dto.UsuarioDto;
import com.heladeria.app.entity.Rol;
import com.heladeria.app.entity.Usuario;
import com.heladeria.app.exceptions.HeladeriaAppException;
import com.heladeria.app.mapper.UsuarioMapper;
import com.heladeria.app.repository.RolRepository;
import com.heladeria.app.repository.UsuarioRepository;
import com.heladeria.app.service.UsuarioService;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.function.Supplier;

@AllArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {

	UsuarioRepository usuarioRepository;

	RolRepository rolRepository;
	
	// CRUD usando UsuarioDto

	@Override
	public List<UsuarioDto> getAllUsuarios() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios.stream().map(usuario -> UsuarioMapper.mapToUsuarioDto(usuario)).collect(Collectors.toList());
	}

	@Override
	public UsuarioDto createUsuarioCliente(UsuarioDto usuarioDto) {
		// TODO Verificar si el email existe
		// TODO Verificar que los atributos estén dentro de los parámetros establecido.
		Usuario usuario = UsuarioMapper.mapToUsuario(usuarioDto);
		usuario.setUsuarioId(0);

		Rol rol = rolRepository.findById(2);
		if (rol != null) {
			usuario.setRol(rol);
			Usuario savedUsuario = usuarioRepository.save(usuario);
			return UsuarioMapper.mapToUsuarioDto(savedUsuario);
		} else {
			throw new HeladeriaAppException(HttpStatus.BAD_REQUEST, "El rol con ID " + 2 + " no existe.");
		}
	}
	
	@Override
	public UsuarioDto getUsuarioById(int id) {
		Usuario existingUsuario = usuarioRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Usuario no encontrado " + id));
		return UsuarioMapper.mapToUsuarioDto(existingUsuario);
	}
	
	@Override
	public UsuarioDto updateUsuario(UsuarioDto usuarioDto) {
		Usuario existingUsuario = findUsuarioById(usuarioDto.getUsuarioId());
		existingUsuario = UsuarioMapper.mapToUsuario(usuarioDto, existingUsuario);
		usuarioRepository.save( existingUsuario );
		return UsuarioMapper.mapToUsuarioDto(existingUsuario);
	}
	
	@Override
	public void deleteUsuario(int id) {
		Usuario existingUsuario = findUsuarioById(id);
		if (existingUsuario != null) {
			usuarioRepository.delete(existingUsuario);
		}
	}
	
	@Override
	public Usuario findUsuarioById(int id) {
		Usuario existingUsuario = usuarioRepository.findById(id)
				.orElseThrow( ()-> new IllegalStateException("User does not exist with id " + id) );				
		return existingUsuario;
	}

	// CRUD usando Usuario
	
//	@Override
//    public List<Usuario> getAllUsuarios() {
//    List<Usuario> usuarios=  usuarioRepository.findAll();
//    return usuarios;
//    }

//	@Override
//	public Usuario createUsuario(Usuario usuario) {
//		return usuarioRepository.save(usuario);
//	}

//	@Override
//	public void deleteUsuario(int id) {
//		Usuario usuario = usuarioRepository.findById(id);
//		if (usuario != null) {
//			usuarioRepository.delete(usuario);
//		}
//	}

//	@Override
//	public String updateUsuario(int id, Usuario usuario) {
//		Usuario usuarioExistente = usuarioRepository.findById(id);
//		usuarioExistente.setNombreUsuario(usuario.getNombreUsuario());
//		usuarioExistente.setEmailUsuario(usuario.getEmailUsuario());
//		usuarioExistente.setContraseña(usuario.getContraseña());
//		usuarioExistente.setTelefono(usuario.getTelefono());
//		usuarioExistente.setUbicacion(usuario.getUbicacion());
//
//		usuarioRepository.save(usuarioExistente);
//		return "El usuario se actualizo correctamente";
//	}

//	@Override
//	public Usuario getUsuarioById(int id) {
//		Usuario usuario = usuarioRepository.findById(id);
//		return usuario;
//	}

}
