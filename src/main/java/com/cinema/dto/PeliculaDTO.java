package com.cinema.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO que corresponde a la entidad Pelicula y se comunica con el frontend.
 * 
 * @author David
 * 
 */
public class PeliculaDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idPelicula;
	private int duracion;
	private Date fechaBaja;
	private Date fechaEstreno;
	private byte[] imagenPortada;
	private String nombreOriginal;
	private String nombreTraducido;
	private String sinopsis;
	private GeneroDTO genero;
	private FormatoDTO formato;
	
	public PeliculaDTO() {
		super();
	}
	public int getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public Date getFechaEstreno() {
		return fechaEstreno;
	}
	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	public byte[] getImagenPortada() {
		return imagenPortada;
	}
	public void setImagenPortada(byte[] imagenPortada) {
		this.imagenPortada = imagenPortada;
	}
	public String getNombreOriginal() {
		return nombreOriginal;
	}
	public void setNombreOriginal(String nombreOriginal) {
		this.nombreOriginal = nombreOriginal;
	}
	public String getNombreTraducido() {
		return nombreTraducido;
	}
	public void setNombreTraducido(String nombreTraducido) {
		this.nombreTraducido = nombreTraducido;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public GeneroDTO getGenero() {
		return genero;
	}
	public void setGenero(GeneroDTO genero) {
		this.genero = genero;
	}
	public FormatoDTO getFormato() {
		return formato;
	}
	public void setFormato(FormatoDTO formato) {
		this.formato = formato;
	}

}
