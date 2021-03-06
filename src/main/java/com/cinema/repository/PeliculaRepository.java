package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entidades.Pelicula;

/**
 * Interfaz de tipo Repository, encargada de manipular información en la bd por
 * medio de JPA para las Peliculas.
 * 
 * @author David
 */
@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

}
