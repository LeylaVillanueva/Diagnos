package edu.utez.personas.service;

import edu.utez.personas.model.dto.personaDto;
import edu.utez.personas.model.entity.personaBean;

import java.util.List;

public interface Ipersona {
    personaBean save(personaDto persona);

    personaBean findById(Integer id);

    List<personaBean> findAll();

    void delete (personaBean persona);
}
