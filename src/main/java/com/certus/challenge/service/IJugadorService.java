package com.certus.challenge.service;

import java.util.List;
import java.util.Optional;

import com.certus.challenge.model.JugadorModel;

public interface IJugadorService {
	
	// encontrar jugador por id
	public Optional<JugadorModel> encontrarJugadorId(Integer idJugador);
	
	// encontrar todos los jugadores
	public List<JugadorModel> encontrarJugadores();
	
	// eliminar jugadorres
	public void eliminarJugadores();
	
	// agregar jugador
	public void agregarJugador(JugadorModel jugador);
	
	// agregar jugadores
	public void agregarJugadores(List<JugadorModel> jugadores);
}
