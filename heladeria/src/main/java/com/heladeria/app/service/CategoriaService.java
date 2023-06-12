package com.heladeria.app.service;
import java.util.List;

import com.heladeria.app.entity.Categoria;


public interface CategoriaService {
	
	List<Categoria> getAllCategorias();
	
	Categoria createCategoria(Categoria categoria);
	
	void deleteCategoria(int id); 
	
	String updateCategoria (int id, Categoria categoria);
	
	Categoria getCategoriaById(int id); 
	
}
