package com.example.leccion1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Leccion1Controller {
    
    @GetMapping("/saludar")
    public String saludo(@RequestParam(name = "nombre", required = false, defaultValue = "Mundo") String nombre, Model model) {
        model.addAttribute("nombre", nombre);
        return "saludo";
    }

    @GetMapping("/formulario")
    public String formulario() {
        return "formulario";
    }

    @PostMapping("/enviar")
    public String procesar(String nombre, @RequestParam(name = "apellidos")String ape, Model model) {
        model.addAttribute("nombre", nombre);
        model.addAttribute("apellidos", ape);
        return "formulario";
    }
}
