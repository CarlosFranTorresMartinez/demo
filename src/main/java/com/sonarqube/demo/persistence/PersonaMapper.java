package com.sonarqube.demo.persistence;

import com.sonarqube.demo.domain.Persona;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonaMapper implements RowMapper<Persona> {

    @Override
    public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Persona(rs.getString("persona_id"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getInt("dni"));
    }
}
