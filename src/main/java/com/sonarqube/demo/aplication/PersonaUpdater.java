package com.sonarqube.demo.aplication;

import com.sonarqube.demo.domain.Persona;
import com.sonarqube.demo.domain.PersonaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaUpdater {

    PersonaRepository repository;

    public PersonaUpdater(PersonaRepository repository) {
        this.repository = repository;
    }

    public void update(Persona persona) {
        repository.update(persona);
    }
}
