package com.cinema.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO que corresponde a la entidad Agenda y se comunica con el frontend.
 * 
 * @author David
 * 
 */
public class AgendaDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idAgenda;
	private Date fechaHora;
	private SalaDTO sala;
	private PeliculaDTO pelicula;

	
	public AgendaDTO() {
		super();
	}
	public int getIdAgenda() {
		return idAgenda;
	}
	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public SalaDTO getSala() {
		return sala;
	}
	public void setSala(SalaDTO sala) {
		this.sala = sala;
	}
	public PeliculaDTO getPelicula() {
		return pelicula;
	}
	public void setPelicula(PeliculaDTO pelicula) {
		this.pelicula = pelicula;
	}

	
	

}
