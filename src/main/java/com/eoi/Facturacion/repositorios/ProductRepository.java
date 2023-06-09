package com.eoi.Facturacion.repositorios;

import com.eoi.Facturacion.entidades.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(String name);
}

