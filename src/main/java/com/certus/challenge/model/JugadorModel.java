package com.certus.challenge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jugador")
public class JugadorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // onetoone
    @OneToOne
    @JoinColumn(name = "id_personaje", referencedColumnName = "id")
    private PersonajeModel personaje;
    private String nombre;
    // private List<ProductoModel> productos;
    // private List<ProyectoModel> proyectos;
    // private List<RecursoModel> recursos;
    // private List<EficienciaModel> eficiencias;
    private Integer turno;
    private Integer posicion;
    private Integer puntos;
    private Double dinero;
    private Integer eventos_superados;
    private Integer eventos_fracasados;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public PersonajeModel getPersonaje() {
		return personaje;
	}
	public void setPersonaje(PersonajeModel personaje) {
		this.personaje = personaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getTurno() {
		return turno;
	}
	public void setTurno(Integer turno) {
		this.turno = turno;
	}
	public Integer getPosicion() {
		return posicion;
	}
	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	public Double getDinero() {
		return dinero;
	}
	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}
	public Integer getEventos_superados() {
		return eventos_superados;
	}
	public void setEventos_superados(Integer eventos_superados) {
		this.eventos_superados = eventos_superados;
	}
	public Integer getEventos_fracasados() {
		return eventos_fracasados;
	}
	public void setEventos_fracasados(Integer eventos_fracasados) {
		this.eventos_fracasados = eventos_fracasados;
	}
	@Override
	public String toString() {
		return "JugadorModel [id=" + id + ", personaje=" + personaje + ", nombre="
				+ nombre + ", turno=" + turno + ", posicion=" + posicion + ", puntos=" + puntos + ", dinero=" + dinero
				+ ", eventos_superados=" + eventos_superados + ", eventos_fracasados=" + eventos_fracasados + "]";
	}
    
	
	
	
}
