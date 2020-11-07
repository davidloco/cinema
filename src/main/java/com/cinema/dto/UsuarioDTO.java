package com.cinema.dto;

import java.io.Serializable;

/**
 * DTO que corresponde a la entidad Usuario y se comunica con el frontend.
 * 
 * @author David
 * 
 */
public class UsuarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idUsuario;
	private String nombreUsuario;
	private RolDTO idRol;
	
	public UsuarioDTO() {
		super();
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public RolDTO getIdRol() {
		return idRol;
	}

	public void setIdRol(RolDTO idRol) {
		this.idRol = idRol;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	
}
