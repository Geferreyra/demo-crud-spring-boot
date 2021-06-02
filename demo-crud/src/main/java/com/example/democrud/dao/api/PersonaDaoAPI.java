package com.example.democrud.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.example.democrud.model.Persona;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {

}//Se generan los metodos crud en un repositorio.

/*Q es repositorio /dao */
