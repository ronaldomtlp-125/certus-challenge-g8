package com.certus.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String devolverPersonajes(Model model){
		List<PersonajeModel> personajes = servicePersonaje.obtenerPersonajes();
		model.addAttribute("personajes", personajes);
		
		//ruta original
		// return "/jugadores/jugadoresPrin";
		// ruta de prueba
		return "/ventanas/jugadores/selectorPrin";
	}

}
