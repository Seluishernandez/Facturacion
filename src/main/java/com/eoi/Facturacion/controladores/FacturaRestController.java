package com.eoi.Facturacion.controladores;
import com.eoi.Facturacion.entidades.Factura;
import com.eoi.Facturacion.entidades.Product;
import com.eoi.Facturacion.servicios.FacturaService;
import com.eoi.Facturacion.servicios.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/factura")
public class FacturaRestController {
    @Autowired
    private FacturaService facturaService;
    @GetMapping
    public List<Factura> findAll() {
        return facturaService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Factura> findById(@PathVariable Long id) {
        return facturaService.findById(id);
    }
    @PostMapping
    public Factura save(@RequestBody Factura factura) {
        return facturaService.save(factura);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        facturaService.deleteById(id);
    }
}
