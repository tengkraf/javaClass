/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ECC
 */
public class Exempt extends Employee {
    
    private int allowances;
    
    public Exempt(int id, int allowance) {
        super(id);
        allowances = allowance;
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.println(allowances);
    }

    
}
