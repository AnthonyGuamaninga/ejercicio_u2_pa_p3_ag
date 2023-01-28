package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.modelo.Automovil;

public interface IAutomovilService {

	public void crear(Automovil automovil);
	public Automovil buscar(String placa);
	
}
