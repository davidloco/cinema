package com.cinema.dto;

import java.io.Serializable;

/**
 * DTO que corresponde a la entidad Sala y se comunica con el frontend.
 * 
 * @author David
 * 
 */
public class SalaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idSala;
	private int numeroFilas;
	private FormatoDTO formato;
	private SucursalDTO id_sucursal;
	
	public SalaDTO() {
		super();
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public int getNumeroFilas() {
		return numeroFilas;
	}

	public void setNumeroFilas(int numeroFilas) {
		this.numeroFilas = numeroFilas;
	}

	public FormatoDTO getFormato() {
		return formato;
	}

	public void setFormato(FormatoDTO formato) {
		this.formato = formato;
	}

	public SucursalDTO getId_sucursal() {
		return id_sucursal;
	}

	public void setId_sucursal(SucursalDTO id_sucursal) {
		this.id_sucursal = id_sucursal;
	}
	
	
}
