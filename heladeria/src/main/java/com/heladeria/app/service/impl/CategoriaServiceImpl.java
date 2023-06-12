package com.heladeria.app.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;

import com.heladeria.app.entity.Categoria;
import com.heladeria.app.repository.CategoriaRepository;
import com.heladeria.app.service.CategoriaService;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CategoriaServiceImpl implements CategoriaService {
	
	CategoriaRepository categoriaRepository;
	@Override
    public List<Categoria> getAllCategorias() {
    List<Categoria> categorias=  categoriaRepository.findAll();
    return categorias;
    }
	
	@Override
	 public Categoria createCategoria (Categoria categoria) {
		 return categoriaRepository.save(categoria);
	}
	
	@Override
	public void deleteCategoria(int id) {
		Categoria categoria = categoriaRepository.findById(id);
	    if (categoria!= null) {
	    	categoriaRepository.delete(categoria);
	    }
	}
	
	@Override
	public String  updateCategoria(int id, Categoria  categoria) {
	   Categoria categoriaExistente = categoriaRepository.findById(id);
	    categoriaExistente.setNombreCategoria(categoria.getNombreCategoria());


	    categoriaRepository.save(categoriaExistente);
	    return "La categoria se actualizó correctamente";
	}
	
	@Override
	public Categoria getCategoriaById(int id) {
		Categoria  categoria =  categoriaRepository.findById(id);
	    return categoria;
	}

	
	
}