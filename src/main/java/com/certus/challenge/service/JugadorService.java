package com.certus.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certus.challenge.model.JugadorModel;
import com.certus.challenge.persistence.IJugadorRepository;

@Service
public class JugadorService implements IJugadorService{
	
	@Autowired
	private IJugadorRepository jugadorRepo;

	@Override
	public Optional<JugadorModel> encontrarJugadorId(Integer idJugador) {
		Optional<JugadorModel> jugador = jugadorRepo.findById(idJugador);
		return jugador;
	}

	@Override
	public List<JugadorModel> encontrarJugadores() {
		List<JugadorModel> listaJugadores = jugadorRepo.findAll();
		return listaJugadores;
	}

	@Override
	public void eliminarJugadores() {
		jugadorRepo.deleteAll();
	}

	@Override
	public void agregarJugador(JugadorModel jugador) {
		jugadorRepo.save(jugador);
	}

	@Override
	public void agregarJugadores(List<JugadorModel> jugadores) {
		jugadorRepo.saveAll(jugadores);
		
	}

}
