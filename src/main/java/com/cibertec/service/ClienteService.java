package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Cliente;

public interface ClienteService {
	
	//public abstract List<Cliente> listaClienteOrdenada();
    public abstract List<Cliente> obtenerTodosLosClientes();
    public abstract Cliente insertaActualizaCliente(Cliente obj);
    public abstract void eliminarCliente(int cod);

}
