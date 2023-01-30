package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.modelo.Renta;

public interface IRentaService {

	public void realizar(String placa, String cedula, Integer numeroDias, String numeroTarjeta);
	public Renta buscar(Integer id);
	public void borrar(Integer id);
	
}
