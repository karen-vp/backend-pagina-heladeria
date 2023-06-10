package com.heladeria.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heladeria.app.entity.Usuario;
import com.heladeria.app.service.UsuarioService;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	@GetMapping
    public List<Usuario> getAllUsuarios() {
    List<Usuario> usuarios=  usuarioService.getAllUsuarios();
    return usuarios;
    }
}
  