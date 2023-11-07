package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Producto;
import com.cibertec.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	ProductoRepository repo;

	@Override
	public List<Producto> listaCliente() {
		return repo.findAll();
	}

	@Override
	public Producto insertaActualizaProducto(Producto obj) {
		return repo.save(obj);
	}

	@Override
	public void eliminarProducto(int codigoProducto) {
		repo.deleteById(codigoProducto);
	}

}
