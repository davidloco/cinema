package com.cinema.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fila_silla database table.
 * 
 */
@Entity
@Table(name="fila_silla")
@NamedQuery(name="FilaSilla.findAll", query="SELECT f FROM FilaSilla f")
public class FilaSilla implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_fila_silla")
	private int idFilaSilla;

	private String fila;

	@Column(name="numero_sillas")
	private int numeroSillas;

	//bi-directional many-to-one association to Sala
	@ManyToOne
	@JoinColumn(name="id_sala")
	private Sala sala;

	public FilaSilla() {
	}

	public int getIdFilaSilla() {
		return this.idFilaSilla;
	}

	public void setIdFilaSilla(int idFilaSilla) {
		this.idFilaSilla = idFilaSilla;
	}

	public String getFila() {
		return this.fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public int getNumeroSillas() {
		return this.numeroSillas;
	}

	public void setNumeroSillas(int numeroSillas) {
		this.numeroSillas = numeroSillas;
	}

	public Sala getSala() {
		return this.sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

}