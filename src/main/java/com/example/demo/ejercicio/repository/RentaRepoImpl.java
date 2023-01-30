package com.example.demo.ejercicio.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio.modelo.Renta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RentaRepoImpl implements IRentaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Renta renta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(renta);
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Renta.class, id);
	}

	@Override
	public void eliminar(Integer id){
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
