package com.ids.ejerciciosids.ejercicio3;

import com.ids.ejerciciosids.ejercicio3.entity.Cliente;
import com.ids.ejerciciosids.ejercicio3.entity.DatosGenerales;
import com.ids.ejerciciosids.ejercicio3.entity.Proveedor;
import com.ids.ejerciciosids.ejercicio3.service.CustomerService;
import com.ids.ejerciciosids.ejercicio3.service.SupplierService;

import java.sql.SQLException;

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
    public static void main(String[] args) throws SQLException {

        System.out.println("============= LISTAR CLIENTES================");
        CustomerService customerService = new CustomerService();
       System.out.println(customerService.findAll());
        System.out.println("=============GUARDAR CLIENTE================");
        customerService.save(new Cliente("David", "Rodriguez", "Marin", DatosGenerales.tipoPersona.FISICA, 2050.00));
        System.out.println(customerService.findAll());
        System.out.println("=============CLIENTE BY ID============");
        System.out.println(customerService.findById(1));
        System.out.println("=============CLIENTE BORRAR=============");
        customerService.deleteById(1);
        System.out.println(customerService.findAll());
        System.out.println("=============ACTUALIZAR CLIENTE================");
        customerService.update(new Cliente(2, "Pepe", "Rodriguez", "Marin", DatosGenerales.tipoPersona.FISICA, 5000.00));
        System.out.println(customerService.findById(2));

        System.out.println("=============LISTAR BPROVEEDORES================");
        SupplierService supplierService = new SupplierService();
        System.out.println(supplierService.findAll());
        System.out.println("=============GUARDAR PROVEEDOR==============");
        supplierService.save(new Proveedor("Patito", null, null, DatosGenerales.tipoPersona.FISICA, 20.1 ));
        System.out.println(supplierService.findAll());
        System.out.println("=============PROVEEDOR BY ID================");
        System.out.println(supplierService.findById(1));
        System.out.println("=============PROVEEDOR BORRAR================");
        supplierService.deleteById(1);
        System.out.println(supplierService.findAll());
        System.out.println("=============ACTUALIZAR PROVEEDOR==============");
        supplierService.update(new Proveedor(2, "Coca-Cola", null, null, DatosGenerales.tipoPersona.FISICA, 5000.00));
        System.out.println(supplierService.findById(2));
    }
}
