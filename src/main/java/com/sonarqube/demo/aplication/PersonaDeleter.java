package com.sonarqube.demo.aplication;

import com.sonarqube.demo.domain.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PersonaDeleter {

    PersonaRepository repository;

    public PersonaDeleter(PersonaRepository repository) {
        this.repository = repository;
    }

    public void delete(String personaId) {
        repository.delete(UUID.fromString(personaId));
    }
}
