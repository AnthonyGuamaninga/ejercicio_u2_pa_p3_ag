package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio.modelo.Automovil;
import com.example.demo.ejercicio.modelo.Cliente;
import com.example.demo.ejercicio.modelo.Renta;
import com.example.demo.ejercicio.service.IAutomovilService;
import com.example.demo.ejercicio.service.IClienteService;
import com.example.demo.ejercicio.service.IRentaService;

@SpringBootApplication
public class EjercicioU2PaP3AgApplication implements CommandLineRunner {

	@Autowired
	private IAutomovilService automovilService;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IRentaService iRentaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// FUNCIONALIDAD 1
		Automovil automovil = new Automovil();
		automovil.setPlaca("PDF-1217");
		automovil.setValorDia(new BigDecimal(200));
		this.automovilService.crear(automovil);

		Cliente cliente = new Cliente();
		cliente.setCedula("1238");
		cliente.setNombre("Anthony");
		cliente.setRenta(null);
		this.clienteService.registrar(cliente);

		
		
		// FUNCIONALIDAD 2
		this.iRentaService.realizar(automovil.getPlaca(), cliente.getCedula(), 5, "2222");
		
		
		// FUNCIONALIDAD 3
		this.automovilService.buscar(automovil.getPlaca());
		this.clienteService.buscar(cliente.getCedula());
		

		// FUNCIONALIDAD 4
		
		this.iRentaService.borrar(1);
		
	}

}
