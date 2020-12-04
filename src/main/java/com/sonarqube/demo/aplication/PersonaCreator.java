package com.sonarqube.demo.aplication;

import com.sonarqube.demo.domain.Persona;
import com.sonarqube.demo.domain.PersonaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaCreator {

    PersonaRepository repository;

    public PersonaCreator(PersonaRepository repository) {
        this.repository = repository;
    }

    public void create(Persona persona) {
        repository.save(persona);
    }
}
