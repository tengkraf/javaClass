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
public class Employee {
    private String name;
    private int staff_id;
    private String dept;
    private double rate;
    private long hrs_worked;
    private double salary;
    
    
    public void enter() throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter employees name: ");
        name = stdin.readLine();
        System.out.println("Enter employees id: ");
        staff_id = Integer.parseInt(stdin.readLine());
        System.out.println("Enter employees department: ");
        dept = stdin.readLine();
        System.out.println("Enter employees hourly rate: ");
        rate = Double.parseDouble(stdin.readLine());
        System.out.println("Enter employees hours: ");
        hrs_worked = Long.parseLong(stdin.readLine());
      
        calculateSalary();
    }
    
    public void display()
    {
        System.out.println(name + "\t" + staff_id + "\t\t" + dept
        + "\t" + rate + "\t" + hrs_worked + "\t" + salary);
    }
    public void calculateSalary()
    {
        salary = rate * hrs_worked;
    }
}
