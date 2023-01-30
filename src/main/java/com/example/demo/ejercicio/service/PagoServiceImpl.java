package com.example.demo.ejercicio.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.modelo.Pago;
import com.example.demo.ejercicio.modelo.Pago;
import com.example.demo.ejercicio.repository.IPagoRepo;

@Service
public class PagoServiceImpl implements IPagoService {

	@Autowired
	private IPagoRepo iPagoRepo;
	
	@Override
	public void realizar(Pago pago) {
		// TODO Auto-generated method stub		
		this.iPagoRepo.insertar(pago);
	}

	@Override
	public Pago buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPagoRepo.buscar(id);
	}

}
