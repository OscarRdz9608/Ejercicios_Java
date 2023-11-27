package com.ids.ejerciciosids.ejercicio3.repository;

import com.ids.ejerciciosids.ejercicio3.entity.Cliente;

import java.util.List;
import java.util.Optional;
import java.sql.SQLException;

/**
 * Interfaz ICONTRATODAO la cual permite realizar operaciones CRUD
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Interfaz de la clase contrato"
 */
public interface IContratoDAO<Object> {
    Optional<Object> save(Object object) throws SQLException;

    Optional<Object> findById(Integer id);

    List<Object> findAll();

    void deleteById(Integer id) throws SQLException;

    Optional<Object> update(Object object) throws SQLException;
}
