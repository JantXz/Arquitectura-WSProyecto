package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            //Conexion clientes = new Conexion("com.mysql.cj.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/bdproyecto", "root", "");
            String ci = "jdbc:mysql://localhost:3306/sistemaventa?serverTimezone=UTC";
            con = DriverManager.getConnection(ci, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}
