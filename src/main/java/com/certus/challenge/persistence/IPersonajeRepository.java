package com.certus.challenge.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certus.challenge.model.PersonajeModel;

@Repository
public interface IPersonajeRepository extends JpaRepository<PersonajeModel, Integer>{

}
