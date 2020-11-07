package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entidades.Formato;

/**
 * Interfaz de tipo Repository, encargada de manipular información en la bd por
 * medio de JPA para los formatos.
 * 
 * @author David
 */
@Repository
public interface FormatoRepository extends JpaRepository<Formato, Long> {

}
