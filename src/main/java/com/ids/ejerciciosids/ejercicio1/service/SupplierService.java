package com.ids.ejerciciosids.ejercicio1.service;

import com.ids.ejerciciosids.ejercicio1.entity.DatosGenerales;
import com.ids.ejerciciosids.ejercicio1.entity.Proveedor;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa los metodos que seran utilizados para
 * Agregar
 * Listar
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Clase Proveedor la cual permite crear un objeto de tipo proveedor"
 */
public class SupplierService {
    List<Proveedor> suppliers = new ArrayList<>();


    /**
     * Metodo que permite ingresar los valores a una lista
     * @author oscar.d.rodriguez
     * @see "Metodo que permite ingresar los valores a una lista"
     */
    public void setSuppliers()  {

        Proveedor proveedor1 = new Proveedor(1, "Empresa S.A. de C.V.","null","null", DatosGenerales.tipoPersona.MORAL);
        Proveedor proveedor2 = new Proveedor(2, "Hernesto","Perez","Galindo",DatosGenerales.tipoPersona.FISICA);

        suppliers.add(proveedor1);
        suppliers.add(proveedor2);
    }

    /**
     * Metodo que permite retornar los valores a una lista
     * @author oscar.d.rodriguez
     * @return type:List
     * @see "Metodo que permite retornar los valores a una lista"
     */
    public List<Proveedor> getSuppliers() {
        return suppliers;
    }
}
