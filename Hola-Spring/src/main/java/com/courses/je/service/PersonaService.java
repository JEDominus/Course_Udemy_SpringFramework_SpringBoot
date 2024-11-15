package com.courses.je.service;

import com.courses.je.domain.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {

    public List<Persona> getPersonas(Integer numeroPersonas) {
        List<Persona> personas = new ArrayList<>();

        for (Integer i = 0; i<numeroPersonas; i++) {
            Persona persona = Persona.builder()
                    .firstName("Javier".concat(i.toString()))
                    .lastName("Mota".concat(i.toString()))
                    .email("javier.".concat(i.toString()).concat("@gmail.com"))
                    .phone("3320801954").build();

            personas.add(persona);
        }

        return personas;
    }
}
