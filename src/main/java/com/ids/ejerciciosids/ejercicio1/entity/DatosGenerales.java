package com.ids.ejerciciosids.ejercicio1.entity;

/**
 * Clase abstracta que representa los datos generales
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see class Abstracta que representa los datos generales
 */
public abstract class DatosGenerales {
    public enum tipoPersona{ FISICA,MORAL}
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private tipoPersona tipoPersona;

    /**
     * Constructor de la clase principal
     * @author oscar.d.rodriguez
     * @see "constructor de la clase principal"
     * @param nombre type String - nombre del cliente
     *@param apPaterno type String - apellido paterno del cliente
     *@param apMaterno type String - apellido materno del cliente
     *@param tipoPersona type String - tipo de persona
     */
    public DatosGenerales(String nombre, String apPaterno, String apMaterno, tipoPersona tipoPersona) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.tipoPersona = tipoPersona;
    }

    /**
     * Metodo obtener para el nombre
     * @author oscar.d.rodriguez
     * @see "Get para el nombre"
     * @return type: String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setear para el nombre
     * @author oscar.d.rodriguez
     * @see "Set para el nombre"
     * @param nombre type:String Identificador del nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo obtener para el apellido paterno
     * @author oscar.d.rodriguez
     * @see "Get para el apellido paterno "
     * @return type: String apellido paterno
     */
    public String getApPaterno() {
        return apPaterno;
    }

    /**
     * Metodo setear para el apellido paterno
     * @author oscar.d.rodriguez
     * @see "Set para el apellido paterno"
     * @param apPaterno type:String apellido paterno
     */
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    /**
     * Metodo obtener para el apellido materno
     * @author oscar.d.rodriguez
     * @see "Get para el apellido materno"
     * @return type: String apellido materno
     */
    public String getApMaterno() {
        return apMaterno;
    }

    /**
     * Metodo setear para el apellido materno
     * @author oscar.d.rodriguez
     * @see "Set para el apellido materno"
     * @param apMaterno type:String apellido materno
     */
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    /**
     * Metodo obtener para el tipo de persona
     * @author oscar.d.rodriguez
     * @see "Get para eltipo de persona"
     * @return type: String apellido materno
     */
    public tipoPersona getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Metodo setear para el tipo de persona
     * @author oscar.d.rodriguez
     * @see "Set para el tipo persona"
     * @param tipoPersona type:TipoPersona tipo persona
     */
    public void setTipoPersona(tipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    /**
     * Metodo abstracto que calcula el saldo de un cliente
     * @author oscar.d.rodriguez
     * @see "Metodo abstracto que calcula el saldo de un cliente"
     */
    public abstract double saldo();


}
