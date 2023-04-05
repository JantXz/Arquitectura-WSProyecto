/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import Conexion.*;
import MetodosWeb.*;
import java.sql.*;


/**
 *
 * @author Ian_l
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    
    
    public Connection conexion;
    
    public static void main(String[] args) 
    {
        Conexion con = new Conexion();
        Connection conexion = con.getConexion();

        int id=3;
        String nombre="prueba", tel="7712651337", dir="lago chalco";
        
    }
    
}
