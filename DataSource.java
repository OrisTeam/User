/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baskel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flynn
 */
public class DataSource{
    public Connection cnx;
    public String url="jdbc:mysql://localhost:3306/baskel";
    public String login="root";
    public String mdp="";
    static DataSource instance ;
    
      private  DataSource(){
        try {
            cnx = DriverManager.getConnection(url, login, mdp);
            System.out.println("DONE!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public Connection getConnexion(){
          return cnx;
      }
      public static DataSource getInstance(){
      if(instance == null){ 
        instance =  new DataSource();}
        return instance ;
      }
    
}


    
