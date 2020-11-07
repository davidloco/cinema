package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entidades.Genero;

/**
 * Interfaz de tipo Repository, encargada de manipular información en la bd por
 * medio de JPA para los Generos.
 * 
 * @author David
 */
@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {

}
