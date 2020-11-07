package com.cinema.dto;

import java.io.Serializable;


/**
 * DTO que corresponde a la entidad FillaSilla y se comunica con el frontend.
 * 
 * @author David
 * 
 */
public class FilaSillaDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idFilaSilla;
	private String fila;
	private int numeroSillas;
	private SalaDTO sala;
	
	
	public FilaSillaDTO() {
		super();
	}
	public int getIdFilaSilla() {
		return idFilaSilla;
	}
	public void setIdFilaSilla(int idFilaSilla) {
		this.idFilaSilla = idFilaSilla;
	}
	public String getFila() {
		return fila;
	}
	public void setFila(String fila) {
		this.fila = fila;
	}
	public int getNumeroSillas() {
		return numeroSillas;
	}
	public void setNumeroSillas(int numeroSillas) {
		this.numeroSillas = numeroSillas;
	}
	public SalaDTO getSala() {
		return sala;
	}
	public void setSala(SalaDTO sala) {
		this.sala = sala;
	}

	
	
}
