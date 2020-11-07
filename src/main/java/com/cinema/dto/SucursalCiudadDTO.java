package com.cinema.dto;

import java.io.Serializable;


/**
 * DTO que corresponde a la entidad SucursalCiudad y se comunica con el frontend.
 * 
 * @author David
 * 
 */
public class SucursalCiudadDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idSucursalCiudad;
	private CiudadDTO ciudad;
	private SucursalDTO sucursal;
	
	public SucursalCiudadDTO() {
		super();
	}

	public int getIdSucursalCiudad() {
		return idSucursalCiudad;
	}

	public void setIdSucursalCiudad(int idSucursalCiudad) {
		this.idSucursalCiudad = idSucursalCiudad;
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

}
