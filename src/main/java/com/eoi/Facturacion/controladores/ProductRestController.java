package com.eoi.Facturacion.controladores;
import com.eoi.Facturacion.entidades.Product;
import com.eoi.Facturacion.servicios.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/api/products")
    public class ProductRestController {
        @Autowired
        private ProductService productService;
        @GetMapping
        public List<Product> findAll() {
            return productService.findAll();
        }
        @GetMapping("/{id}")
        public Optional<Product> findById(@PathVariable Long id) {
            return productService.findById(id);
        }
        @PostMapping
        public Product save(@RequestBody Product product) {
            return productService.save(product);
        }
        @DeleteMapping("/{id}")
        public void deleteById(@PathVariable Long id) {
            productService.deleteById(id);
        }
    }

