package com.ids.ejerciciosids.ejercicio3.entity;

import java.util.Random;

/**
 * Clase Proveedor la cual permite crear un objeto de tipo proveedor la cual contiene
 * datos del mismo
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Clase Proveedor la cual permite crear un objeto de tipo proveedor"
 */
public class Proveedor extends DatosGenerales {

    private int cveProveedor;
    Random random = new Random();

    /**
     * Constructor de la clase proveedor
     * @author oscar.d.rodriguez
     * @see "Constructor de la clase cliente"
     * @param cveProveedor type:int Identificador del proveedor
     * @param nombre type:str Nombre del proveedor
     * @param apellidoPaterno type:str Apellido paterno del proveedor
     *@param apellidoMaterno type:str Apellido materno del proveedor
     * @param tipoPersona type:enum Tipo de persona
     */
    public Proveedor( int cveProveedor, String nombre, String apellidoPaterno, String apellidoMaterno, tipoPersona tipoPersona, double saldo) {
        super(nombre, apellidoPaterno, apellidoMaterno, tipoPersona);
        this.cveProveedor = cveProveedor;
        this.setImporte(saldo);
    }

    /**
     * Constructor de la clase proveedor sin identificador
     * @author oscar.d.rodriguez
     * @see "Constructor de la clase cliente"
     * @param nombre type:str Nombre del proveedor
     * @param apellidoPaterno type:str Apellido paterno del proveedor
     *@param apellidoMaterno type:str Apellido materno del proveedor
     * @param tipoPersona type:enum Tipo de persona
     */
   public Proveedor(String nombre, String apellidoPaterno, String apellidoMaterno, tipoPersona tipoPersona) {
       super(nombre,
               apellidoPaterno,
               apellidoMaterno,
               tipoPersona);
       this.setImporte(saldo());
   }


    /**
     * Metodo para obtener el identificador del proveedor
     * @author oscar.d.rodriguez
     * @see "Get para el identificador del proveedor"
     * @return type:int Identificador del proveedor
     */
    public int getCveProveedor() {
        return cveProveedor;
    }

    /**
     * Metodo para establecer el identificador del proveedor
     * @author oscar.d.rodriguez
     * @see "Set para el identificador del proveedor"
     * @param cveProveedor type:int Identificador del proveedor
     */
    public void setCveProveedor(int cveProveedor) {
        this.cveProveedor = cveProveedor;
    }

    /**
     * Metodo para obtener el saldo del proveedor
     * @author oscar.d.rodriguez
     * @see "Metodo para obtener el saldo del proveedor"
     * @return type:double Saldo del proveedor
     */
    @Override
    public double saldo() {
        double importe = random.nextDouble() * 1000;
        return Math.round(importe * 100.0) / 100.0;
    }

    /**
     * Metodo para imprimir la información del proveedor
     * @author oscar.d.rodriguez
     * @see "Constructor de la clase proveedor que imprime la información del proveedor"
     * @return type:str Datos del proveedor
     */
    @Override
    public String toString() {
        return "CveProveedor: " + cveProveedor + "\nNombre: " + getNombre() + "\nApellido Paterno: " + getApPaterno() + "\nApellido Materno: " + getApMaterno() + ", Tipo Persona: " + getTipoPersona() + "\nSaldo: "+ getImporte();
    }



}
