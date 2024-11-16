package com.courses.je.controller;

import com.courses.je.domain.Persona;
import com.courses.je.service.PersonaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final PersonaService personaService;

    @GetMapping("/")
    public String home(Model model) {
        List<Persona> personas = personaService.getPersonas(12);
        model.addAttribute("personas", personas);
        return "index";
    }

}
