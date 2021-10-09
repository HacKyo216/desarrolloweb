/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    Connection con;
public Conexion(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3310/tiendecita","root","");    
    } catch (Exception e) {
        System.err.println("Error"+e);
    }
    }
    public Connection getConnection(){
        return con;
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
//C:\ProgramData\MySQL\MySQL Server 8.0