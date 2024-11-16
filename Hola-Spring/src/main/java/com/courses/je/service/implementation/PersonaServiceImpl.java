package com.courses.je.service.implementation;

import com.courses.je.model.entity.Persona;
import com.courses.je.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements com.courses.je.service.PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return personaRepository.findById(persona.getPersonaId()).orElse(null);
    }

    @Override
    public void guardarPersona(Persona persona) {
         personaRepository.save(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaRepository.delete(persona);
    }
}
