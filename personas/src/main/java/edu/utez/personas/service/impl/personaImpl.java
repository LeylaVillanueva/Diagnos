package edu.utez.personas.service.impl;

import edu.utez.personas.model.dao.personaDao;
import edu.utez.personas.model.dto.personaDto;
import edu.utez.personas.model.entity.personaBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class personaImpl {
    @Autowired
    private personaDao personasdao;

    @Override
    @Transactional
    public personaBean save(personaDto personadto){
        personaBean persona = personaBean.builder()
                .id_persona(personaDto.getId_persona())
                .name(personaDto.getName())
                .ape1(personaDto.getApe1())
                .ape2(personaDto.getApe2())
                .fechaNac(personaDto.getFechaNac())
                .build();
        return personaDao.save(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public personaBean findById(Integer id){
        return personaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<personaBean> findAll() {
        return (List<personaBean>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void delete(personaBean person) {
        personaDao.delete(person);
    }
}
