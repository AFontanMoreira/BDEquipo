/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo.sqlEquipo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class Conexion {
    Connection enlazar = null;

public Connection conectar(){
        
        try {
            
            enlazar =  DriverManager.getConnection("jdbc:mysql://localhost/bd_equipo","root","");
            
        } catch (Exception e) {
            
        }
return enlazar;
}
}
