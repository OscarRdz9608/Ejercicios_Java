package com.ids.ejerciciosids.ejercicio3.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que permite conectarse a la base de datos
 * @author oscar.d.rodriguez
 * @version 1.0
 * @since 2022-11-24
 * @see Connection para mySQL
 */
public class Conexion {

    /**
     * Metodo que permite conectarse a la base de datos
     * @author oscar.d.rodriguez
     * @since 2022-11-24
     * @see Connection para mySQL
     * @return Connection con la base de datos
     */
    public Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/store", "root", "");
/*            if (connection != null){
                System.out.println("Conectado!");
            }*/
        }catch(SQLException e){
            System.out.println("error: "+e);
        }return connection;
    }
}
