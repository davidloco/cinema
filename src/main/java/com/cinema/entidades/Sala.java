package com.cinema.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sala database table.
 * 
 */
@Entity
@NamedQuery(name="Sala.findAll", query="SELECT s FROM Sala s")
public class Sala implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_sala")
	private int idSala;

	@Column(name="numero_filas")
	private int numeroFilas;

	@ManyToOne
	@JoinColumn(name="id_sucursal")
	private Sucursal id_sucursal;
	
	//bi-directional many-to-one association to Agenda
	@OneToMany(mappedBy="sala")
	private List<Agenda> agendas;

	//bi-directional many-to-one association to FilaSilla
	@OneToMany(mappedBy="sala")
	private List<FilaSilla> filaSillas;

	//bi-directional many-to-one association to Formato
	@ManyToOne
	@JoinColumn(name="tipo_sala")
	private Formato formato;

	public Sala() {
	}

	public int getIdSala() {
		return this.idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public int getNumeroFilas() {
		return this.numeroFilas;
	}

	public void setNumeroFilas(int numeroFilas) {
		this.numeroFilas = numeroFilas;
	}

	public List<Agenda> getAgendas() {
		return this.agendas;
	}

	public void setAgendas(List<Agenda> agendas) {
		this.agendas = agendas;
	}

	public Agenda addAgenda(Agenda agenda) {
		getAgendas().add(agenda);
		agenda.setSala(this);

		return agenda;
	}

	public Agenda removeAgenda(Agenda agenda) {
		getAgendas().remove(agenda);
		agenda.setSala(null);

		return agenda;
	}

	public List<FilaSilla> getFilaSillas() {
		return this.filaSillas;
	}

	public void setFilaSillas(List<FilaSilla> filaSillas) {
		this.filaSillas = filaSillas;
	}

	public FilaSilla addFilaSilla(FilaSilla filaSilla) {
		getFilaSillas().add(filaSilla);
		filaSilla.setSala(this);

		return filaSilla;
	}

	public FilaSilla removeFilaSilla(FilaSilla filaSilla) {
		getFilaSillas().remove(filaSilla);
		filaSilla.setSala(null);

		return filaSilla;
	}

	public Formato getFormato() {
		return this.formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public Sucursal getId_sucursal() {
		return id_sucursal;
	}

	public void setId_sucursal(Sucursal id_sucursal) {
		this.id_sucursal = id_sucursal;
	}

}