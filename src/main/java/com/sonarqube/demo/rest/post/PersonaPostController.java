package com.sonarqube.demo.rest.post;

import com.sonarqube.demo.aplication.PersonaCreator;
import com.sonarqube.demo.domain.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/persona")
@CrossOrigin
public class PersonaPostController {
    PersonaCreator personaCreator;

    public PersonaPostController(PersonaCreator personaCreator) {
        this.personaCreator = personaCreator;
    }

    @PostMapping
    public ResponseEntity savePersona(@RequestBody Persona persona) {
        personaCreator.create(persona);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
