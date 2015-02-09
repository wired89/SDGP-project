/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package year2science;

/**
 *
 * @author Joel
 */
import java.util.Scanner;
public class Login {
    private String user;
    private String pass;
    
    public Login(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome please Login:");
        System.out.println("");
        System.out.println("Enter your Username:");
        user = input.next();
        System.out.println("Enter your Password:");
        pass = input.next();
        
    }
    
    public String getUser(){
       return user;
    }
    
    public String getPass(){
        return pass;
    }
    
    
}
