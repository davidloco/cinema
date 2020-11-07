package com.cinema.dto;

import java.io.Serializable;

/**
 * DTO que corresponde a la entidad Formato y se comunica con el frontend.
 * 
 * @author David
 * 
 */
public class FormatoDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idFormato;
	private String nombre;
	
	
	public FormatoDTO() {
		super();
	}
	public int getIdFormato() {
		return idFormato;
	}
	public void setIdFormato(int idFormato) {
		this.idFormato = idFormato;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
