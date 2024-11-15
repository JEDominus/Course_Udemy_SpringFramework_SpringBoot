package com.courses.je.controller;

import com.courses.je.domain.Persona;
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

        Persona persona = Persona.builder()
                .firstName("Javier")
                .lastName("Mota")
                .email("je.dominus.anger@gmail.com")
                .phone("3320801954").build();

        model.addAttribute("persona", persona);

        return "index";
    }

}
