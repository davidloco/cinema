package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entidades.FilaSilla;

/**
 * Interfaz de tipo Repository, encargada de manipular información en la bd por
 * medio de JPA para las sillas por filas del sistemas.
 * 
 * @author David
 */
@Repository
public interface FilaSillaRepository extends JpaRepository<FilaSilla, Long> {

}
