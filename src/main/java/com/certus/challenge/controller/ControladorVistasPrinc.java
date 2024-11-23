package com.certus.challenge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorVistasPrinc {
	
	@GetMapping("/")
	public String index() {
		return pantallaInicio();
	}

	@GetMapping("/inicio")
	public String pantallaInicio() {
		return "/inicio/inicioPrin";
	}
	
	@GetMapping("/inicio/jugadores")
	public String pantallaJugadores() {
		return "/jugadores/jugadoresPrin";
	}
	
	
	@GetMapping("/juego")
	public String pantallaJuego() {
		return "/juego/juegoPrin";
	}
	
	@GetMapping("/resultados")
	public String pantallaResultados() {
		return "/resultado/Tabla de resultados";
	}
	
	@GetMapping("/juego/resultados/ganador")
	public String pantallaGanador() {
		return "/ganador/ganador";
	}

	// Lucio testea en esta ruta tu vista
	@GetMapping("/jugadoresselect")
	public String ventanasTest() {
		return "/ventanas/jugadores/selectorPrin"; // ruta de la carpeta
	}
	
	@GetMapping("/info")
	public String ventanaJuego() {
		return "/ventanas/juego/Info del juego";
	}

	@GetMapping("/pausa")
	public String menuPausa() {
		return "/ventanas/juego/Menu de pausa";
	}
	
}
