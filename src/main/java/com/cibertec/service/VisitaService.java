package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Visita;

public interface VisitaService {
	
	public abstract List<Visita> listaVisita();
	public abstract Visita insertaActualizaVisita(Visita obj);
	public abstract void eliminarVisita(int cod);

}
