package com.eoi.Facturacion.controladores;

import com.eoi.Facturacion.entidades.Product;
import com.eoi.Facturacion.servicios.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products") //al ponerlo entes de la calse, cualquier metodo que tenga esta clase, va a tener prefijo.
public class ProductController {
    @Autowired //no necesitamos crear una instancia de ProductService porque spring lo hace automaticamente
    private ProductService productService;
    //Para acceder a laos metodos avanzados del servicio

    @GetMapping("/")
    //Model es el objeto que Spring usa para pasar ala vista (html) las variables que queremos
    public String showProducts(Model model) {
        model.addAttribute("products", productService.findAll());

        return "product-list"; // Devuelve el nombre de la vista(html) que queremos mostrar
    }
    @GetMapping("/new")
    public String showNewProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "product-form";
    }
    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/products/";
    }
    @GetMapping("/edit/{id}")
    public String showEditProductForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "product-form"; //necesiatamso la pantilla de form para introducir datos
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteById(id);
        return "redirect:/products/";
    }




}
