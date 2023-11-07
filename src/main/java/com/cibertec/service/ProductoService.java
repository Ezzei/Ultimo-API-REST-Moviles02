package com.cibertec.service;

import java.util.List;
import com.cibertec.entity.Producto;

public interface ProductoService {
	
	public abstract List<Producto> listaCliente();
	public abstract Producto insertaActualizaProducto(Producto obj);
	public abstract void eliminarProducto(int cod);
	

}
