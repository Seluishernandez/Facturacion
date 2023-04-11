package com.eoi.Facturacion.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Producto {
    @Id
    private Integer id;
    private String nombre;
}