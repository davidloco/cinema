package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entidades.Sala;

/**
 * Interfaz de tipo Repository, encargada de manipular información en la bd por
 * medio de JPA para  Sala.
 * 
 * @author David
 */
@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {

}
