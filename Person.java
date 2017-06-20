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
public class Person {
    private int hour;
    private int rate;
    
    public Person()
    {
        hour = 10;
        rate = 10;
    }
    
    public int income()
    {
        return hour * rate;
    }
    
    public void initialize(int i_hr, int i_rate)
    {
        hour = i_hr;
        rate = i_rate;
    }
}
