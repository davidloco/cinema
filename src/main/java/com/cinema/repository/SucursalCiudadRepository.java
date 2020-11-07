package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entidades.SucursalCiudad;

/**
 * Interfaz de tipo Repository, encargada de manipular información en la bd por
 * medio de JPA para  SucursalCiudad.
 * 
 * @author David
 */
@Repository
public interface SucursalCiudadRepository extends JpaRepository<SucursalCiudad, Long> {

}
