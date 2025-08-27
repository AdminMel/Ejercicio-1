package com.upiiz.holamundo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Esta clase es un controlador -> @Controller -> Despliega algún recurso
@Controller
public class HomeController {
    // Controlar en qué URL se despliegan las páginas
    // http://locallhost:8080/ - Mostrar página principal - GET
    @GetMapping("/")
    public String home() {
        return "index"; //Se complementa la ruta
    }
    // http://localhost:8080/contacto - Mostrar página de contacto - GET
    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }
    // http://localhost:8080/galeria - Mostrar página de galería - GET
    @GetMapping("/galeria")
    public String galeria() {
        return "galeria";
    }
    // http://localhost:8080/nosotros - Mostrar página de nosotros - GET
    @GetMapping("/nosotros")
    public String nosotros() {
        return "nosotros";
    }
    // Como sólo queremos mostrar, vamos a usar el metodo GET

}
