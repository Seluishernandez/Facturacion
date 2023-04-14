package com.eoi.Facturacion.controladores;

import com.eoi.Facturacion.entidades.Factura;
import com.eoi.Facturacion.servicios.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/factura") //al ponerlo entes de la calse, cualquier metodo que tenga esta clase, va a tener prefijo.
public class FacturaController {
    @Autowired //no necesitamos crear una instancia de FacturaService porque spring lo hace automaticamente
    private FacturaService facturaService;
    //Para acceder a laos metodos avanzados del servicio

    @GetMapping(value = {"/",""})
    //Model es el objeto que Spring usa para pasar ala vista (html) las variables que queremos
    public String showFacturas(Model model) {
        model.addAttribute("factura", facturaService.findAll());

        return "factura-list"; // Devuelve el nombre de la vista(html) que queremos mostrar
    }
    @GetMapping("/new")
    public String showNewFacturaForm(Model model) {
        model.addAttribute("factura", new Factura());
        return "factura-form";
    }
    @PostMapping("/save")
    public String saveFactura(@ModelAttribute("factura") Factura factura) {
        facturaService.save(factura);
        return "redirect:/factura/";
    }
    @GetMapping("/edit/{id}")
    public String showEditFacturaForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("factura", facturaService.findById(id));
        return "factura-form"; //necesiatamso la pantilla de form para introducir datos
    }
    @GetMapping("/delete/{id}")
    public String deleteFactura(@PathVariable("id") Long id) {
        facturaService.deleteById(id);
        return "redirect:/factura/";
    }




}
