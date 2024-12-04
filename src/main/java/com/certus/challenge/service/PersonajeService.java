package com.certus.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certus.challenge.model.PersonajeModel;
import com.certus.challenge.persistence.IPersonajeRepository;

@Service
public class PersonajeService implements IPersonajeService{
	
	@Autowired
	private IPersonajeRepository repoPersonaje;

	// personaje por id
	@Override
	public Optional<PersonajeModel> obtenerPersonajeId(Integer idPersonaje) {
		Optional<PersonajeModel> personaje = repoPersonaje.findById(idPersonaje);
		return personaje;
	}

	// todos los pesonajes
	@Override
	public List<PersonajeModel> obtenerPersonajes() {
		List<PersonajeModel> listaPersonajes = repoPersonaje.findAll();
		return listaPersonajes;
	}
	
}
