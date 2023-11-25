package com.ids.ejerciciosids.ejercicio1.service;

import com.ids.ejerciciosids.ejercicio1.entity.Cliente;
import com.ids.ejerciciosids.ejercicio1.entity.DatosGenerales;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa los metodos que seran utilizados para
 * Agregar
 * Listar
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Clase Cliente la cual permite crear un objeto de tipo cliente"
 */
public class CustomerService {
    List<Cliente> customers = new ArrayList<>();

    /**
     * Metodo que permite ingresar los valores a una lista
     * @author oscar.d.rodriguez
     * @see "Metodo que permite ingresar los valores a una lista"
     */
    public void setCustomers()  {

        Cliente client1 = new Cliente(1,"Vicente","Rincon","Villa", DatosGenerales.tipoPersona.MORAL );
        Cliente client2 = new Cliente(2,"Oscar","Ruiz","Hernandez",DatosGenerales.tipoPersona.FISICA );
        Cliente client3 = new Cliente(3,"Empresa-Cliente, S.A de C.V.",null,null,DatosGenerales.tipoPersona.MORAL);
        Cliente client4 = new Cliente(4,"Empresa S.A. de C.V.",null,null,DatosGenerales.tipoPersona.MORAL);

        customers.add(client1);
        customers.add(client2);
        customers.add(client3);
        customers.add(client4);
    }

    /**
     * Metodo que permite retornar los valores a una lista
     * @author oscar.d.rodriguez
     * @return type:List
     * @see "Metodo que permite retornar los valores a una lista"
     */
   public List<Cliente> getCustomers() {
        return customers;
   }
}
