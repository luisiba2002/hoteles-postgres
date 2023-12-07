/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;

/**
 * Clase básica que debe heredar cada controlador de cada vista con CRUD. Posee
 * los controles comunes a todas las interfaces y añade los listeners necesarios.
 *
 * @author Cris
 */
public abstract class ControlPadre implements ActionListener, ListSelectionListener {

    int action;
    JButton crear;
    JButton borrar;
    JButton editar;
    JButton aceptar;
    JButton cancelar;
    JButton buscar;
    JList lista;
    JLabel lblErrorCrud;

    public ControlPadre(JButton crear, JButton borrar, JButton editar, JButton aceptar,
            JButton cancelar, JButton buscar, JList lista, JLabel lblErrorCrud) {
        this.action = 0;
        this.crear = crear;
        this.borrar = borrar;
        this.editar = editar;
        this.aceptar = aceptar;
        this.cancelar = cancelar;
        this.buscar = buscar;
        this.lista = lista;

        // Listeners
        crear.addActionListener(this);
        borrar.addActionListener(this);
        editar.addActionListener(this);
        aceptar.addActionListener(this);
        cancelar.addActionListener(this);
        buscar.addActionListener(this);
        lista.addListSelectionListener(this);
    }

    /**
     * Activa el modo "edición". Desactiva los botones crear, borrar y editar y
     * muestra los botones aceptar y cancelar.
     */
    protected void activarModo() {
        crear.setEnabled(false);
        borrar.setEnabled(false);
        editar.setEnabled(false);
        aceptar.setVisible(true);
        cancelar.setVisible(true);
    }

    /**
     * Desactiva el modo "edición". Activa los botones crear, borrar y editar e
     * invisibiliza los botones aceptar y cancelar. También cambia el número de
     * acción a 0.
     */
    protected void desactivarModo() {
        crear.setEnabled(true);
        borrar.setEnabled(true);
        editar.setEnabled(true);
        aceptar.setVisible(false);
        cancelar.setVisible(false);
        action = 0;
        lblErrorCrud.setText("");
    }
}
