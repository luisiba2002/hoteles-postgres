/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import modelo.AccesoDAO;
import modelo.Clientes;
import vista.GestionReservas;

/**
 * Clase que controlará la vista GestionReservas.
 * @author Cris
 */
public class ControlReservas extends ControlPadre {

    GestionReservas vista;
    ArrayList<Clientes> clientes;
    ListModel<String> lista;
    AccesoDAO acceso;

    public ControlReservas(GestionReservas vista, AccesoDAO acceso) {
        super(vista.getBtnCrear(), vista.getBtnBorrar(), vista.getBtnEditar(), vista.getBtnAceptar(), 
                vista.getBtnCancelar(), vista.getBtnBuscar(), vista.getListReserva(), vista.getLblErrorCrud());
        this.vista = vista;
        this.acceso = acceso;
        clientes = new ArrayList<>();
        
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
         // Se activa cuando cambia el índice de lo seleccionado en la lista.
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        if (accion.equals("Buscar")){            
            buscar();
        } else if (accion.equals("Crear")){
            crear();
        } else if (accion.equals("Borrar")){
            borrar();
        } else if (accion.equals("Editar")){
            editar();
        } else if (accion.equals("Aceptar")){
            aceptar();
        }else if (accion.equals("Cancelar")){
            cancelar();
        } 
    }
    
    
    private void buscar(){
        
    }

    private void crear() {
        
    }

    private void borrar() {
     
    }

    private void editar() {
     
    }

    private void aceptar() {
     
    }

    private void cancelar() {
     
    }

    

}
