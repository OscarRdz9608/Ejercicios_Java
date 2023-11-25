package com.ids.ejerciciosids.ejercicio2.service;

import com.ids.ejerciciosids.ejercicio2.entity.Proveedor;
import com.ids.ejerciciosids.ejercicio2.repository.IProveedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.ids.ejerciciosids.ejercicio2.entity.DatosGenerales.tipoPersona.FISICA;
import static com.ids.ejerciciosids.ejercicio2.entity.DatosGenerales.tipoPersona.MORAL;

/**
 * Clase SupplierSService la cual permite implementar los metodos de la interface IProveedor
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Clase SupplierService la cual permite implementar los metodos de la interface IProveedor"
 * @param "<Proveedor>"
 */
public class SupplierService implements IProveedor<Proveedor> {
    List<Proveedor> suppliers = new ArrayList<>();
    Random random = new Random();

    /**
     * Metodo para buscar todos los proveedores
     * @author oscar.d.rodriguez
     * @see "Metodo para buscar todos los proveedores"
     * @return type:List<Proveedor>
     */
    @Override
    public List<Proveedor> buscarTodos() {
        return suppliers;
    }

    /**
     * Metodo para agregar un proveedor
     * @author oscar.d.rodriguez
     * @see "Metodo para agregar un proveedor a la lista"
     * @param proveedor type:Proveedor
     */
    @Override
    public void agregar(Proveedor proveedor) {
        suppliers.add(proveedor);
    }

    /**
     * Metodo para borrar un proveedor
     * @author oscar.d.rodriguez
     * @see "Metodo para borrar un proveedor de la lista"
     * @param indice type:int
     */
    @Override
    public void borrar(int indice) {
        suppliers.remove(indice);
    }

    /**
     * Metodo para buscar crear datos aleatorios de un proveedor
     * @author oscar.d.rodriguez
     * @see "Metodo para generar datos aleatorios de un proveedor"
     */
    @Override
    public void llenarDatos() {
        boolean val = random.nextBoolean();
        Proveedor proveedor;
        if (val){
            proveedor = new Proveedor(suppliers.size() + 1, "nombre" + (suppliers.size() + 1), "apPaterno" + (suppliers.size() + 1), "apMaterno" + (suppliers.size() + 1), MORAL);
        }else{
            proveedor = new Proveedor(suppliers.size() + 1, "nombre" + (suppliers.size() + 1), "apPaterno" + (suppliers.size() + 1), "apMaterno" + (suppliers.size() + 1), FISICA);
        }
        proveedor.saldo();
        agregar(proveedor);
    }
    }

