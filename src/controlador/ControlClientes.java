/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import modelo.Clientes;
import vista.GestionClientes;

/**
 * Clase que controlará la vista GestionClientes.
 * @author Cris
 */
public class ControlClientes extends ControlPadre {

    GestionClientes vista;
    ArrayList<Clientes> clientes;
    ListModel<String> lista;

    public ControlClientes(GestionClientes vista) {
        super(vista.getBtnCrear(), vista.getBtnBorrar(), vista.getBtnEditar(), vista.getBtnAceptar(), 
                vista.getBtnCancelar(), vista.getBtnBuscarCliente(), vista.getJList(), vista.getLblErrorCrud());
        this.vista = vista;
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
