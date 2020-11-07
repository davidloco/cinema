package com.cinema.dto;

import java.io.Serializable;

/**
 * DTO que corresponde a la entidad Rol y se comunica con el frontend.
 * 
 * @author David
 * 
 */

public class RolDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idRol;
	private int nombre;
	
	public RolDTO() {
		super();
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	

}
