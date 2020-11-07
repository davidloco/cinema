package com.cinema.dto;

import java.io.Serializable;

/**
 * DTO que corresponde a la entidad Sucursal y se comunica con el frontend.
 * 
 * @author David
 * 
 */
public class SucursalDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idSucursal;
	private String direccion;
	private String nombre;
	private UsuarioDTO usuario;
	
	public SucursalDTO() {
		super();
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	
}
