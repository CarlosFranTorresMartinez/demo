package com.sonarqube.demo.aplication;

import com.sonarqube.demo.domain.Persona;
import com.sonarqube.demo.domain.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaFinder {
    PersonaRepository repository;

    public PersonaFinder(PersonaRepository repository) {
        this.repository = repository;
    }

    public List<Persona> findAll() {
        return repository.findAll();
    }
}
