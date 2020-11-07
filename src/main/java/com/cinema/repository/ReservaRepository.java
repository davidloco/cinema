package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entidades.Reserva;

/**
 * Interfaz de tipo Repository, encargada de manipular información en la bd por
 * medio de JPA para  Reserva.
 * 
 * @author David
 */
@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
