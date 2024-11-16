package com.courses.je.repository;

import com.courses.je.model.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
}
