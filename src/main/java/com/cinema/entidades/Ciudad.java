package com.cinema.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ciudad database table.
 * 
 */
@Entity
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c")
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ciudad")
	private int idCiudad;

	private String nombre;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="ciudad")
	private List<Reserva> reservas;

	//bi-directional many-to-one association to SucursalCiudad
	@OneToMany(mappedBy="ciudad")
	private List<SucursalCiudad> sucursalCiudads;

	public Ciudad() {
	}

	public int getIdCiudad() {
		return this.idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setCiudad(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setCiudad(null);

		return reserva;
	}

	public List<SucursalCiudad> getSucursalCiudads() {
		return this.sucursalCiudads;
	}

	public void setSucursalCiudads(List<SucursalCiudad> sucursalCiudads) {
		this.sucursalCiudads = sucursalCiudads;
	}

	public SucursalCiudad addSucursalCiudad(SucursalCiudad sucursalCiudad) {
		getSucursalCiudads().add(sucursalCiudad);
		sucursalCiudad.setCiudad(this);

		return sucursalCiudad;
	}

	public SucursalCiudad removeSucursalCiudad(SucursalCiudad sucursalCiudad) {
		getSucursalCiudads().remove(sucursalCiudad);
		sucursalCiudad.setCiudad(null);

		return sucursalCiudad;
	}

}