package com.certus.challenge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorVistasPrinc {
	
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
		return "/ganador/ganadorPrin";
	}
}
