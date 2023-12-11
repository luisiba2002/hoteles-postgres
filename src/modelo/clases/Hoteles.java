/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.clases;

/**
 *
 * @author aitor
 */
public class Hoteles {
 
    private String nombre;
    private String direccion;
    private String ciudad;
    private String pais;
    private int numEstrellas;
    private String telefono;
    private String correoElectronico;
    private String sitioWeb;
    private String descripcion;

    // Constructor
    public Hoteles(String nombre, String direccion, String ciudad, String pais, int numEstrellas,
                   String telefono, String correoElectronico, String sitioWeb, String descripcion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numEstrellas = numEstrellas;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.sitioWeb = sitioWeb;
        this.descripcion = descripcion;
    }

    // Métodos para acceder a las variables (getters)
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public int getNumEstrellas() {
        return numEstrellas;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

