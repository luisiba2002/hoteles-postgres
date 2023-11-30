/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aplicacion;

import controlador.Controlador;
import modelo.AccesoDAO;


/**
 *
 * @author aitor&
 */
public class Run {
   
    public static void main(String[] args) {

            System.out.println("Estoy cambiando el proyecto");

        AccesoDAO acceso = new AccesoDAO();
        Controlador controlador = new Controlador();

    }

}
