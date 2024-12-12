package com.certus.challenge.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.certus.challenge.model.JugadorModel;
import com.certus.challenge.model.PersonajeModel;
import com.certus.challenge.service.IJugadorService;
import com.certus.challenge.service.IPersonajeService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/inicio")
public class PersonajesController {

    @Autowired
    IPersonajeService servicePersonaje;

    @Autowired
    IJugadorService serviceJugador;

    @GetMapping("/jugadoresselect")
    public String devolverPersonajes(Model model) {
        List<PersonajeModel> personajes = servicePersonaje.obtenerPersonajes();
        model.addAttribute("personajes", personajes);

        // ruta original
        // return "/jugadores/jugadoresPrin";
        // ruta de prueba
        return "/ventanas/jugadores/selectorPrin";
    }

    @GetMapping("/guardarSeleccion")
    public String guardarSeleccion(
            @RequestParam("idJugador1") Integer idJugador1,
            @RequestParam("nombreJugador1") String nombreJugador1,
            @RequestParam("idJugador2") Integer idJugador2,
            @RequestParam("nombreJugador2") String nombreJugador2,
            @RequestParam("idJugador3") Integer idJugador3,
            @RequestParam("nombreJugador3") String nombreJugador3,
            @RequestParam("idJugador4") Integer idJugador4,
            @RequestParam("nombreJugador4") String nombreJugador4, Model model) {
        // Validar los campos
        if (idJugador1 == null || idJugador2 == null || idJugador3 == null || idJugador4 == null ||
                nombreJugador1.trim().isEmpty() || nombreJugador2.trim().isEmpty() ||
                nombreJugador3.trim().isEmpty() || nombreJugador4.trim().isEmpty()) {
            return "redirect:/inicio/jugadoresselect?error=Debes completar todos los campos.";
        }

        // Procesar los datos
        System.out.println("Jugador 1: " + idJugador1 + " - " + nombreJugador1);
        System.out.println("Jugador 2: " + idJugador2 + " - " + nombreJugador2);
        System.out.println("Jugador 3: " + idJugador3 + " - " + nombreJugador3);
        System.out.println("Jugador 4: " + idJugador4 + " - " + nombreJugador4);

        // crear jugadores
        List<JugadorModel> jugadores = new ArrayList<>();
        List<Integer> turnos = generarTurnosAleatorios();
        

        JugadorModel jugador1 = new JugadorModel();
        jugador1.setPersonaje(servicePersonaje.obtenerPersonajeId(idJugador1).get());
        jugador1.setNombre(nombreJugador1);
        jugador1.setTurno(turnos.get(0));
        jugadores.add(jugador1);

        JugadorModel jugador2 = new JugadorModel();
        jugador1.setPersonaje(servicePersonaje.obtenerPersonajeId(idJugador2).get());
        jugador2.setNombre(nombreJugador2);
        jugador1.setTurno(turnos.get(1));
        jugadores.add(jugador2);

        JugadorModel jugador3 = new JugadorModel();
        jugador1.setPersonaje(servicePersonaje.obtenerPersonajeId(idJugador3).get());
        jugador3.setNombre(nombreJugador3);
        jugador1.setTurno(turnos.get(2));
        jugadores.add(jugador3);

        JugadorModel jugador4 = new JugadorModel();
        jugador1.setPersonaje(servicePersonaje.obtenerPersonajeId(idJugador4).get());
        jugador4.setNombre(nombreJugador4);
        jugador1.setTurno(turnos.get(3));
        jugadores.add(jugador4);

        //serviceJugador.agregarJugadores(jugadores);

        model.addAttribute("jugadores", jugadores);

        // Redirigir a la vista del juego
        return "/juego/juegoPrin";
    }

    public static List<Integer> generarTurnosAleatorios() {
        List<Integer> turnos = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            turnos.add(i);
        }
        Collections.shuffle(turnos); // Mezcla los números
        return turnos;
    }
}
