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
@Table(name = "visita")
public class Visita {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoVisita;
	private String nombre;
	private String fechaVisita;
	private String observaciones;
	private String estadoVisita;

}
