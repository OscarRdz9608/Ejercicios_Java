package com.ids.ejerciciosids.ejercicio3.entity;

/**
 * Clase Abstracta DatosGenerales la cual permite crear objetos heredados
 * @author oscar.d.rodriguez
 * @version 3.0
 * @see class Abstracta que representa los datos generales de un cliente
 */
public abstract class DatosGenerales {
    public enum tipoPersona{ FISICA,MORAL}
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private tipoPersona tipoPersona;
    private double saldoCliente;

    /**
     * Constructor de la clase principal
     * @author oscar.d.rodriguez
     * @see "constructor de la clase principal"
     * @param nombre type String - nombre del cliente
     *@param apPaterno type String - apellido paterno del cliente
     *@param apMaterno type String - apellido materno del cliente
     *@param tipoPersona type String - tipo de persona
     */
    public DatosGenerales(String nombre, String apPaterno, String apMaterno, tipoPersona tipoPersona, Double saldo) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.tipoPersona = tipoPersona;
        this.saldoCliente = saldo;
    }

    /**
     * Metodo para recuperar el nombre
     * @author oscar.d.rodriguez
     * @see "Get para el nombre"
     * @return type: String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para establecer el nombre
     * @author oscar.d.rodriguez
     * @see "Get para el apellido paterno "
     * @return type: String apellido paterno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para recuperar el apellido paterno
     * @author oscar.d.rodriguez
     * @see "Get para el apellido paterno "
     * @return type: String apellido paterno
     */
    public String getApPaterno() {
        return apPaterno;
    }

    /**
     * Metodo para establecer el apellido paterno
     * @author oscar.d.rodriguez
     * @see "Set para el apellido paterno "
     * @param apPaterno type:String apellido paterno
     */
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    /**
     * Metodo para recuperar el apellido materno
     * @author oscar.d.rodriguez
     * @see "Get para el apellido materno "
     * @return type: String apellido materno
     */
    public String getApMaterno() {
        return apMaterno;
    }

    /**
     * Metodo para establecer el apellido materno
     * @author oscar.d.rodriguez
     * @see "Set para el apellido materno "
     * @param apMaterno type:String apellido materno
     */
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    /**
     * Metodo para recuperar el tipo de persona
     * @author oscar.d.rodriguez
     * @see "Get para eltipo de persona"
     * @return type: String apellido materno
     */
    public tipoPersona getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Metodo para establecer el tipo de persona
     * @author oscar.d.rodriguez
     * @see "Set para el tipo persona"
     * @param tipoPersona type:TipoPersona tipo persona
     */
    public void setTipoPersona(tipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    /**
     * Metodo para recuperar el saldo
     * @author oscar.d.rodriguez
     * @see "Get para el saldo del cliente"
     * @return type: String apellido materno
     */
    public  double getSaldoCliente() {
        return saldoCliente;
    }

    /**
     * Metodo para establecer el saldo del cliente
     * @author oscar.d.rodriguez
     * @see "Set para el saldo del cliente"
     * @param saldoCliente type:double saldo
     */
    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    /**
     * Metodo abstracto que calcula el saldo
     * @author oscar.d.rodriguez
     * @see "Metodo abstracto que calcula el saldo"
     */
    public abstract double saldo();
}
