package com.courses.je.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @Value("${index.saludo}")
    private String saludoProperties;

    @GetMapping("/")
    public String home(Model model) {
        log.info("Ejecutando el controlador Spring MVC");

        String mensaje = "Hola Mundo con desde Spring MVC";
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("mensajeProperties", saludoProperties);

        return "index";
    }

}
