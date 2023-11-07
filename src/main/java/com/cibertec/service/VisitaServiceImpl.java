package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Visita;
import com.cibertec.repository.VisitaRepository;

@Service
public class VisitaServiceImpl implements VisitaService{
	
	@Autowired
	VisitaRepository repo;

	@Override
	public List<Visita> listaVisita() {
		return repo.findAll();
	}

	@Override
	public Visita insertaActualizaVisita(Visita obj) {
		return repo.save(obj);
	}

	@Override
	public void eliminarVisita(int codigoVisita) {
		repo.deleteById(codigoVisita);
	}

}
