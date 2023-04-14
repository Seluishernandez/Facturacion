package com.eoi.Facturacion.servicios;

import com.eoi.Facturacion.entidades.Factura;
import com.eoi.Facturacion.entidades.Factura;
import com.eoi.Facturacion.repositorios.FacturaRepository;
import com.eoi.Facturacion.repositorios.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {
    @Autowired //Inyección de dependencias:accede al repositorio para guardar los objetos
    private FacturaRepository facturaRepository;


    //Implementacion de metodos principales que se usan al entrar en el CRUD
    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    //Null pointer; la direccion de memeoria a la que se intenta acceder está vacia
    public Optional<Factura> findById(Long id) {
        return facturaRepository.findById(id);
    }



    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }
    public void deleteById(Long id) {
        facturaRepository.deleteById(id);
    }




}