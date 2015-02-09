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
        
        boolean quit = true;
        
        try{
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         
         String SQL = "SELECT FIRSTNAME, PASSWORD from APP.STUDENTS";
         ResultSet rs = stmt.executeQuery(SQL);
         
         
        
         Login log = new Login();
         while(rs.next()){
             //int stuID = rs.getInt("id");
             String firstName = rs.getString("firstName");
             if(firstName.equals(log.getUser())){
                 
                 String password = rs.getString("password");
                 if(password.equals(log.getPass())){
                     System.out.println("You have logged in!!");
                     
                 }
                 
             }
            
            
             //String lastName = rs.getString("lastName");
             
             
             //String print = firstName + " " + password;
             //System.out.println(print);
         }
         
         
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
        System.out.println("GoodBye!");
       }
       
   
   
    }
    
   

    

