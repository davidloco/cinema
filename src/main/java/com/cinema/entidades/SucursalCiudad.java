package com.cinema.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sucursal_ciudad database table.
 * 
 */
@Entity
@Table(name="sucursal_ciudad")
@NamedQuery(name="SucursalCiudad.findAll", query="SELECT s FROM SucursalCiudad s")
public class SucursalCiudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_sucursal_ciudad")
	private int idSucursalCiudad;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="id_ciudad")
	private Ciudad ciudad;

	//bi-directional many-to-one association to Sucursal
	@ManyToOne
	@JoinColumn(name="id_sucursal")
	private Sucursal sucursal;

	public SucursalCiudad() {
	}

	public int getIdSucursalCiudad() {
		return this.idSucursalCiudad;
	}

	public void setIdSucursalCiudad(int idSucursalCiudad) {
		this.idSucursalCiudad = idSucursalCiudad;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}