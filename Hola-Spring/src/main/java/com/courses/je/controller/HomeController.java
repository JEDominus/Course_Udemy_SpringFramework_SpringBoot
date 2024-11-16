package com.courses.je.controller;

import com.courses.je.model.entity.Persona;
import com.courses.je.service.PersonaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final PersonaService personaService;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Persona> personas = personaService.getPersonas();
        model.addAttribute("personas", personas);
        return "index";
    }

}
