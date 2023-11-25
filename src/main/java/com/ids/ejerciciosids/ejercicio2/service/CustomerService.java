package com.ids.ejerciciosids.ejercicio2.service;

import com.ids.ejerciciosids.ejercicio2.entity.Cliente;
import com.ids.ejerciciosids.ejercicio2.repository.ICliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.ids.ejerciciosids.ejercicio2.entity.DatosGenerales.tipoPersona.FISICA;
import static com.ids.ejerciciosids.ejercicio2.entity.DatosGenerales.tipoPersona.MORAL;

/**
 * Clase CustomerService la cual permite implementar los metodos de la interface ICliente
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Clase CustomerService la cual permite implementar los metodos de la interface ICliente"
 * @param "<Cliente>"
 */
public class CustomerService implements ICliente<Cliente> {
    List<Cliente> customers = new ArrayList<>();
     Random random = new Random();

    /**
     * Metodo para buscar todos los clientes
     * @author oscar.d.rodriguez
     * @see "Metodo para buscar todos los clientes"
     * @return type:List<Cliente>
     */
    @Override
    public List<Cliente> buscarTodos() {
        return customers;
    }

    /**
     * Metodo para agregar un cliente
     * @author oscar.d.rodriguez
     * @see "Metodo para agregar un cliente a la lista"
     * @param client type:Cliente
     */
    @Override
    public void agregar(Cliente client) {
        customers.add(client);
    }

    /**
     * Metodo para borrar un cliente
     * @author oscar.d.rodriguez
     * @see "Metodo para borrar un cliente de la lista"
     * @param indice type:int
     */
    @Override
    public void borrar(int indice) {
        customers.remove(indice);
    }

    /**
     * Metodo para buscar crear datos aleatorios de un cliente
     * @author oscar.d.rodriguez
     * @see "Metodo para generar datos aleatorios de un cliente"
     */
    @Override
    public void llenarDatos() {
        boolean val = random.nextBoolean();
        Cliente client;
        if (val){
            client = new Cliente(customers.size() + 1, "nombre" + (customers.size() + 1), "apPaterno" + (customers.size() + 1), "apMaterno" + (customers.size() + 1), MORAL);
        }else{
            client = new Cliente(customers.size() + 1, "nombre" + (customers.size() + 1), "apPaterno" + (customers.size() + 1), "apMaterno" + (customers.size() + 1), FISICA);
        }
        client.saldo();
        agregar(client);
    }
}
