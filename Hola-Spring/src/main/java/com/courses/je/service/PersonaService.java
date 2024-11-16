package com.courses.je.service;

import com.courses.je.model.entity.Persona;
import com.courses.je.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Iterable<Persona> getPersonas() {
        return personaRepository.findAll();
    }
}
