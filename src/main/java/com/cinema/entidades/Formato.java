package com.cinema.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the formato database table.
 * 
 */
@Entity
@NamedQuery(name="Formato.findAll", query="SELECT f FROM Formato f")
public class Formato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_formato")
	private int idFormato;

	private String nombre;

	//bi-directional many-to-one association to Pelicula
	@OneToMany(mappedBy="formato")
	private List<Pelicula> peliculas;

	//bi-directional many-to-one association to Sala
	@OneToMany(mappedBy="formato")
	private List<Sala> salas;

	public Formato() {
	}

	public int getIdFormato() {
		return this.idFormato;
	}

	public void setIdFormato(int idFormato) {
		this.idFormato = idFormato;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pelicula> getPeliculas() {
		return this.peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public Pelicula addPelicula(Pelicula pelicula) {
		getPeliculas().add(pelicula);
		pelicula.setFormato(this);

		return pelicula;
	}

	public Pelicula removePelicula(Pelicula pelicula) {
		getPeliculas().remove(pelicula);
		pelicula.setFormato(null);

		return pelicula;
	}

	public List<Sala> getSalas() {
		return this.salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	public Sala addSala(Sala sala) {
		getSalas().add(sala);
		sala.setFormato(this);

		return sala;
	}

	public Sala removeSala(Sala sala) {
		getSalas().remove(sala);
		sala.setFormato(null);

		return sala;
	}

}