package com.example.demo.ejercicio.repository;

import com.example.demo.ejercicio.modelo.Renta;

public interface IRentaRepo {
	
	public void insertar(Renta renta);
	public Renta buscar(Integer id);

}
