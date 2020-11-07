package com.cinema.dto;

import java.io.Serializable;


/**
 * DTO que corresponde a la entidad Reserva y se comunica con el frontend.
 * 
 * @author David
 * 
 */

public class ReservaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idReserva;
	private int numeroSillas;
	private String pagoValido;
	private CiudadDTO ciudad;
	private SucursalDTO sucursal;
	private AgendaDTO agenda;
	private UsuarioDTO usuario;
	
	public ReservaDTO() {
		super();
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getNumeroSillas() {
		return numeroSillas;
	}

	public void setNumeroSillas(int numeroSillas) {
		this.numeroSillas = numeroSillas;
	}

	public String getPagoValido() {
		return pagoValido;
	}

	public void setPagoValido(String pagoValido) {
		this.pagoValido = pagoValido;
	}

	public CiudadDTO getCiudad() {
		return ciudad;
	}

	public void setCiudad(CiudadDTO ciudad) {
		this.ciudad = ciudad;
	}

	public SucursalDTO getSucursal() {
		return sucursal;
	}

	public void setSucursal(SucursalDTO sucursal) {
		this.sucursal = sucursal;
	}

	public AgendaDTO getAgenda() {
		return agenda;
	}

	public void setAgenda(AgendaDTO agenda) {
		this.agenda = agenda;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	
}
