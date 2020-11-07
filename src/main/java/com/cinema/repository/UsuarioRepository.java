package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entidades.Usuario;

/**
 * Interfaz de tipo Repository, encargada de manipular información en la bd por
 * medio de JPA para  Usuario.
 * 
 * @author David
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
