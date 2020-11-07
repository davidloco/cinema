package com.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cinema.dto.SucursalDTO;
import com.cinema.entidades.Ciudad;
import com.cinema.entidades.Sucursal;
import com.cinema.entidades.SucursalCiudad;
import com.cinema.exception.ResourceNotFoundException;
import com.cinema.repository.CiudadRepository;
import com.cinema.repository.SucursalCiudadRepository;
import com.cinema.repository.SucursalRepository;
import com.cinema.utils.GeneralMapper;

/**
 * Controlador rest donde están expuestos los servicios para manipular
 * información de una sucursal.
 * 
 * @author David
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("cinema/sucursal")
public class SucursalController {
	
	/**
	 * Objetos encargados de realizar la inyección del repository con la anotación
	 * autowired
	 * 
	 * @author David
	 */
	@Autowired
	SucursalRepository sucursalRepository;
	
	@Autowired
	SucursalCiudadRepository sucursalCiudadRepository;
	
	@Autowired
	CiudadRepository ciudadRepository;

	/** Atributo para el manejo del Logger */
	private static Logger logger = LoggerFactory.getLogger(SucursalController.class.getName());

	/**
	 * Método encargado de obtener todos las sucursales.
	 * 
	 * @author David
	 *
	 * @return List<Sucursal> : Listado de todas las sucursales.
	 * 
	 */
	@GetMapping("/obtenerListaSucursales")
	public List<SucursalDTO> obtenerListaSucursales() {
		logger.info("Inicio método obtenerListaSucursales");
		return castearListaSucursalesADTO(sucursalRepository.findAll());
	}
	
	/**
	 * Método encargado de obtener una sucursal dado su id.
	 * 
	 * @author David
	 *
	 * @param idSucursal ID de la sucursal a buscar
	 * @return SucursalDTO : DTO que contiene la información de la sucursal encontrada.
	 * @throws ResourceNotFoundException Cuando no encuentra la sucursal
	 * 
	 * 
	 */
	@GetMapping("/obtenerSucursalPorId/{idSucursal}")
	public ResponseEntity<SucursalDTO> obtenerSucursalPorId(@PathVariable(value = "idSucursal") Long idSucursal)
			throws ResourceNotFoundException {
		logger.info("Inicio método obtenerSucursalPorId");
		Sucursal sucursal = sucursalRepository.findById(idSucursal)
				.orElseThrow(() -> new ResourceNotFoundException("Sucursal no encontrada para el id : " + idSucursal));

		logger.info("Fin método obtenerSucursalPorId");
		return ResponseEntity.ok().body(GeneralMapper.INSTANCE.sucursalToSucursalDTO(sucursal));

	}
	
	/**
	 * Método encargado de almacenar una sucursal en BD 
	 * 
	 * @author David
	 * @param idCiudad ID de la ciudad donde se va a registrar la sucursal
	 * @param sucursalDTO DTO que contiene la información de la sucursal que se desea
	 *                   almacenar.
	 * @return Sucursal : Sucursal que se ha almacenado en bd.
	 */
	@PostMapping("/crearSucursal/{idCiudad}")
	public Sucursal crearSucursal(@Valid @RequestBody SucursalDTO sucursalDTO, @PathVariable(value = "idCiudad") Long idCiudad) 
			throws ResourceNotFoundException {
		logger.info("Inicio método crearSucursal");
	
		Ciudad ciudad = ciudadRepository.findById(idCiudad)
				.orElseThrow(() -> new ResourceNotFoundException("Ciudad no encontrada para el id : " + idCiudad));
		
		Sucursal sucursal = GeneralMapper.INSTANCE.sucursalDTOToSucursal(sucursalDTO);
		sucursalRepository.save(sucursal);
		
		//Se guarda la relación entre Sucursal y Ciudad
		SucursalCiudad sucursalCiudad = new SucursalCiudad();
		sucursalCiudad.setCiudad(ciudad);
		sucursalCiudad.setSucursal(sucursal);
		sucursalCiudadRepository.save(sucursalCiudad);
		
		logger.info("Fin método crearSucursal");
		
		return sucursal;

	}
	
	/**
	 * Método encargado de eliminar una sucursal y su respectiva relación en sucursalCiudad
	 * 
	 * @author David
	 *
	 * @param idSucursal ID de la sucursal a eliminar
	 * @return Map<String, Boolean> : Mapa que contiene el mensaje de que se ha
	 *         eliminado la sucursal
	 * @throws ResourceNotFoundException Cuando no encuentra la sucursal
	 * 
	 */
	@DeleteMapping("/eliminarSucursal/{idSucursal}")
	public Map<String, Boolean> eliminarSucursal(@PathVariable(value = "idSucursal") Long idSucursal)
			throws ResourceNotFoundException {
		logger.info("Inicio método eliminarSucursal");
		
		SucursalCiudad sucursalCiudad = sucursalCiudadRepository.findById(idSucursal)
				.orElseThrow(() -> new ResourceNotFoundException("SucursalCiudad no encontrada para el id  :: " + idSucursal));
		
		sucursalCiudadRepository.delete(sucursalCiudad);
		
		Sucursal sucursal = sucursalRepository.findById(idSucursal)
				.orElseThrow(() -> new ResourceNotFoundException("Sucursal no encontrada para el id  :: " + idSucursal));

		sucursalRepository.delete(sucursal);
		Map<String, Boolean> response = new HashMap<>();
		response.put("eliminada", Boolean.TRUE);
		logger.info("Fin método eliminarSucursal");
		return response;
	}
	
	/**
	 * Método encargado de actualizar una sucursal
	 * 
	 * @author David
	 *
	 * @param idSucursal ID de la sucursal a actualizar
	 * @return Map<String, Boolean> : Mapa que contiene el mensaje de que se ha
	 *         actualizado la sucursal
	 * @throws ResourceNotFoundException Cuando no encuentra la sucursal
	 * 
	 */
	@PutMapping("/actualizarSucursal/{idSucursal}")
	public ResponseEntity<SucursalDTO> actualizarSucursal(@PathVariable(value = "idSucursal") Long idSucursal,
			@Valid @RequestBody SucursalDTO sucursalDTO) throws ResourceNotFoundException {
		logger.info("Inicio método actualizarSucursal");

		Sucursal sucursal = sucursalRepository.findById(idSucursal)
				.orElseThrow(() -> new ResourceNotFoundException("Sucursal no encontrado para el id :: " + idSucursal));

		sucursal.setDireccion(sucursalDTO.getDireccion());
		final Sucursal sucursalActualizada = sucursalRepository.save(sucursal);		
		logger.info("Fin método actualizarSucursal");

		return ResponseEntity.ok(GeneralMapper.INSTANCE.sucursalToSucursalDTO(sucursalActualizada));
	}

	/**
	 * Método encargado de castear una lista de sucursales a su respectivo DTO
	 * 
	 * @author David
	 *
	 * @param listaSucursales lista con las sucursales a pasar a un DTO
	 * @return List<SucursalDTO> : Lista con las sucursales ya dentro de un DTO
	 * 
	 */
	private List<SucursalDTO> castearListaSucursalesADTO(List<Sucursal> listaSucursal) {
		logger.info("Inicio método castearListaSucursalesADTO");
		List<SucursalDTO> listaSucursalDTO = new ArrayList<>();
		for (Sucursal sucursal : listaSucursal) {
			listaSucursalDTO.add(GeneralMapper.INSTANCE.sucursalToSucursalDTO(sucursal));

		}
		logger.info("Fin método castearListaSucursalesADTO");
		return listaSucursalDTO;
	}
	
}
