package com.cinema.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the reserva database table.
 * 
 */
@Entity
@NamedQuery(name="Reserva.findAll", query="SELECT r FROM Reserva r")
public class Reserva implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_reserva")
	private int idReserva;

	@Column(name="numero_sillas")
	private int numeroSillas;

	@Column(name="pago_valido")
	private String pagoValido;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="id_ciudad")
	private Ciudad ciudad;

	//bi-directional many-to-one association to Sucursal
	@ManyToOne
	@JoinColumn(name="id_sucursal")
	private Sucursal sucursal;

	//bi-directional many-to-one association to Agenda
	@ManyToOne
	@JoinColumn(name="id_agenda")
	private Agenda agenda;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	public Reserva() {
	}

	public int getIdReserva() {
		return this.idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getNumeroSillas() {
		return this.numeroSillas;
	}

	public void setNumeroSillas(int numeroSillas) {
		this.numeroSillas = numeroSillas;
	}

	public String getPagoValido() {
		return this.pagoValido;
	}

	public void setPagoValido(String pagoValido) {
		this.pagoValido = pagoValido;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Agenda getAgenda() {
		return this.agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}