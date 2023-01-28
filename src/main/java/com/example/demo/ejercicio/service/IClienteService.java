package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.modelo.Cliente;

public interface IClienteService {

	public void registrar(Cliente cliente);
	public Cliente buscar(String cedula);
	
}
