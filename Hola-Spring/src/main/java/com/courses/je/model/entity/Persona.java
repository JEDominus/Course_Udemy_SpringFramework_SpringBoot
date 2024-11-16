package com.courses.je.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Builder
@Entity
@Table(name = "persona")
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Persona implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personaId;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
