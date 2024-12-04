package com.certus.challenge.service;

import java.util.List;
import java.util.Optional;

import com.certus.challenge.model.PersonajeModel;

public interface IPersonajeService {
	
	// encontrar personaje por id
	Optional<PersonajeModel> obtenerPersonajeId(Integer idPersonaje);
	
	// encontrar todos los personajes
	List<PersonajeModel> obtenerPersonajes();
}
