package com.ids.ejerciciosids.ejercicio2.repository;

import java.util.List;

/**
 * Interfaz Proveedor la cual permite realizar operaciones CRUD
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Interfaz de la clase proveedor"
 */
public interface IProveedor<Proveedor> {
    List<Proveedor> buscarTodos();
    public void agregar(Proveedor proveedor);
    public void borrar(int indice);
    public void llenarDatos();
}
