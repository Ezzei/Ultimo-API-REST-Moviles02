package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Cliente;
import com.cibertec.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository; // Suponiendo que tienes un repositorio de clientes

    //@Override
    //public List<Cliente> listaClienteOrdenada() {
        // Realiza la lógica para obtener la lista de clientes ordenada
   //     return clienteRepository.listaClienteOrdenada(); // Suponiendo que tienes un método en el repositorio para la consulta
    //}
    
    @Override
    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }
 
    //Metodo registrar y actualizar
	@Override
	public Cliente insertaActualizaCliente(Cliente obj) {
		return clienteRepository.save(obj);
	}

	@Override
	public void eliminarCliente(int codigoCliente) {
		clienteRepository.deleteById(codigoCliente);
		
	}



}