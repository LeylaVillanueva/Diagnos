package edu.utez.personas.model.dao;


import edu.utez.personas.model.entity.personaBean;
import org.springframework.data.repository.CrudRepository;


public interface personaDao extends CrudRepository<personaBean, Integer> {

}
