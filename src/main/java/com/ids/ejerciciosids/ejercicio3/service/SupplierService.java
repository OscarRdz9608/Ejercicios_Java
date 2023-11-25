package com.ids.ejerciciosids.ejercicio3.service;

import com.ids.ejerciciosids.ejercicio3.bd.Conexion;
import com.ids.ejerciciosids.ejercicio3.entity.Cliente;
import com.ids.ejerciciosids.ejercicio3.entity.DatosGenerales;
import com.ids.ejerciciosids.ejercicio3.entity.Proveedor;
import com.ids.ejerciciosids.ejercicio3.repository.IContratoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Clase SupplierSService la cual permite implementar los metodos de la interface IContratoDAO
 * @author oscar.d.rodriguez
 * @version 1.0
 * @see "Clase SupplierSService la cual permite implementar los metodos de la interface IContratoDAO"
 * @param "<Proveedor>"
 */
public class SupplierService implements IContratoDAO<Proveedor> {

    List<Proveedor> suppliers = new ArrayList<>();
    private String tipoPersona;

    /**
     * Metodo para guardar un proveedor en la base de datos
     * @author oscar.d.rodriguez
     * @see "Metodo para un proveedor"
     * @return type:Optional<Proveedor>
     * @param proveedor type:Proveedor
     */
    @Override
    public Optional<Proveedor> save(Proveedor proveedor) throws SQLException {
        Conexion db_connect = new Conexion();
        try (Connection connection = db_connect.getConnection()) {
            try {
                String query = "INSERT INTO tblProveedor (nombreProveedor, apellidoPaterno, apellidoMaterno, tipoPersona, saldoCliente) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, proveedor.getNombre());
                preparedStatement.setString(2, proveedor.getApPaterno());
                preparedStatement.setString(3, proveedor.getApMaterno());
                preparedStatement.setString(4, proveedor.getTipoPersona().toString());
                preparedStatement.setDouble(5, proveedor.getSaldoCliente());
                preparedStatement.executeUpdate();
                return Optional.of(proveedor);
            } catch (SQLException e) {
                System.out.println(e);
                return Optional.empty();
            }
        }
    }

    /**
     * Metodo para buscar uns proveedor por su identificador que realiza una consulta a la base de datos
     * @author oscar.d.rodriguez
     * @see "Metodo para buscar un proveedor su identificador"
     * @return type:Optional<Proveedor>
     */
    @Override
    public Optional<Proveedor> findById(Integer id) {
        suppliers = new ArrayList<>();
        Conexion db_connect = new Conexion();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try (Connection connection = db_connect.getConnection()) {
            try {
                String query = "SELECT * FROM tblProveedor WHERE cveProveedor = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, id);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    tipoPersona = resultSet.getString("tipoPersona");
                    Proveedor proveedor;
                    if (tipoPersona.equals("FISICA")) {
                        proveedor = new Proveedor(
                                resultSet.getInt("cveProveedor"),
                                resultSet.getString("nombreProveedor"),
                                resultSet.getString("apellidoPaterno"),
                                resultSet.getString("apellidoMaterno"),
                                DatosGenerales.tipoPersona.FISICA,
                                resultSet.getDouble("saldoCliente"));
                    } else {
                        proveedor = new Proveedor(
                                resultSet.getInt("cveProveedor"),
                                resultSet.getString("nombreProveedor"),
                                resultSet.getString("apellidoPaterno"),
                                resultSet.getString("apellidoMaterno"),
                                DatosGenerales.tipoPersona.MORAL,
                                resultSet.getDouble("saldoCliente"));
                    }
                    suppliers.add(proveedor);
                }
            } catch (SQLException e) {
                System.out.println(e.toString());
                return Optional.empty();
            }
        }catch (SQLException e) {
            System.out.println(e.toString());
        }
      return Optional.ofNullable(suppliers.get(0));
    }

    /**
     * Metodo para buscar todos los proveedores que realiza una consulta a la base de datos
     * @author oscar.d.rodriguez
     * @see "Metodo para buscar todos los proveedores"
     * @return type:List<Proveedor>
     */
    @Override
    public List<Proveedor> findAll() {
        suppliers=new ArrayList<>();
        Conexion db_connect = new Conexion();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        resultSet = null;
        try(Connection connection = db_connect.getConnection()) {

            String query = "SELECT * FROM tblProveedor";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                tipoPersona = resultSet.getString("tipoPersona");
                if (tipoPersona.equals("FISICA")){
                    Proveedor proveedor = new Proveedor(
                            resultSet.getInt("cveProveedor"),
                            resultSet.getString("nombreProveedor"),
                            resultSet.getString("apellidoPaterno"),
                            resultSet.getString("apellidoMaterno"),
                            DatosGenerales.tipoPersona.FISICA,
                            resultSet.getDouble("saldoCliente"));
                    suppliers.add(proveedor);
                }else {
                    Proveedor proveedor = new Proveedor(
                            resultSet.getInt("cveProveedor"),
                            resultSet.getString("nombreProveedor"),
                            resultSet.getString("apellidoPaterno"),
                            resultSet.getString("apellidoMaterno"),
                            DatosGenerales.tipoPersona.MORAL,
                            resultSet.getDouble("saldoCliente"));
                    suppliers.add(proveedor);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error no se pudieron recuperar los clientes");
            System.out.println(e);
        }
        return suppliers;
    }

    /**
     * Metodo para eliminar un proveedor que realiza una consulta a la base de datos
     * @author oscar.d.rodriguez
     * @see "Metodo para eliminar un proveedor"
     * @param id type:Integer
     */
    @Override
    public void deleteById(Integer id) throws SQLException {
        suppliers = new ArrayList<>();
        Conexion db_connect = new Conexion();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        resultSet = null;
        try (Connection connection = db_connect.getConnection()) {
            try {
                String query = "DELETE FROM tblProveedor WHERE cveProveedor = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    /**
     * Metodo para actualizar un proveedor en la base de datos
     * @author oscar.d.rodriguez
     * @see "Metodo para actualizar un proveedor"
     * @return type:Optional<Proveedor>
     * @param proveedor type:Proveedor
     */
    @Override
    public Optional<Proveedor> update(Proveedor proveedor) throws SQLException {
        Conexion db_connect = new Conexion();
        try (Connection connection = db_connect.getConnection()) {
            String query = "UPDATE tblproveedor SET nombreProveedor = ?, apellidoPaterno = ?, apellidoMaterno = ?, tipoPersona = ?, saldoCliente = ? WHERE cveProveedor = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, proveedor.getNombre());
            preparedStatement.setString(2, proveedor.getApMaterno());
            preparedStatement.setString(3, proveedor.getApMaterno());
            preparedStatement.setString(4, proveedor.getTipoPersona().toString());
            preparedStatement.setDouble(5, proveedor.getSaldoCliente());
            preparedStatement.setInt(6, proveedor.getCveProveedor());
            preparedStatement.executeUpdate();
            return Optional.of(proveedor);
        }catch (SQLException e) {
            return Optional.empty();
        }
    }


}

