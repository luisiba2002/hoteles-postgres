/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import modelo.DAO.AccesoDAO;
import vista.*;

/**
 *
 * @author aitor
 */
public class Controlador implements ActionListener {

    MenuInicio vistaPrincipal;
    GestionHoteles vHoteles;
    GestionHabitaciones vHabitaciones;
    GestionClientes vClientes;
    GestionReservas vReservas;
    AccesoDAO acceso;

    public Controlador(MenuInicio vista, AccesoDAO acceso) {
        // Se añade la vista y el acceso.
        this.vistaPrincipal = vista;
        vistaPrincipal.setVisible(true);
        this.acceso = acceso;

        // Action listener de botones.
        vista.btnClientes.addActionListener(this);
        vista.btnHabitaciones.addActionListener(this);
        vista.btnHoteles.addActionListener(this);
        vista.btnReserva.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Gestión de hoteles" ->
                hoteles();
            case "Gestión de habitaciones" ->
                habitaciones();
            case "Gestión de clientes" ->
                clientes();
            case "Gestión de reservas" ->
                reservas();
            default -> {
            }
        }
    }

    /**
     * Lanza la vista y el controlador de hoteles. Cuando eso ocurre,
     * deshabilita el menú de inicio. Añade un windowListener para que, cuando
     * se cierre la vista, el menuInicio se vuelva a activar.
     */
    private void hoteles() {
        vHoteles = new GestionHoteles();
        vHoteles.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                vistaPrincipal.setEnabled(true); // Reactiva la ventana principal cuando se cierra la secundaria
                vistaPrincipal.requestFocus();
            }
        });
        ControlHoteles control = new ControlHoteles(vHoteles, acceso);
        vHoteles.setVisible(true);
        vistaPrincipal.setEnabled(false);
    }

    /**
     * Lanza la vista y el controlador de habitaciones. Cuando eso ocurre,
     * deshabilita el menú de inicio. Añade un windowListener para que, cuando
     * se cierre la vista, el menuInicio se vuelva a activar.
     */
    private void habitaciones() {
        vHabitaciones = new GestionHabitaciones();
        vHabitaciones.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                vistaPrincipal.setEnabled(true); // Reactiva la ventana principal cuando se cierra la secundaria
                vistaPrincipal.requestFocusInWindow();
            }
        });
        ControlHabitaciones control = new ControlHabitaciones(vHabitaciones, acceso);
        vHabitaciones.setVisible(true);
        vistaPrincipal.setEnabled(false);
    }

    /**
     * Lanza la vista y el controlador de clientes. Cuando eso ocurre,
     * deshabilita el menú de inicio. Añade un windowListener para que, cuando
     * se cierre la vista, el menuInicio se vuelva a activar.
     */
    private void clientes() {
        vClientes = new GestionClientes();
        vClientes.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                vistaPrincipal.setEnabled(true); // Reactiva la ventana principal cuando se cierra la secundaria
                vistaPrincipal.requestFocusInWindow();
            }
        });
        ControlClientes control = new ControlClientes(vClientes, acceso);
        vClientes.setVisible(true);
        vistaPrincipal.setEnabled(false);
    }

    /**
     * Lanza la vista y el controlador de reservas. Cuando eso ocurre,
     * deshabilita el menú de inicio. Añade un windowListener para que, cuando
     * se cierre la vista, el menuInicio se vuelva a activar.
     */
    private void reservas() {
        vReservas = new GestionReservas();
        vReservas.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                vistaPrincipal.setEnabled(true); // Reactiva la ventana principal cuando se cierra la secundaria
                vistaPrincipal.requestFocusInWindow();
            }
        });
        ControlReservas control = new ControlReservas(vReservas, acceso);
        vReservas.setVisible(true);
        vistaPrincipal.setEnabled(false);
    }

}
