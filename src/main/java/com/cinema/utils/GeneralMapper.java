package com.cinema.utils;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.cinema.dto.AgendaDTO;
import com.cinema.dto.CiudadDTO;
import com.cinema.dto.FilaSillaDTO;
import com.cinema.dto.FormatoDTO;
import com.cinema.dto.GeneroDTO;
import com.cinema.dto.PeliculaDTO;
import com.cinema.dto.PeliculaSucursalDTO;
import com.cinema.dto.SalaDTO;
import com.cinema.dto.SucursalCiudadDTO;
import com.cinema.dto.SucursalDTO;
import com.cinema.entidades.Agenda;
import com.cinema.entidades.Ciudad;
import com.cinema.entidades.FilaSilla;
import com.cinema.entidades.Formato;
import com.cinema.entidades.Genero;
import com.cinema.entidades.Pelicula;
import com.cinema.entidades.PeliculaSucursal;
import com.cinema.entidades.Sala;
import com.cinema.entidades.Sucursal;
import com.cinema.entidades.SucursalCiudad;



@Mapper
public interface GeneralMapper {

	/**
	 * Se crea una instancia del mapper que estará expuesto.
	 * 
	 * @author David
	 */
	GeneralMapper INSTANCE = Mappers.getMapper(GeneralMapper.class);

	/**
	 * Método encargado de convertir un DTO de tipo AgendaDTO a la entidad
	 * Agenda
	 * 
	 * @author David
	 * @param agendaDTO DTO que contiene la información de la agenda
	 * @return <code>Agenda</code> retorna una entidad Agenda con
	 *         los datos de agenda.
	 */
	@Mapping(source = "sala.idSala", target = "sala.idSala")
	@Mapping(source = "sala.numeroFilas", target = "sala.numeroFilas")
	@Mapping(source = "sala.formato.idFormato", target = "sala.formato.idFormato")
	@Mapping(source = "sala.formato.nombre", target = "sala.formato.nombre")
	
	Agenda agendaDTOToAgenda(AgendaDTO agendaDTO);
	
	
	/**
	 * Método encargado de convertir una entidad de tipo Agenda a su respectivo
	 * DTO AgendaDTO
	 * 
	 * @author David
	 * @param agenda Entidad que contiene la información de agenda
	 * @return <code>AgendaDTO</code> retorna un objeto de tipo AgendaDTO con
	 *         los datos de agenda.
	 */
	@Mapping(source = "sala.idSala", target = "sala.idSala")
	@Mapping(source = "sala.numeroFilas", target = "sala.numeroFilas")
	@Mapping(source = "sala.formato.idFormato", target = "sala.formato.idFormato")
	@Mapping(source = "sala.formato.nombre", target = "sala.formato.nombre")
	AgendaDTO agendaToAgendaDTO(Agenda agenda);

		
	/**
	 * Método encargado de convertir un DTO de tipo CiudadDTO a la entidad
	 * Ciudad
	 * 
	 * @author David
	 * @param ciudadDTO DTO que contiene la información de ciudad
	 * @return <code>Ciudad</code> retorna una entidad Ciudad con
	 *         los datos de ciudad.
	 */
	Ciudad ciudadDTOToCiudad(CiudadDTO ciudadDTO);
	
	
	/**
	 * Método encargado de convertir una entidad de tipo Ciudad a su respectivo
	 * DTO CiudadDTO
	 * 
	 * @author David
	 * @param ciudad Entidad que contiene la información de ciudad
	 * @return <code>CiudadDTO</code> retorna un objeto de tipo CiudadDTO con
	 *         los datos de ciudad.
	 */
	CiudadDTO ciudadToCiudadDTO(Ciudad ciudad);
	
	/**
	 * Método encargado de convertir un DTO de tipo FilaSillaDTO a la entidad
	 * FilaSilla
	 * 
	 * @author David
	 * @param filaSillaDTO DTO que contiene la información de filaSilla
	 * @return <code>FilaSilla</code> retorna una entidad FilaSilla con
	 *         los datos de filaSilla.
	 */
	@Mapping(source = "sala.idSala", target = "sala.idSala")
	@Mapping(source = "sala.numeroFilas", target = "sala.numeroFilas")
	@Mapping(source = "sala.formato.idFormato", target = "sala.formato.idFormato")
	@Mapping(source = "sala.formato.nombre", target = "sala.formato.nombre")
	FilaSilla filaSillaDTOToFilaSilla(FilaSillaDTO filaSillaDTO);
	
	/**
	 * Método encargado de convertir una entidad de tipo FilaSilla a su respectivo
	 * DTO FilaSillaDTO
	 * 
	 * @author David
	 * @param filaSilla Entidad que contiene la información de filaSilla
	 * @return <code>FilaSillaDTO</code> retorna un objeto de tipo FilaSillaDTO con
	 *         los datos de filasilla.
	 */
	@Mapping(source = "sala.idSala", target = "sala.idSala")
	@Mapping(source = "sala.numeroFilas", target = "sala.numeroFilas")
	@Mapping(source = "sala.formato.idFormato", target = "sala.formato.idFormato")
	@Mapping(source = "sala.formato.nombre", target = "sala.formato.nombre")
	FilaSillaDTO filaSillaToFilaSillaDTO(FilaSilla filaSilla);
	
	/**
	 * Método encargado de convertir un DTO de tipo FormatoDTO a la entidad
	 * Formato
	 * 
	 * @author David
	 * @param formatoDTO DTO que contiene la información de formato
	 * @return <code>Formato</code> retorna una entidad Formato con
	 *         los datos de formato.
	 */
	Formato formatoDTOToFormato(FormatoDTO formatoDTO);
	

	/**
	 * Método encargado de convertir una entidad de tipo Formato a su respectivo
	 * DTO FormatoDTO
	 * 
	 * @author David
	 * @param formato Entidad que contiene la información de formato
	 * @return <code>FormatoDTO</code> retorna un objeto de tipo FormatoDTO con
	 *         los datos de formato.
	 */
	FormatoDTO formatoToFormatoDTO(Formato formato);
	
	/**
	 * Método encargado de convertir un DTO de tipo GeneroDTO a la entidad
	 * Genero
	 * 
	 * @author David
	 * @param generoDTO DTO que contiene la información de genero
	 * @return <code>Genero</code> retorna una entidad Genero con
	 *         los datos de genero.
	 */
	Genero generoDTOToGenero(GeneroDTO generoDTO);
	

	/**
	 * Método encargado de convertir una entidad de tipo Genero a su respectivo
	 * DTO GeneroDTO
	 * 
	 * @author David
	 * @param genero Entidad que contiene la información de genero
	 * @return <code>GeneroDTO</code> retorna un objeto de tipo GeneroDTO con
	 *         los datos de genero.
	 */
	GeneroDTO generoToGeneroDTO(Genero genero);
	
	/**
	 * Método encargado de convertir un DTO de tipo PeliculaDTO a la entidad
	 * Pelicula
	 * 
	 * @author David
	 * @param peliculaDTO DTO que contiene la información de pelicula
	 * @return <code>Pelicula</code> retorna una entidad Pelicula con
	 *         los datos de pelicula.
	 */
	@Mapping(source = "genero.idGenero", target = "genero.idGenero")
	@Mapping(source = "genero.nombre", target = "genero.nombre")
	@Mapping(source = "formato.idFormato", target = "formato.idFormato")
	@Mapping(source = "formato.nombre", target = "formato.nombre")
	Pelicula peliculaDTOToPelicula(PeliculaDTO peliculaDTO);
	
	/**
	 * Método encargado de convertir una entidad de tipo Pelicula a su respectivo
	 * DTO PeliculaDTO
	 * 
	 * @author David
	 * @param pelicula Entidad que contiene la información de Pelicula
	 * @return <code>PeliculaDTO</code> retorna un objeto de tipo PeliculaDTO con
	 *         los datos de pelicula.
	 */
	@Mapping(source = "genero.idGenero", target = "genero.idGenero")
	@Mapping(source = "genero.nombre", target = "genero.nombre")
	@Mapping(source = "formato.idFormato", target = "formato.idFormato")
	@Mapping(source = "formato.nombre", target = "formato.nombre")
	PeliculaDTO peliculaToPeliculaDTO(Pelicula pelicula);
	
	/**
	 * Método encargado de convertir un DTO de tipo PeliculaSucursalDTO a la entidad
	 * PeliculaSucursal
	 * 
	 * @author David
	 * @param peliculaSucursalDTO DTO que contiene la información de peliculaSucursal
	 * @return <code>PeliculaSucursal</code> retorna una entidad PeliculaSucursal con
	 *         los datos de peliculaSucursal.
	 */
	@Mapping(source = "pelicula.idPelicula", target = "pelicula.idPelicula")
	@Mapping(source = "pelicula.duracion", target = "pelicula.duracion")
	@Mapping(source = "pelicula.fechaBaja", target = "pelicula.fechaBaja")
	@Mapping(source = "pelicula.fechaEstreno", target = "pelicula.fechaEstreno")
	@Mapping(source = "pelicula.imagenPortada", target = "pelicula.imagenPortada")
	@Mapping(source = "pelicula.nombreOriginal", target = "pelicula.nombreOriginal")
	@Mapping(source = "pelicula.nombreTraducido", target = "pelicula.nombreTraducido")
	@Mapping(source = "pelicula.sinopsis", target = "pelicula.sinopsis")
	@Mapping(source = "pelicula.genero.idGenero", target = "pelicula.genero.idGenero")
	@Mapping(source = "pelicula.genero.nombre", target = "pelicula.genero.nombre")
	@Mapping(source = "pelicula.formato.idFormato", target = "pelicula.formato.idFormato")
	@Mapping(source = "pelicula.formato.nombre", target = "pelicula.formato.nombre")
	@Mapping(source = "sucursal.idSucursal", target = "sucursal.idSucursal")
	@Mapping(source = "sucursal.direccion", target = "sucursal.direccion")
	@Mapping(source = "sucursal.nombre", target = "sucursal.nombre")
	@Mapping(source = "sucursal.usuario.idUsuario", target = "sucursal.usuario.idUsuario")
	@Mapping(source = "sucursal.usuario.nombreUsuario", target = "sucursal.usuario.nombreUsuario")
	@Mapping(source = "sucursal.usuario.idRol.idRol", target = "sucursal.usuario.idRol.idRol")
	@Mapping(source = "sucursal.usuario.idRol.nombre", target = "sucursal.usuario.idRol.nombre")
	
	PeliculaSucursal peliculaSucursalDTOToPeliculaSucursal(PeliculaSucursalDTO peliculasucursalDTO);
	
	/**
	 * Método encargado de convertir una entidad de tipo PeliculaSucursal a su respectivo
	 * DTO PeliculaSucursalDTO
	 * 
	 * @author David
	 * @param peliculaSucursal Entidad que contiene la información de PeliculaSucursal
	 * @return <code>PeliculaSucursalDTO</code> retorna un objeto de tipo PeliculaSucursalDTO con
	 *         los datos de peliculaSucursal.
	 */
	@Mapping(source = "pelicula.idPelicula", target = "pelicula.idPelicula")
	@Mapping(source = "pelicula.duracion", target = "pelicula.duracion")
	@Mapping(source = "pelicula.fechaBaja", target = "pelicula.fechaBaja")
	@Mapping(source = "pelicula.fechaEstreno", target = "pelicula.fechaEstreno")
	@Mapping(source = "pelicula.imagenPortada", target = "pelicula.imagenPortada")
	@Mapping(source = "pelicula.nombreOriginal", target = "pelicula.nombreOriginal")
	@Mapping(source = "pelicula.nombreTraducido", target = "pelicula.nombreTraducido")
	@Mapping(source = "pelicula.sinopsis", target = "pelicula.sinopsis")
	@Mapping(source = "pelicula.genero.idGenero", target = "pelicula.genero.idGenero")
	@Mapping(source = "pelicula.genero.nombre", target = "pelicula.genero.nombre")
	@Mapping(source = "pelicula.formato.idFormato", target = "pelicula.formato.idFormato")
	@Mapping(source = "pelicula.formato.nombre", target = "pelicula.formato.nombre")
	@Mapping(source = "sucursal.idSucursal", target = "sucursal.idSucursal")
	@Mapping(source = "sucursal.direccion", target = "sucursal.direccion")
	@Mapping(source = "sucursal.nombre", target = "sucursal.nombre")
	@Mapping(source = "sucursal.usuario.idUsuario", target = "sucursal.usuario.idUsuario")
	@Mapping(source = "sucursal.usuario.nombreUsuario", target = "sucursal.usuario.nombreUsuario")
	@Mapping(source = "sucursal.usuario.idRol.idRol", target = "sucursal.usuario.idRol.idRol")
	@Mapping(source = "sucursal.usuario.idRol.nombre", target = "sucursal.usuario.idRol.nombre")
	PeliculaSucursalDTO peliculaSucursalToPeliculaSucursalDTO(PeliculaSucursal peliculaSucursal);
	
	/**
	 * Método encargado de convertir un DTO de tipo SucursalDTO a la entidad
	 * Sucursal
	 * 
	 * @author David
	 * @param sucursalDTO DTO que contiene la información de la sucursal
	 * @return <code>Sucursal</code> retorna una entidad Sucursal con
	 *         los datos de sucursal.
	 */
	@Mapping(source = "sucursal.idSucursal", target = "sucursal.idSucursal")
	@Mapping(source = "sucursal.direccion", target = "sucursal.direccion")
	@Mapping(source = "sucursal.nombre", target = "sucursal.nombre")
	@Mapping(source = "sucursal.usuario.idUsuario", target = "sucursal.usuario.idUsuario")
	@Mapping(source = "sucursal.usuario.nombreUsuario", target = "sucursal.usuario.nombreUsuario")
	@Mapping(source = "sucursal.usuario.idRol.idRol", target = "sucursal.usuario.idRol.idRol")
	@Mapping(source = "sucursal.usuario.idRol.nombre", target = "sucursal.usuario.idRol.nombre")
	
	Sucursal sucursalDTOToSucursal(SucursalDTO sucursalDTO);
	
	
	/**
	 * Método encargado de convertir una entidad de tipo Sucursal a su respectivo
	 * DTO SucursalDTO
	 * 
	 * @author David
	 * @param sucursal Entidad que contiene la información de Sucursal
	 * @return <code>SucursalDTO</code> retorna un objeto de tipo SucursalDTO con
	 *         los datos de Sucursal.
	 */
	@Mapping(source = "sucursal.idSucursal", target = "sucursal.idSucursal")
	@Mapping(source = "sucursal.direccion", target = "sucursal.direccion")
	@Mapping(source = "sucursal.nombre", target = "sucursal.nombre")
	@Mapping(source = "sucursal.usuario.idUsuario", target = "sucursal.usuario.idUsuario")
	@Mapping(source = "sucursal.usuario.nombreUsuario", target = "sucursal.usuario.nombreUsuario")
	@Mapping(source = "sucursal.usuario.idRol.idRol", target = "sucursal.usuario.idRol.idRol")
	@Mapping(source = "sucursal.usuario.idRol.nombre", target = "sucursal.usuario.idRol.nombre")
	SucursalDTO sucursalToSucursalDTO(Sucursal sucursal);
	
	/**
	 * Método encargado de convertir un DTO de tipo SucursalCiudadDTO a la entidad
	 * SucursalCiudad
	 * 
	 * @author David
	 * @param sucursalCiudadDTO DTO que contiene la información de la SucursalCiudad
	 * @return <code>SucursalCiudad</code> retorna una entidad SucursalCiudad con
	 *         los datos de SucursalCiudad.
	 */
	@Mapping(source = "sucursal.idSucursal", target = "sucursal.idSucursal")
	@Mapping(source = "sucursal.direccion", target = "sucursal.direccion")
	@Mapping(source = "sucursal.nombre", target = "sucursal.nombre")
	@Mapping(source = "sucursal.usuario.idUsuario", target = "sucursal.usuario.idUsuario")
	@Mapping(source = "sucursal.usuario.nombreUsuario", target = "sucursal.usuario.nombreUsuario")
	@Mapping(source = "sucursal.usuario.idRol.idRol", target = "sucursal.usuario.idRol.idRol")
	@Mapping(source = "sucursal.usuario.idRol.nombre", target = "sucursal.usuario.idRol.nombre")
	@Mapping(source = "ciudad.idCiudad", target = "ciudad.idCiudad")
	@Mapping(source = "ciudad.nombre", target = "ciudad.nombre")
	SucursalCiudad sucursalCiudadDTOToSucursalCiudad(SucursalCiudadDTO sucursalCiudadDTO);
	
	
	/**
	 * Método encargado de convertir una entidad de tipo SucursalCiudad a su respectivo
	 * DTO SucursalCiudadDTO
	 * 
	 * @author David
	 * @param sucursalCiudad Entidad que contiene la información de SucursalCiudad
	 * @return <code>SucursalCiudadDTO</code> retorna un objeto de tipo SucursalCiudadDTO con
	 *         los datos de SucursalCiudad.
	 */
	@Mapping(source = "sucursal.idSucursal", target = "sucursal.idSucursal")
	@Mapping(source = "sucursal.direccion", target = "sucursal.direccion")
	@Mapping(source = "sucursal.nombre", target = "sucursal.nombre")
	@Mapping(source = "sucursal.usuario.idUsuario", target = "sucursal.usuario.idUsuario")
	@Mapping(source = "sucursal.usuario.nombreUsuario", target = "sucursal.usuario.nombreUsuario")
	@Mapping(source = "sucursal.usuario.idRol.idRol", target = "sucursal.usuario.idRol.idRol")
	@Mapping(source = "sucursal.usuario.idRol.nombre", target = "sucursal.usuario.idRol.nombre")
	@Mapping(source = "ciudad.idCiudad", target = "ciudad.idCiudad")
	@Mapping(source = "ciudad.nombre", target = "ciudad.nombre")
	SucursalCiudadDTO sucursalCiudadToSucursalCiudadDTO(SucursalCiudad sucursalCiudad);
	
	/**
	 * Método encargado de convertir un DTO de tipo SalaDTO a la entidad
	 * Sala
	 * 
	 * @author David
	 * @param SalaDTO DTO que contiene la información de la SalaDTO
	 * @return <code>Sala</code> retorna una entidad Sala con
	 *         los datos de Sala.
	 */
	@Mapping(source = "formato.idFormato", target = "formato.idFormato")
	@Mapping(source = "formato.nombre", target = "formato.nombre")
	@Mapping(source = "sucursal.idSucursal", target = "sucursal.idSucursal")
	@Mapping(source = "sucursal.direccion", target = "sucursal.direccion")
	@Mapping(source = "sucursal.nombre", target = "sucursal.nombre")
	@Mapping(source = "sucursal.usuario.idUsuario", target = "sucursal.usuario.idUsuario")
	@Mapping(source = "sucursal.usuario.nombreUsuario", target = "sucursal.usuario.nombreUsuario")
	@Mapping(source = "sucursal.usuario.idRol.idRol", target = "sucursal.usuario.idRol.idRol")
	@Mapping(source = "sucursal.usuario.idRol.nombre", target = "sucursal.usuario.idRol.nombre")
	Sala salaDTOToSala(SalaDTO salaDTO);
	
	
	/**
	 * Método encargado de convertir una entidad de tipo Sala a su respectivo
	 * DTO SalaDTO
	 * 
	 * @author David
	 * @param sala Entidad que contiene la información de Sala
	 * @return <code>SalaDTO</code> retorna un objeto de tipo SalaDTO con
	 *         los datos de sala.
	 */
	@Mapping(source = "formato.idFormato", target = "formato.idFormato")
	@Mapping(source = "formato.nombre", target = "formato.nombre")
	@Mapping(source = "sucursal.idSucursal", target = "sucursal.idSucursal")
	@Mapping(source = "sucursal.direccion", target = "sucursal.direccion")
	@Mapping(source = "sucursal.nombre", target = "sucursal.nombre")
	@Mapping(source = "sucursal.usuario.idUsuario", target = "sucursal.usuario.idUsuario")
	@Mapping(source = "sucursal.usuario.nombreUsuario", target = "sucursal.usuario.nombreUsuario")
	@Mapping(source = "sucursal.usuario.idRol.idRol", target = "sucursal.usuario.idRol.idRol")
	@Mapping(source = "sucursal.usuario.idRol.nombre", target = "sucursal.usuario.idRol.nombre")
	SalaDTO salaToSalaDTO(Sala sala);
	
}