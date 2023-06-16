package com.heladeria.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.heladeria.app.entity.Categoria;
import com.heladeria.app.service.CategoriaService;


@RestController
@RequestMapping("api/categorias")
@CrossOrigin(origins = "*")
public class CategoriaController {
	@Autowired
	CategoriaService categoriaService;
	@GetMapping
    public List<Categoria> getAllCategorias() {
    List<Categoria> categorias=  categoriaService.getAllCategorias();
    return categorias;
    }
	@PostMapping
	public Categoria createCategoria(@RequestBody Categoria categoria) {
		return categoriaService.createCategoria(categoria);
	}
	
	@DeleteMapping("{id}")  
	public String deleteCategoria(@PathVariable int id) {
		categoriaService.deleteCategoria(id);
		return "La categoria se borró correctamente!";
	}
	
	@PutMapping("{id}")
    public String updateCategoria(@PathVariable int id, @RequestBody Categoria categoria) {
		categoriaService.updateCategoria(id, categoria);
        return "Categoria actualizada exitosamente";
    }
	
	@GetMapping("{id}")  
    public Categoria getCategoriaById(@PathVariable  int id) {
		return categoriaService.getCategoriaById(id);
    }
}