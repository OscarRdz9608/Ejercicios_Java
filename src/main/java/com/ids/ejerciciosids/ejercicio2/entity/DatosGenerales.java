package com.ids.ejerciciosids.ejercicio2.entity;

/**
 * Clase Abstracta DatosGenerales la cual permite crear objetos heredados
 * @author oscar.d.rodriguez
 * @version 2.0
 * @see class Abstracta que representa los datos generales
 */
public abstract class DatosGenerales {
    public enum tipoPersona{ FISICA,MORAL}
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private tipoPersona tipoPersona;

    /**
     * Constructor de la clase DatosGenerales
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
     * Metodo para recuperar el nombre
     * @author oscar.d.rodriguez
     * @see "Get para el nombre"
     * @return type: String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para setear el nombre
     * @author oscar.d.rodriguez
     * @see "Set para el nombre"
     * @param nombre type:String Identificador del nombre
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
     * Metodo para setear el apellido paterno
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
     * Metodo para setear el apellido materno
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
     * Metodo para setear el tipo de persona
     * @author oscar.d.rodriguez
     * @see "Set para el tipo persona"
     * @param tipoPersona type:TipoPersona tipo persona
     */
    public void setTipoPersona(tipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    /**
     * Metodo abstracto que calcula el saldo
     * @author oscar.d.rodriguez
     * @see "Metodo abstracto que calcula el saldo"
     */
    public abstract double saldo();


}
