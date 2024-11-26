package com.courses.je.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @Email
    @NotEmpty
    private String email;
    private String telefono;
    @NotNull
    private Double saldo;
}
