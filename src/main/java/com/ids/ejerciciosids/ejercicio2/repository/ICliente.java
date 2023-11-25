package com.ids.ejerciciosids.ejercicio2.repository;

import com.ids.ejerciciosids.ejercicio1.entity.Cliente;

import java.util.List;

/**
 * Interfaz Cliente la cual permite realizar operaciones CRUD
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Interfaz de la clase cliente"
 */
public interface ICliente<Cliente> {
    List<Cliente> buscarTodos();
    public void agregar(Cliente client);
    public void borrar(int indice);
    public void llenarDatos();
}
