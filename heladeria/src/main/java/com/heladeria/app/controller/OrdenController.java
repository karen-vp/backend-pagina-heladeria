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

import com.heladeria.app.entity.Orden;
import com.heladeria.app.repository.OrdenRepository;

@RestController
@RequestMapping("api/ordenes")
public class OrdenController {
	
@Autowired
OrdenRepository ordenRepository;
	
	@GetMapping
	public List<Orden> getAllOrdenes() {
		// TODO Auto-generated method stub
		List<Orden> ordenes = ordenRepository.findAll();
		return ordenes;
	}
	
	@GetMapping("{id}")
	public Orden getOrdenById(@PathVariable int id) {
		// TODO Auto-generated method stub
		Orden orden = ordenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Orden no encontrada " + id) );;
		return orden;
	}

	@PostMapping
	public Orden createOrden(@RequestBody Orden orden) {
		// TODO Auto-generated method stub
		return ordenRepository.save(orden);
	}

	@DeleteMapping("{id}")
	public void deleteOrden(@PathVariable int id) {
		// TODO Auto-generated method stub
		Orden orden = ordenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Orden no encontrada " + id) );
	    if (orden!= null) {
	    	ordenRepository.delete(orden);
	    }
	}

	@PutMapping("{id}")
	public Orden updateOrden(@PathVariable int id, @RequestBody Orden orden) {
		// TODO Auto-generated method stub
		Orden ordenExistente = ordenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Orden no encontrada " + id) );
		ordenExistente.setUsuarioId(orden.getUsuarioId());
		ordenRepository.save(ordenExistente);
		return ordenExistente;
	}



}
