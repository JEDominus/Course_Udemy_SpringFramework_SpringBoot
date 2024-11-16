package com.courses.je.controller;

import com.courses.je.model.entity.Persona;
import com.courses.je.service.PersonaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final PersonaService personaService;

    @GetMapping("/")
    public String home(Model model) {
        List<Persona> personas = personaService.listarPersonas();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona) {
        personaService.guardarPersona(persona);
        return "redirect:/";
    }

    @GetMapping("/editar/{personaId}")
    public String editar(Persona persona, Model model) {
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }

    @GetMapping("/eliminar/{personaId}")
    public String eliminar(Persona persona) {
        personaService.eliminarPersona(persona);
        return "redirect:/";
    }
}
