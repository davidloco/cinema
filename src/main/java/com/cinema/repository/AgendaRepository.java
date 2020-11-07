package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entidades.Agenda;

/**
 * Interfaz de tipo Repository, encargada de manipular información en la bd por
 * medio de JPA para las agendas.
 * 
 * @author David
 */
@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
