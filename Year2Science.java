/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year2science;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Joel
 */
public class Year2Science {

    /**
     * @param args the command line arguments
     */
   //static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:derby://localhost:1527/Proto";

   //  Database credentials
   static final String USER = "userTest";
   static final String PASS = "usertest";
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         
         String SQL = "SELECT * from APP.STUDENTS";
         ResultSet rs = stmt.executeQuery(SQL);
         
         
         while(rs.next()){
             int stuID = rs.getInt("id");
             String firstName = rs.getString("firstName");
             String lastName = rs.getString("lastName");
             String password = rs.getString("password");
             
             String print = stuID + " " + firstName + " " + lastName + " " + password;
             System.out.println(print);
         }
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
        System.out.println("GoodBye!");
   
   
    }
    
   

    

    
}
