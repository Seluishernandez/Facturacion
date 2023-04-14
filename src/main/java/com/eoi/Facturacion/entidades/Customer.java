package com.eoi.Facturacion.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
    public class Customer {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String nombre;

    @OneToMany(mappedBy = "invoiceToCustomer",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Factura> invoiceList = new ArrayList<>();

}
