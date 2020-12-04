package com.sonarqube.demo.persistence;

import com.sonarqube.demo.domain.Persona;
import com.sonarqube.demo.domain.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.UUID;

public class PersonaImpl implements PersonaRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public List<Persona> findAll() {
        final String SQL_GET_ALL = "select * from persona";
        return jdbcTemplate.query(SQL_GET_ALL, new PersonaMapper());
    }

    @Override
    public void save(Persona persona) {
        final String SQL_INSERT_PACIENTE = "insert into persona(" +
                "persona_id," +
                "nombre," +
                "apellido," +
                "dni)values(?,?,?,?)";

        jdbcTemplate.update(SQL_INSERT_PACIENTE,
                UUID.fromString(persona.getPersonaId()),
                persona.getNombre(),
                persona.getApellido(),
                persona.getDni());
    }

    @Override
    public void delete(UUID uuid) {
        final String SQL_DELETE = "delete from persona where persona_id = ?";
        jdbcTemplate.update(SQL_DELETE, uuid);
    }

    @Override
    public void update(Persona persona) {
        final String SQL_UPDATE = "update persona set" +
                "nombre=?," +
                "apellido=?," +
                "dni=?," +
                "where persona_id=?";

        jdbcTemplate.update(SQL_UPDATE,
                persona.getNombre(),
                persona.getApellido(),
                persona.getDni(),
                UUID.fromString(persona.getPersonaId()));

    }
}
