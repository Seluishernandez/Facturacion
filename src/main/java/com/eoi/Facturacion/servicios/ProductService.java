package com.eoi.Facturacion.servicios;

import com.eoi.Facturacion.entidades.Product;
import com.eoi.Facturacion.repositorios.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ProductService {
    @Autowired //Inyección de dependencias:accede al repositorio para guardar los objetos
    private ProductRepository productRepository;


    //Implementacion de metodos principales que se usan al entrar en el CRUD
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    //Null pointer; la direccion de memeoria a la que se intenta acceder está vacia
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Optional<Product> findByName(String name){
        return productRepository.findByName(name);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }




}