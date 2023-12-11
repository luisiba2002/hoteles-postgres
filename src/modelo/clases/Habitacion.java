/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.clases;

/**
 *
 * @author aitor
 */
public class Habitacion {
    private int idHotel;
    private int capacidad;
    private String descripcion;
    private double precioNoche;

    // Constructor
    public Habitacion(int idHotel, int capacidad, String descripcion, double precioNoche) {
        this.idHotel = idHotel;
        this.capacidad = capacidad;
        this.descripcion = descripcion;
        this.precioNoche = precioNoche;
    }

    // Métodos para acceder a las variables (getters)
    public int getIdHotel() {
        return idHotel;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    // Métodos para establecer valores (setters) si es necesario
    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }
}

