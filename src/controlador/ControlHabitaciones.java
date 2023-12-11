/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import modelo.AccesoDAO;
import modelo.Clientes;
import modelo.ConexionMB;
import modelo.clases.Habitacion;
import vista.GestionHabitaciones;

/**
 * Clase que controlará la vista GestionHabitaciones.
 *
 * @author Cris
 */
public class ControlHabitaciones extends ControlPadre {

    GestionHabitaciones vista;
    ArrayList<Clientes> clientes;
    ListModel<String> lista;
    AccesoDAO acceso;

    public ControlHabitaciones(GestionHabitaciones vista, AccesoDAO acceso) {
        super(vista.getBtnCrear(), vista.getBtnBorrar(), vista.getBtnEditar(), vista.getBtnAceptar(),
                vista.getBtnCancelar(), vista.getBtnBuscar(), vista.getList(), vista.getLblErrorCrud());
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
        if (accion.equals("Buscar")) {
            buscar();
        } else if (accion.equals("Crear")) {
             
            int idHotel = Integer.parseInt(vista.getTxtNumero());
            int capacidad = Integer.parseInt(vista.getTxtCapacidad());
            String descripcion = vista.getTxtDesc();
            double precioNoche = Double.parseDouble(vista.getTxtPrecio());

            // Crear una nueva instancia de Habitacion
            Habitacion habitacion = new Habitacion(idHotel, capacidad, descripcion, precioNoche);

            // Llamar al método crear con la instancia de Habitacion
            crear(habitacion);
            
        } else if (accion.equals("Borrar")) {
            borrar();
        } else if (accion.equals("Editar")) {
            editar();
        } else if (accion.equals("Aceptar")) {
            aceptar();
        } else if (accion.equals("Cancelar")) {
            cancelar();
        }
    }

    private void buscar() {

    }

    private void crear(Habitacion habitacion) {
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            // Obtener la conexión a la base de datos
            ConexionMB conexionMB = new ConexionMB(); // Declarar e instanciar la clase ConexionMB
            conexion = conexionMB.conectar();

            // Sentencia SQL INSERT
            String sql = "INSERT INTO habitaciones (id_hotel, capacidad, descripcion, precio_noche) VALUES (?, ?, ?, ?)";

            // Crear el PreparedStatement
            statement = conexion.prepareStatement(sql);

            // Establecer los valores de los parámetros
            statement.setInt(1, habitacion.getIdHotel());
            statement.setInt(2, habitacion.getCapacidad());
            statement.setString(3, habitacion.getDescripcion());
            statement.setDouble(4, habitacion.getPrecioNoche());

            // Ejecutar la sentencia SQL
            int filasAfectadas = statement.executeUpdate();

            // Verificar si al menos una fila fue afectada
            if (filasAfectadas > 0) {
                System.out.println("Habitación creada correctamente.");
               
                
            } else {
                System.out.println("No se pudo crear la habitación.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo adecuado de excepciones en la práctica
        } finally {
            // Cerrar recursos
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void borrar(Habitacion habitacion) {
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            // Obtener la conexión a la base de datos
            ConexionMB conexionMB = new ConexionMB(); // Declarar e instanciar la clase ConexionMB
            conexion = conexionMB.conectar();

            // Sentencia SQL DELETE
            String sql = "DELETE FROM habitaciones WHERE id_habitacion = ?";

            // Crear el PreparedStatement
            statement = conexion.prepareStatement(sql);

            // Establecer el valor del parámetro
            statement.setInt(1, habitacion.getIdHotel()); // Suponiendo que id_habitacion es el identificador único

            // Ejecutar la sentencia SQL
            int filasAfectadas = statement.executeUpdate();

            // Verificar si al menos una fila fue afectada
            if (filasAfectadas > 0) {
                System.out.println("Habitación eliminada correctamente.");
            } else {
                System.out.println("No se pudo eliminar la habitación.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo adecuado de excepciones en la práctica
        } finally {
            // Cerrar recursos
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void editar(Habitacion habitacion) {
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            // Obtener la conexión a la base de datos
            ConexionMB conexionMB = new ConexionMB();
            // Declarar e instanciar la clase ConexionMB
            conexion = conexionMB.conectar();

            // Sentencia SQL UPDATE
            String sql = "UPDATE habitaciones "
                    + "SET capacidad = ?, descripcion = ?, pre_noch = ? "
                    + "WHERE id_habitacion = ?";

            // Crear el PreparedStatement
            statement = conexion.prepareStatement(sql);

            // Establecer los valores de los parámetros
            statement.setInt(1, habitacion.getCapacidad());
            statement.setString(2, habitacion.getDescripcion());
            statement.setDouble(3, habitacion.getPrecioNoche());
            statement.setInt(4, habitacion.getIdHotel()); // Suponiendo que id_habitacion es el identificador único

            // Ejecutar la sentencia SQL
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo adecuado de excepciones en la práctica
        } finally {
            // Cerrar recursos
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void aceptar() {

    }

    private void cancelar() {
        desactivarModo();
    }

}
