package com.courses.je.service;

import com.courses.je.model.entity.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> listarPersonas();

    Persona encontrarPersona(Persona persona);

    void guardarPersona(Persona persona);

    void eliminarPersona(Persona persona);
}
