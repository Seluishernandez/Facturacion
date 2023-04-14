package com.eoi.Facturacion.controladores;

import com.eoi.Facturacion.entidades.Customer;
import com.eoi.Facturacion.servicios.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer") //al ponerlo entes de la calse, cualquier metodo que tenga esta clase, va a tener prefijo.
public class CustomerController {
    @Autowired //no necesitamos crear una instancia de CustomerService porque spring lo hace automaticamente
    private CustomerService customerService;
    //Para acceder a laos metodos avanzados del servicio

    @GetMapping(value = {"/",""})
    //Model es el objeto que Spring usa para pasar ala vista (html) las variables que queremos
    public String showCustomers(Model model) {
        model.addAttribute("customer", customerService.findAll());

        return "customer-list"; // Devuelve el nombre de la vista(html) que queremos mostrar
    }
    @GetMapping("/new")
    public String showNewCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }
    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "redirect:/customer/";
    }
    @GetMapping("/edit/{id}")
    public String showEditCustomerForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "customer-form"; //necesiatamso la pantilla de form para introducir datos
    }
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") Long id) {
        customerService.deleteById(id);
        return "redirect:/customer/";
    }




}
