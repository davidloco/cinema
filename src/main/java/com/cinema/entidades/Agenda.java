package com.cinema.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the agenda database table.
 * 
 */
@Entity
@NamedQuery(name="Agenda.findAll", query="SELECT a FROM Agenda a")
public class Agenda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_agenda")
	private int idAgenda;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_hora")
	private Date fechaHora;

	//bi-directional many-to-one association to Sala
	@ManyToOne
	@JoinColumn(name="id_sala")
	private Sala sala;

	//bi-directional many-to-one association to Pelicula
	@ManyToOne
	@JoinColumn(name="id_pelicula")
	private Pelicula pelicula;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="agenda")
	private List<Reserva> reservas;

	public Agenda() {
	}

	public int getIdAgenda() {
		return this.idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Date getFechaHora() {
		return this.fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Sala getSala() {
		return this.sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Pelicula getPelicula() {
		return this.pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setAgenda(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setAgenda(null);

		return reserva;
	}

}