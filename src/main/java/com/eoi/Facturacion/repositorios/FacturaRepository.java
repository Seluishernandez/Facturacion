package com.eoi.Facturacion.repositorios;

import com.eoi.Facturacion.entidades.Factura;
import com.eoi.Facturacion.entidades.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FacturaRepository extends JpaRepository<Factura, Long> {

}

