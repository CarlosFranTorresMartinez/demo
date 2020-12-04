package com.sonarqube.demo.domain;

import java.util.List;
import java.util.UUID;

public interface PersonaRepository {

    List<Persona> findAll();

    void save(Persona persona);

    void delete(UUID uuid);

    void update(Persona persona);

}
