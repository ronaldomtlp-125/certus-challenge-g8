package com.certus.challenge.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "personaje")
public class PersonajeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String color;
    private String imgNombre;
    private String backgroundNombre;
	@OneToOne(mappedBy = "personaje", cascade = CascadeType.ALL)
    private JugadorModel jugador;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImgNombre() {
		return imgNombre;
	}
	public void setImgNombre(String imgNombre) {
		this.imgNombre = imgNombre;
	}
	public String getBackgroundNombre() {
		return backgroundNombre;
	}
	public void setBackgroundNombre(String backgroundNombre) {
		this.backgroundNombre = backgroundNombre;
	}
	@Override
	public String toString() {
		return "PersonajeModel [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", color=" + color
				+ ", imgNombre=" + imgNombre + ", backgroundNombre=" + backgroundNombre + "]";
	}
}
