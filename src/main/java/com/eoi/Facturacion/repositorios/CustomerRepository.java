package com.eoi.Facturacion.repositorios;

import com.eoi.Facturacion.entidades.Customer;
import com.eoi.Facturacion.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

