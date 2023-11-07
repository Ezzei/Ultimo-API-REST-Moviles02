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
    @Column(name = "codigo_visita")
	private Integer codigoVisita;
    
    @Column(name = "nombre")
	private String nombre;
    
    @Column(name = "fecha")
	private String fecha;
    
    @Column(name = "observaciones")
	private String observaciones;
    
    @Column(name = "estado")
	private String estado;

}
