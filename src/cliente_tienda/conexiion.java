/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cliente_tienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author German Pulgarin Alex Arias
 */
public class conexiion {

     
    
    public String db="db_tienda";
    public String url="jdbc:mysql://localhost";
    public String user="root";
    public String pass="1234";
    
    
    public conexiion(){
        
    }
    
    public Connection conectar(){
        Connection link=null;
        
        try{
        
           Class.forName("org.gjt.mm.mysql.Driver");
           link=DriverManager.getConnection(this.url,this.user,this.pass);
           System.out.println("Bien, no pailas2");
        
          }
          catch(ClassNotFoundException | SQLException ex)
                    {
                  JOptionPane.showConfirmDialog(null,ex);
                    }
        return null;
    }
 
}

