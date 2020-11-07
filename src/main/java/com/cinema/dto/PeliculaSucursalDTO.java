package com.cinema.dto;

import java.io.Serializable;


/**
 * DTO que corresponde a la entidad PeliculaSucursal y se comunica con el frontend.
 * 
 * @author David
 * 
 */
public class PeliculaSucursalDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idPeliculaSucursal;
	private PeliculaDTO pelicula;
	private SucursalDTO sucursal;
	
	public PeliculaSucursalDTO() {
		super();
	}

	public int getIdPeliculaSucursal() {
		return idPeliculaSucursal;
	}

	public void setIdPeliculaSucursal(int idPeliculaSucursal) {
		this.idPeliculaSucursal = idPeliculaSucursal;
	}

	public PeliculaDTO getPelicula() {
		return pelicula;
	}

	public void setPelicula(PeliculaDTO pelicula) {
		this.pelicula = pelicula;
	}

	public SucursalDTO getSucursal() {
		return sucursal;
	}

	public void setSucursal(SucursalDTO sucursal) {
		this.sucursal = sucursal;
	}
	

}
