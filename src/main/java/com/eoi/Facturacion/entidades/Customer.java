package com.eoi.Facturacion.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

    public class Customer {
    @Id
    private Integer id;
    private String nombre;
}
