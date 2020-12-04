package com.sonarqube.demo.domain;

import lombok.Data;

@Data
public class Persona {
    private String personaId;
    private String nombre;
    private String apellido;
    private int dni;

    public Persona(String personaId, String nombre, String apellido, int dni) {
        this.personaId = personaId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}
