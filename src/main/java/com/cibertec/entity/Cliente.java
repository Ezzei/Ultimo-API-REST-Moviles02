package com.cibertec.entity;

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
    private int codigoCliente;
    private String nombreCompleto;
    private String tipoDocumento;
    private String numeroDocumento;
    private String correo;
    private String telefono;
    private String direccionEntrega;
}

