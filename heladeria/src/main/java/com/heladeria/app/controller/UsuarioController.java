package com.heladeria.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heladeria.app.dto.UsuarioDto;
import com.heladeria.app.entity.Usuario;
import com.heladeria.app.service.UsuarioService;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;

	// CRUD usando UsuarioDto

	@GetMapping
	public List<UsuarioDto> getAllUsuarios() {
		return usuarioService.getAllUsuarios();
	}

	@GetMapping("{id}")
	public UsuarioDto getUsuarioById(@PathVariable int id) {
		return usuarioService.getUsuarioById(id);
	}

	@PostMapping("signup")
	public UsuarioDto createUsuarioCliente(@RequestBody UsuarioDto usuarioDto) {
		UsuarioDto savedUsuario = usuarioService.createUsuarioCliente(usuarioDto);
		return savedUsuario;
	}

	@PutMapping("{id}")
    public UsuarioDto updateUsuario(@PathVariable int id, @RequestBody UsuarioDto usuarioDto) {
		usuarioDto.setUsuarioId(id);
        UsuarioDto savedUsuario = usuarioService.updateUsuario(usuarioDto);
        return savedUsuario;
    }

	@DeleteMapping("{id}")
	public String deleteUsuario(@PathVariable int id) {
		usuarioService.deleteUsuario(id);
		return "El usuario se borro correctamente!";
	}

	// CRUD usando Usuario

//	@GetMapping
//    public List<Usuario> getAllUsuarios() {
//    List<Usuario> usuarios=  usuarioService.getAllUsuarios();
//    return usuarios;
//    }

//	
//	@PostMapping
//	public Usuario createUsuario(@RequestBody Usuario usuario) {
//		return usuarioService.createUsuario(usuario);
//	}

//	@DeleteMapping("{id}")  
//	public String deleteUsuario(@PathVariable int id) {
//		usuarioService.deleteUsuario(id);
//		return "El usuario se borro correctamente!";
//	}

//	@PutMapping("{id}")
//    public String updateUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
//        usuarioService.updateUsuario(id, usuario);
//        return "Usuario actualizado exitosamente";
//    }

//	@GetMapping("{id}")  
//    public Usuario getUsuarioById(@PathVariable  int id) {
//		return usuarioService.getUsuarioById(id);
//    }
}
