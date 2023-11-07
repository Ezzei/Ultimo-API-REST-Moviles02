package com.cibertec.entity;

import jakarta.persistence.Column;
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
    @Column(name = "codigoVisita")
	private int codigoVisita;
    
    @Column(name = "nombre")
	private String nombre;
    
    @Column(name = "fechaVisita")
	private String fechaVisita;
    
    @Column(name = "observaciones")
	private String observaciones;
    
    @Column(name = "estadoVisita")
	private String estadoVisita;

}
