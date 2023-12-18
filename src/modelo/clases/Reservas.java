/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.clases;

import java.util.Date;

/**
 *
 * @author Diurno
 */
public class Reservas {

    int id_cliente, numero_reserva;
    Date fecha_entrada, fecha_salida;
    boolean cancelada;

    public Reservas(int id_cliente, int numero_reserva, Date fecha_entrada, Date fecha_salida, boolean cancelada) {
        this.id_cliente = id_cliente;
        this.numero_reserva = numero_reserva;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.cancelada = cancelada;
    }

    public int getId_cliente() {
        return id_cliente;
    }



    public int getNumero_reserva() {
        return numero_reserva;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public boolean isCancelada() {
        return cancelada;
    }

}
