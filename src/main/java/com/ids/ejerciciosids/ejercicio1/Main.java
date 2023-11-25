package com.ids.ejerciciosids.ejercicio1;

import com.ids.ejerciciosids.ejercicio1.service.CustomerService;
import com.ids.ejerciciosids.ejercicio1.service.SupplierService;
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
        customerService.setCustomers();
        System.out.println(customerService.getCustomers());

        System.out.println("=============PROVEEDORES=============");
        SupplierService supplierService = new SupplierService();
        supplierService.setSuppliers();
        System.out.println(supplierService.getSuppliers());
    }
}
