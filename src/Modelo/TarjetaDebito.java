/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author User
 */
public class TarjetaDebito extends MetodoPago {
    private String numeroTarjeta;
    private String fechaVencimiento;
    private String cvv;

    public TarjetaDebito(double monto, String codigo, String numeroTarjeta, String fechaVencimiento, String cvv) {
        super(monto, codigo);
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    @Override
    public boolean procesarPago() {
        // Lógica para procesar el pago con tarjeta de débito
        return true;
    }
}
