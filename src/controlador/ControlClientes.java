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
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import modelo.DAO.AccesoDAO;
import modelo.clases.Clientes;
import modelo.ConexionMB;
import vista.GestionClientes;

/**
 * Clase que controlará la vista GestionClientes.
 * @author Cris
 */
public class ControlClientes extends ControlPadre {

    GestionClientes vista;
    ArrayList<Clientes> clientes;
    ListModel<String> lista;
    AccesoDAO acceso;

    public ControlClientes(GestionClientes vista, AccesoDAO acceso) {
        super(vista.getBtnCrear(), vista.getBtnBorrar(), vista.getBtnEditar(), vista.getBtnAceptar(), 
                vista.getBtnCancelar(), vista.getBtnBuscarCliente(), vista.getJList(), vista.getLblErrorCrud());
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
        switch (e.getActionCommand()) {
            case "Buscar" -> buscar();
            case "Crear" -> {
                
                String dni = vista.getTxtDni();
                String nombre = vista.getTxtNombre();
                String apellido = vista.getTxtApellido();
                String correo = vista.getTxtCorreo();
                
                // Llamar al método crear con los valores obtenidos
                boolean creacionExitosa = crear(dni, nombre, apellido, correo);
                
                // Realizar acciones adicionales si es necesario
                if (creacionExitosa) {
                    System.out.println("Cliente creado correctamente.");
                    // Puedes hacer más cosas aquí si es necesario
                } else {
                    System.out.println("Error al crear el cliente.");
                }
            }
            case "Borrar" -> borrar();
            case "Editar" -> editar();
            case "Aceptar" -> aceptar();
            case "Cancelar" -> cancelar();
            default -> {
            }
        }
    }
    
    
    private void buscar(){
        
    }

    public boolean crear(String dni, String nombre, String apellido, String correo) {
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            // Obtener la conexión a la base de datos
            ConexionMB conexionMB = new ConexionMB();
            conexion = conexionMB.conectar();

            // Sentencia SQL para insertar un nuevo cliente
            String sql = "INSERT INTO clientes (dni, nombre, apellido, correo) VALUES (?, ?, ?, ?)";

            // Crear el PreparedStatement
            statement = conexion.prepareStatement(sql);

            // Establecer los valores de los parámetros
            statement.setString(1, dni);
            statement.setString(2, nombre);
            statement.setString(3, apellido);
            statement.setString(4, correo);

            // Ejecutar la sentencia SQL
            int filasAfectadas = statement.executeUpdate();

            // Verificar si al menos una fila fue afectada
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo adecuado de excepciones en la práctica
            return false;
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


    private void borrar() {
     
    }

    private void editar() {
     
    }

    private void aceptar() {
     
    }

    private void cancelar() {
     
    }

    

}
