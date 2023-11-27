package com.ids.ejerciciosids.ejercicio3.service;

import com.ids.ejerciciosids.ejercicio3.bd.Conexion;
import com.ids.ejerciciosids.ejercicio3.entity.Cliente;
import com.ids.ejerciciosids.ejercicio3.entity.DatosGenerales;
import com.ids.ejerciciosids.ejercicio3.repository.IContratoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Clase CustomerService la cual permite implementar los metodos de la interface IContratoDAO
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Clase CustomerService la cual permite implementar los metodos de la interface ICliente"
 * @param "<Cliente>"
 */
public class CustomerService  implements IContratoDAO<Cliente> {

    List<Cliente> customers = new ArrayList<>();
     private String tipoPersona;

    /**
     * Metodo para guardar un cliente en la base de datos
     * @author oscar.d.rodriguez
     * @see "Metodo para un cliente"
     * @param cliente type:Cliente
     * @return type:Optional<Cliente>
     */
     @Override
    public Optional<Cliente> save(Cliente cliente) throws SQLException {
         Conexion db_connect = new Conexion();
         try (Connection connection = db_connect.getConnection()) {
             try {
                 String query = "INSERT INTO tblCliente (nombreCliente, apellidoPaterno, apellidoMaterno, tipoPersona, saldoCliente) VALUES (?, ?, ?, ?, ?)";
                 PreparedStatement preparedStatement = connection.prepareStatement(query);
                 preparedStatement.setString(1, cliente.getNombre());
                 preparedStatement.setString(2, cliente.getApPaterno());
                 preparedStatement.setString(3, cliente.getApMaterno());
                 preparedStatement.setString(4, cliente.getTipoPersona().toString());
                 preparedStatement.setDouble(5, cliente.getImporte());
                 preparedStatement.executeUpdate();
                 return Optional.of(cliente);
             } catch (SQLException e) {
                 System.out.println(e.toString());
                 return Optional.empty();
             }
         }
    }

    /**
     * Metodo para buscar uns cliente por su identificador que realiza una consulta a la base de datos
     * @author oscar.d.rodriguez
     * @see "Metodo para buscar un cliente su identificador"
     * @return type:Optional<Cliente>
     */
    @Override
    public Optional<Cliente> findById(Integer id) {
        customers = new ArrayList<>();
        Conexion db_connect = new Conexion();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try (Connection connection = db_connect.getConnection()) {
            try {
                String query = "SELECT * FROM tblCliente WHERE cveCliente = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, id);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    tipoPersona = resultSet.getString("tipoPersona");
                    if (tipoPersona.equals("FISICA")) {
                        Cliente client = new Cliente(
                                resultSet.getInt("cveCliente"),
                                resultSet.getString("nombreCliente"),
                                resultSet.getString("apellidoPaterno"),
                                resultSet.getString("apellidoMaterno"),
                                DatosGenerales.tipoPersona.FISICA,
                                resultSet.getDouble("saldoCliente"));
                        customers.add(client);
                    } else {
                        Cliente client = new Cliente(
                                resultSet.getInt("cveCliente"),
                                resultSet.getString("nombreCliente"),
                                resultSet.getString("apellidoPaterno"),
                                resultSet.getString("apellidoMaterno"),
                                DatosGenerales.tipoPersona.MORAL,
                                resultSet.getDouble("saldoCliente"));
                        customers.add(client);
                    }
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
                return Optional.empty();
            }
        }catch (SQLException e) {
            return Optional.empty();
        }
        return Optional.ofNullable(customers.get(0));
    }

    /**
     * Metodo para buscar todos los clientes que realiza una consulta a la base de datos
     * @author oscar.d.rodriguez
     * @see "Metodo para buscar todos los clientes"
     * @return type:List<Cliente>
     */
    @Override
    public List<Cliente> findAll() {
        customers=new ArrayList<>();
        Conexion db_connect = new Conexion();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try(Connection connection = db_connect.getConnection()) {

            String query = "SELECT * FROM tblCliente";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
              tipoPersona = resultSet.getString("tipoPersona");
                if (tipoPersona.equals("FISICA")){
                    Cliente client = new Cliente(
                            resultSet.getInt("cveCliente"),
                            resultSet.getString("nombreCliente"),
                            resultSet.getString("apellidoPaterno"),
                            resultSet.getString("apellidoMaterno"),
                            DatosGenerales.tipoPersona.FISICA,
                            resultSet.getDouble("saldoCliente"));
                    customers.add(client);
                }else {
                    Cliente client = new Cliente(
                            resultSet.getInt("cveCliente"),
                            resultSet.getString("nombreCliente"),
                            resultSet.getString("apellidoPaterno"),
                            resultSet.getString("apellidoMaterno"),
                            DatosGenerales.tipoPersona.MORAL,
                            resultSet.getDouble("saldoCliente"));
                    customers.add(client);
                    System.out.println(customers);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error no se pudieron recuperar los clientes");
            System.out.println(e);
        }
        return customers;
    }

    /**
     * Metodo para eliminar un cliente que realiza una consulta a la base de datos
     * @author oscar.d.rodriguez
     * @see "Metodo para eliminar un cliente"
     * @param id type:Integer
     */
    @Override
    public void deleteById(Integer id) throws SQLException {
         customers = new ArrayList<>();
        Conexion db_connect = new Conexion();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try (Connection connection = db_connect.getConnection()) {
            try {
                String query = "DELETE FROM tblCliente WHERE cveCliente = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    /**
     * Metodo para actualizar un cliente en la base de datos
     * @author oscar.d.rodriguez
     * @see "Metodo para actualizar un proveedor"
     * @return type:Optional<Cliente>
     * @param client type:Cliente
     */
    @Override
    public Optional<Cliente> update(Cliente client) throws SQLException {
        Conexion db_connect = new Conexion();
        try (Connection connection = db_connect.getConnection()) {
            String query = "UPDATE tblCliente SET nombreCliente = ?, apellidoPaterno = ?, apellidoMaterno = ?, tipoPersona = ?, saldoCliente = ? WHERE cveCliente = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, client.getNombre());
            preparedStatement.setString(2, client.getApMaterno());
            preparedStatement.setString(3, client.getApMaterno());
            preparedStatement.setString(4, client.getTipoPersona().toString());
            preparedStatement.setDouble(5, client.getImporte());
            preparedStatement.setInt(6, client.getCveCliente());
            preparedStatement.executeUpdate();
            return Optional.of(client);
        }catch (SQLException e) {
            return Optional.empty();
        }
    }
}
