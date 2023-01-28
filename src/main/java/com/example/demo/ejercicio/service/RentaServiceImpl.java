package com.example.demo.ejercicio.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.modelo.Pago;
import com.example.demo.ejercicio.modelo.Renta;
import com.example.demo.ejercicio.repository.IAutomovilRepo;
import com.example.demo.ejercicio.repository.IClienteRepo;
import com.example.demo.ejercicio.repository.IRentaRepo;

@Service
public class RentaServiceImpl implements IRentaService {

	@Autowired
	private IRentaRepo iRentaRepo;
	@Autowired
	private IAutomovilRepo automovilRepo;
	@Autowired
	private IClienteRepo clienteRepo;
	
	@Override
	public void realizar(String placa, String cedula, Integer numeroDias, String numeroTarjeta) {
		// TODO Auto-generated method stub
		Renta renta = new Renta();
		renta.setFecha(LocalDateTime.now());
		renta.setNumeroDias(numeroDias);
		renta.setValor(new BigDecimal(200));
		renta.setAutomovil(this.automovilRepo.buscar(placa));
		renta.setCliente(this.clienteRepo.buscar(cedula));
		
		Pago pago = new Pago();
		pago.setNumeroTarjeta(numeroTarjeta);
		pago.setRenta(renta);
		pago.setValor((renta.getValor().add(renta.getValor().multiply(new BigDecimal(0.05) ))));
		
		this.iRentaRepo.insertar(renta);
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iRentaRepo.buscar(id);
	}

}
