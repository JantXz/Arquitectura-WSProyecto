package Conexion;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection conexion;
    
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdproyecto", "root", "");
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error al conectar: " + ex.getMessage());
        }
    }
    
    public Connection getConexion() {
        return conexion;
    }
    
    public void cerrarConexion() {
        try {
            conexion.close();
            System.out.println("Conexión cerrada");
        } catch (SQLException ex) {
            System.out.println("Error al cerrar conexión: " + ex.getMessage());
        }
    }
}
