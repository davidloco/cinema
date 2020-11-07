package com.cinema.dto;

import java.io.Serializable;

/**
 * DTO que corresponde a la entidad Ciudad y se comunica con el frontend.
 * 
 * @author David
 * 
 */
public class CiudadDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idCiudad;
	private String nombre;
	
	
	public CiudadDTO() {
		super();
	}
	
	public int getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
