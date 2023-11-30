/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aitor
 */
public class ConexionMB {
  Connection conexion;
    public String db_name = "acceso_datos";
    public String user = "root";
    public String passwd = "root";
    public String dir = "jdbc:mysql://localhost/" + db_name;

   
    
    
    public Connection conectar(){
        try {
            conexion = DriverManager.getConnection(dir,user,passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMB.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return conexion;
    }
    public void desconectar(){
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexionMB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
