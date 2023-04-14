package com.eoi.Facturacion.controladores;
import com.eoi.Facturacion.entidades.Customer;
import com.eoi.Facturacion.servicios.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;
    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Customer> findById(@PathVariable Long id) {
        return customerService.findById(id);
    }
    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        customerService.deleteById(id);
    }
}
