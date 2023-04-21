/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author User
 */
public abstract class MetodoPago {
    private double monto;
    private String codigo;
    
    public MetodoPago(double monto, String codigo) {
        this.monto = monto;
        this.codigo = codigo;
    }
    
    public abstract boolean procesarPago();
}

