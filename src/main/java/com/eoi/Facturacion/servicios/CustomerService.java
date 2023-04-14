package com.eoi.Facturacion.servicios;

import com.eoi.Facturacion.entidades.Customer;
import com.eoi.Facturacion.repositorios.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired //Inyección de dependencias:accede al repositorio para guardar los objetos
    private CustomerRepository customerRepository;


    //Implementacion de metodos principales que se usan al entrar en el CRUD
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    //Null pointer; la direccion de memeoria a la que se intenta acceder está vacia
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }



    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }




}