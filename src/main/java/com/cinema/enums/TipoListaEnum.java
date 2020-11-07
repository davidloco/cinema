package com.cinema.enums;
/**
 * <b>Descripción:<b> Enumeración para registrar los tipo de lista parametricas.
 * 
 * @author David
 * @version
 */
public enum TipoListaEnum {

	// Valores del enum que corresponden a consultas locales


	/** Entidad Rol. */
	ROL("com.adminempresa.entidades.Rol"),
	/** Entidad Formato. */
	FORMATO("com.cinema.entidades.Formato"),
	/** Entidad Genero. */
	GENERO("com.cinema.entidades.Genero"),
	/** Entidad Ciudad. */
	CIUDAD("com.cinema.entidades.Ciudad");

	/** Nombre de la entidad parametrica. */
	private String nombreEntidad;

	/**
	 * Constructor de la enumeración.
	 * 
	 * @param nombreEntidad Nombre de la entidad parametrica.
	 */
	private TipoListaEnum(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;

	}

	/**
	 * Metodo encargado de retornar el valor del atributo nombreEntidad
	 * 
	 * @return El nombreEntidad asociado a la clase
	 */
	public String getNombreEntidad() {
		return nombreEntidad;
	}

}
