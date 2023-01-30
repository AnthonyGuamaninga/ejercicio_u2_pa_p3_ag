package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.modelo.Pago;

public interface IRentaService {

	public void realizar(Pago pago);
	public Pago buscar(Integer id);
	
}
