package com.cibertec.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoCliente")
    private int codigoCliente;
    
    @Column(name = "nombreCompleto")
    private String nombreCompleto;
    
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    
    @Column(name = "numeroDocumento")
    private String numeroDocumento;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "direccionEntrega")
    private String direccionEntrega;
}

