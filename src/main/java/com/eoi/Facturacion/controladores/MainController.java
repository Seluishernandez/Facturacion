package com.eoi.Facturacion.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
    @GetMapping(value = {"/",""})
    public String showHome(){
        return"home";
    }



}
