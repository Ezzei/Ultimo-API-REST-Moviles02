package com.cibertec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoProducto;
	private String nombre;
	private String descripcion;
	private double precio;
	private int stock;
	private String categoria;

}
