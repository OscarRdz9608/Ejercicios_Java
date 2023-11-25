package com.ids.ejerciciosids.ejercicio3.entity;

import java.util.Random;

/**
 *  Clase Cliente la cual permite crear un objeto de tipo cliente la cual contiene
 *  datos del mismo
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Clase Cliente la cual permite crear un objeto de tipo cliente"
 */
public class Cliente extends DatosGenerales {
    private int cveCliente;
    Random random = new Random();

    /**
     * Metodo constructor de la clase cliente
     * @author oscar.d.rodriguez
     * @see "Constructor de la clase cliente"
     * @param cveCliente type:int Identificador del cliente
     * @param nombre type:str Nombre del cliente
     * @param apellidoPaterno type:str Apellido paterno del cliente
     *@param apellidoMaterno type:str Apellido materno del cliente
     * @param tipoPersona type:enum Tipo de persona
     */
    public Cliente(int cveCliente, String nombre, String apellidoPaterno, String apellidoMaterno, tipoPersona tipoPersona, Double saldoCliente) {
        super(nombre, apellidoPaterno, apellidoMaterno, tipoPersona, saldoCliente);
        this.cveCliente = cveCliente;
        this.setSaldoCliente(saldoCliente);
    }

    /**
     * Metodo constructor de la clase cliente sin cveCliente
     * @author oscar.d.rodriguez
     * @see "Constructor de la clase cliente"
     * @param nombre type:str Nombre del cliente
     * @param apellidoPaterno type:str Apellido paterno del cliente
     *@param apellidoMaterno type:str Apellido materno del cliente
     * @param tipoPersona type:enum Tipo de persona
     */
    public Cliente( String nombre, String apellidoPaterno, String apellidoMaterno, tipoPersona tipoPersona, Double saldoCliente) {
        super(nombre, apellidoPaterno, apellidoMaterno, tipoPersona, saldoCliente);
        this.setSaldoCliente(saldoCliente);
    }

    /**
     * Metodo para recuperar el identificador del cliente
     * @author oscar.d.rodriguez
     * @see "Get para el identificador del cliente"
     * @return type:int Identificador del Cliente
     */
    public int getCveCliente() {
        return cveCliente;
    }

    /**
     * Metodo para establecer el identificador del cliente
     * @author oscar.d.rodriguez
     * @see "Set para el identificador del clienteSe"
     * @param cveCliente type:int Identificador del cliente
     */
    public void setCveCliente(int cveCliente) {
        this.cveCliente = cveCliente;
    }

    /**
     * Metodo para obtener el saldo del cliente
     * @author oscar.d.rodriguez
     * @see "Metodo para obtener el saldo del cliente"
     * @return type:double Saldo del cliente
     */
    @Override
    public double saldo() {
        double importe = random.nextDouble() * 1000;
        return Math.round(importe * 100.0) / 100.0;
    }

    /**
     * Metodo toString de la clase cliente
     * @author oscar.d.rodriguez
     * @see "Constructor de la clase cliente que imprime los datos del cliente"
     * @return type:str Datos del cliente
     */
    @Override
    public String toString() {
        return "CveCliente: " + cveCliente + "\nNombre: " + getNombre() + "\nApellido Paterno: " + getApPaterno() + "\nApellido Materno: " + getApMaterno() + ", Tipo Persona: " + getTipoPersona() + "\nSaldo: "+ getSaldoCliente();
    }
}