package com.cinema.dto;

import java.io.Serializable;


/**
 * DTO que corresponde a la entidad Genero y se comunica con el frontend.
 * 
 * @author David
 * 
 */
public class GeneroDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idGenero;
	private String nombre;
	
	
	public GeneroDTO() {
		super();
	}
	public int getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
