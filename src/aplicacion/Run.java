/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aplicacion;

import controlador.Controlador;
import modelo.AccesoDAO;
import vista.MenuInicio;


/**
 *
 * @author aitor&
 */
public class Run {
   
    public static void main(String[] args) {

        

        AccesoDAO acceso = new AccesoDAO();
        Controlador controlador = new Controlador(new MenuInicio(),acceso);
        

    }

}
