package com.example.demo.ejercicio.repository;

import com.example.demo.ejercicio.modelo.Cliente;

public interface IClienteRepo {
	
	public void insertar(Cliente cliente);
	public Cliente buscar(String cedula);

}
