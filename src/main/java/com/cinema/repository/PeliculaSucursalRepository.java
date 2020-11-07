package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entidades.PeliculaSucursal;

/**
 * Interfaz de tipo Repository, encargada de manipular información en la bd por
 * medio de JPA para  PeliculaSucursal.
 * 
 * @author David
 */
@Repository
public interface PeliculaSucursalRepository extends JpaRepository<PeliculaSucursal, Long> {

}
