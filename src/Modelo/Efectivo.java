/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author User
 */
public class Efectivo extends MetodoPago {
    private double cantidadRecibida;

    public Efectivo(double monto, String codigo, double cantidadRecibida) {
        super(monto, codigo);
        this.cantidadRecibida = cantidadRecibida;
    }

    @Override
    public boolean procesarPago() {
        // Lógica para procesar el pago en efectivo
        return true;
    }
}
