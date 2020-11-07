package com.cinema.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the pelicula database table.
 * 
 */
@Entity
@NamedQuery(name="Pelicula.findAll", query="SELECT p FROM Pelicula p")
public class Pelicula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_pelicula")
	private int idPelicula;

	private int duracion;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_baja")
	private Date fechaBaja;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_estreno")
	private Date fechaEstreno;

	@Lob
	@Column(name="imagen_portada")
	private byte[] imagenPortada;

	@Column(name="nombre_original")
	private String nombreOriginal;

	@Column(name="nombre_traducido")
	private String nombreTraducido;

	private String sinopsis;

	//bi-directional many-to-one association to Agenda
	@OneToMany(mappedBy="pelicula")
	private List<Agenda> agendas;

	//bi-directional many-to-one association to Genero
	@ManyToOne
	@JoinColumn(name="id_genero")
	private Genero genero;

	//bi-directional many-to-one association to Formato
	@ManyToOne
	@JoinColumn(name="id_formato")
	private Formato formato;

	//bi-directional many-to-one association to PeliculaSucursal
	@OneToMany(mappedBy="pelicula")
	private List<PeliculaSucursal> peliculaSucursals;

	public Pelicula() {
	}

	public int getIdPelicula() {
		return this.idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Date getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Date getFechaEstreno() {
		return this.fechaEstreno;
	}

	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public byte[] getImagenPortada() {
		return this.imagenPortada;
	}

	public void setImagenPortada(byte[] imagenPortada) {
		this.imagenPortada = imagenPortada;
	}

	public String getNombreOriginal() {
		return this.nombreOriginal;
	}

	public void setNombreOriginal(String nombreOriginal) {
		this.nombreOriginal = nombreOriginal;
	}

	public String getNombreTraducido() {
		return this.nombreTraducido;
	}

	public void setNombreTraducido(String nombreTraducido) {
		this.nombreTraducido = nombreTraducido;
	}

	public String getSinopsis() {
		return this.sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public List<Agenda> getAgendas() {
		return this.agendas;
	}

	public void setAgendas(List<Agenda> agendas) {
		this.agendas = agendas;
	}

	public Agenda addAgenda(Agenda agenda) {
		getAgendas().add(agenda);
		agenda.setPelicula(this);

		return agenda;
	}

	public Agenda removeAgenda(Agenda agenda) {
		getAgendas().remove(agenda);
		agenda.setPelicula(null);

		return agenda;
	}

	public Genero getGenero() {
		return this.genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Formato getFormato() {
		return this.formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public List<PeliculaSucursal> getPeliculaSucursals() {
		return this.peliculaSucursals;
	}

	public void setPeliculaSucursals(List<PeliculaSucursal> peliculaSucursals) {
		this.peliculaSucursals = peliculaSucursals;
	}

	public PeliculaSucursal addPeliculaSucursal(PeliculaSucursal peliculaSucursal) {
		getPeliculaSucursals().add(peliculaSucursal);
		peliculaSucursal.setPelicula(this);

		return peliculaSucursal;
	}

	public PeliculaSucursal removePeliculaSucursal(PeliculaSucursal peliculaSucursal) {
		getPeliculaSucursals().remove(peliculaSucursal);
		peliculaSucursal.setPelicula(null);

		return peliculaSucursal;
	}

}