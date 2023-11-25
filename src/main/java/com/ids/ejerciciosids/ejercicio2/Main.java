package com.ids.ejerciciosids.ejercicio2;

import com.ids.ejerciciosids.ejercicio2.service.CustomerService;
import com.ids.ejerciciosids.ejercicio2.service.SupplierService;

/**
 * Clase principal del proyecto
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Clase principal que permite controlar los clientes y proveedores"
 */
public class Main {
    /**
     * Metodo principal del proyecto
     * @author oscar.d.rodriguez
     * @see "Metodo principal que permite controlar los clientes y proveedores"
     */
    public static void main(String[] args) {
        System.out.println("=============CLIENTES================");
        CustomerService customerService = new CustomerService();

        customerService.llenarDatos();
        customerService.llenarDatos();
        customerService.llenarDatos();

        System.out.println(customerService.buscarTodos());
        customerService.borrar(1);
        System.out.println("-------------------------------");
        System.out.println(customerService.buscarTodos());

        System.out.println("=============PROVEEDORES================");
        SupplierService supplierService = new SupplierService();

        supplierService.llenarDatos();
        supplierService.llenarDatos();
        supplierService.llenarDatos();
        System.out.println(supplierService.buscarTodos());
        supplierService.borrar(1);
        System.out.println("-------------------------------");
        System.out.println(supplierService.buscarTodos());
    }
}
