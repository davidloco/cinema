package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entidades.Ciudad;

/**
 * Interfaz de tipo Repository, encargada de manipular información en la bd por
 * medio de JPA para las ciudades.
 * 
 * @author David
 */
@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

}
