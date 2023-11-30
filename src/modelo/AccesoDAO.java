/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;

;

/**
 *
 * @author aitor
 */
public class AccesoDAO {

    Connection conexion;
    ConexionMB login;
 

    public AccesoDAO() {
        this.login = new ConexionMB();
        this.conexion = login.conectar();
        if (conexion != null) {
            System.out.println("Conectado");
        }
    }

    
}
