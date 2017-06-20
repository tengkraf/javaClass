/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ECC
 */
public class Test {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
//        Employee[] employeeArray = new Employee[5];
//              
//        for(int ii = 0; ii < 5; ii++)
//        {
//            employeeArray[ii] = new Employee();
//            employeeArray[ii].enter();          
//        }
//        
//        System.out.println("STAFF ID\t\tNAME\t\tDEPT\t\tRATE\tHOURS\tSALARY");
//        System.out.println("===============================");
//        
//        for(int ii = 0; ii < 5; ii++)
//        {
//            employeeArray[ii].display();
//        }

        
//        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
//        String message;
//        System.out.println("Enter a line of text:");
//        message = stdin.readLine();
//        System.out.println("You entered: \"" + message + "\"");
        

           Person a = new Person();
           Person b = new Person();
           
           System.out.println("The income of person a is " + a.income());
           System.out.println("The income of person b is " + b.income());
           
           a.initialize(10, 20);
           b.initialize(8,30);
           
           System.out.println("The income of person a is " + a.income());
           System.out.println("The income of person b is " + b.income());
           
    }
    
}
