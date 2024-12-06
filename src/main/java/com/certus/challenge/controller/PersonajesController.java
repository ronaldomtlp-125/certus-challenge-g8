package com.certus.challenge.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.certus.challenge.model.PersonajeModel;
import com.certus.challenge.service.IPersonajeService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/inicio")
public class PersonajesController {

	@Autowired
	IPersonajeService servicePersonaje;

	@GetMapping("/jugadoresselect")
	public String devolverPersonajes(Model model) {
		List<PersonajeModel> personajes = servicePersonaje.obtenerPersonajes();
		model.addAttribute("personajes", personajes);

		// ruta original
		// return "/jugadores/jugadoresPrin";
		// ruta de prueba
		return "/ventanas/jugadores/selectorPrin";
	}

	@PostMapping("/guardarSeleccion")
	public ResponseEntity<String> guardarSeleccion(@RequestBody Map<String, List<Integer>> payload) {
		List<Integer> idsSeleccionados = payload.get("ids");

		if (idsSeleccionados == null || idsSeleccionados.size() != 4) {
			return ResponseEntity.badRequest().body("Debes seleccionar exactamente 4 personajes.");
		}

		// Logica de IDs seleccionados
		System.out.println("IDs seleccionados: " + idsSeleccionados);

		return ResponseEntity.ok("Selección guardada correctamente.");
	}

}
