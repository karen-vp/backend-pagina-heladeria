package com.heladeria.app.service;

import java.util.List;

import com.heladeria.app.entity.Orden;

public interface OrdenService {

	List<Orden> getAllOrdenes();

	Orden getOrdenById(int id);

	Orden createOrden(Orden orden);

	void deleteOrden(int id);

	Orden updateOrden(int id, Orden orden);

}
