package com.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	@Query("SELECT c FROM Cliente c ORDER BY c.nombreCompleto ASC")
	public abstract List<Cliente> listaClienteOrdenada();


}
