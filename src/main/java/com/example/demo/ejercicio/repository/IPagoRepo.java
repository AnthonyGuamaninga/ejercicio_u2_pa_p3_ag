package com.example.demo.ejercicio.repository;

import com.example.demo.ejercicio.modelo.Pago;

public interface IPagoRepo {
	
	public void insertar(Pago pago);
	public Pago buscar(Integer id);

}
