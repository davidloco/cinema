package com.cinema.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sucursal database table.
 * 
 */
@Entity
@NamedQuery(name="Sucursal.findAll", query="SELECT s FROM Sucursal s")
public class Sucursal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_sucursal")
	private int idSucursal;

	private String direccion;

	private String nombre;

	//bi-directional many-to-one association to PeliculaSucursal
	@OneToMany(mappedBy="sucursal")
	private List<PeliculaSucursal> peliculaSucursals;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="sucursal")
	private List<Reserva> reservas;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="administrador")
	private Usuario usuario;

	//bi-directional many-to-one association to SucursalCiudad
	@OneToMany(mappedBy="sucursal")
	private List<SucursalCiudad> sucursalCiudads;

	public Sucursal() {
	}

	public int getIdSucursal() {
		return this.idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<PeliculaSucursal> getPeliculaSucursals() {
		return this.peliculaSucursals;
	}

	public void setPeliculaSucursals(List<PeliculaSucursal> peliculaSucursals) {
		this.peliculaSucursals = peliculaSucursals;
	}

	public PeliculaSucursal addPeliculaSucursal(PeliculaSucursal peliculaSucursal) {
		getPeliculaSucursals().add(peliculaSucursal);
		peliculaSucursal.setSucursal(this);

		return peliculaSucursal;
	}

	public PeliculaSucursal removePeliculaSucursal(PeliculaSucursal peliculaSucursal) {
		getPeliculaSucursals().remove(peliculaSucursal);
		peliculaSucursal.setSucursal(null);

		return peliculaSucursal;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setSucursal(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setSucursal(null);

		return reserva;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<SucursalCiudad> getSucursalCiudads() {
		return this.sucursalCiudads;
	}

	public void setSucursalCiudads(List<SucursalCiudad> sucursalCiudads) {
		this.sucursalCiudads = sucursalCiudads;
	}

	public SucursalCiudad addSucursalCiudad(SucursalCiudad sucursalCiudad) {
		getSucursalCiudads().add(sucursalCiudad);
		sucursalCiudad.setSucursal(this);

		return sucursalCiudad;
	}

	public SucursalCiudad removeSucursalCiudad(SucursalCiudad sucursalCiudad) {
		getSucursalCiudads().remove(sucursalCiudad);
		sucursalCiudad.setSucursal(null);

		return sucursalCiudad;
	}

}