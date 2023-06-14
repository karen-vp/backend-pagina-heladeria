package com.heladeria.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.heladeria.app.entity.Orden;
import com.heladeria.app.repository.OrdenRepository;
import com.heladeria.app.service.OrdenService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OrdenServiceImpl implements OrdenService{
	
	OrdenRepository ordenRepository;
	
	@Override
	public List<Orden> getAllOrdenes() {
		// TODO Auto-generated method stub
		List<Orden> ordenes = ordenRepository.findAll();
		return ordenes;
	}

	@Override
	public Orden createOrden(Orden orden) {
		// TODO Auto-generated method stub
		return ordenRepository.save(orden);
	}

	@Override
	public void deleteOrden(int id) {
		// TODO Auto-generated method stub
		Orden orden = ordenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Orden no encontrada " + id) );
	    if (orden!= null) {
	    	ordenRepository.delete(orden);
	    }
	}

	@Override
	public Orden updateOrden(int id, Orden orden) {
		// TODO Auto-generated method stub
		Orden ordenExistente = ordenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Orden no encontrada " + id) );
		ordenExistente.setUsuarioId(orden.getUsuarioId());
		ordenRepository.save(ordenExistente);
		return ordenExistente;
	}

	@Override
	public Orden getOrdenById(int id) {
		// TODO Auto-generated method stub
		Orden orden = ordenRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("Orden no encontrada " + id) );;
		return orden;
	}

}
