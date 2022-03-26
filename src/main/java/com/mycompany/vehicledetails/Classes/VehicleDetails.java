/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehicledetails.Classes;

/**
 *
 * @author OMEN
 */

//Single Responsibility Principle
public class VehicleDetails {
     
   public void drive(){
       System.out.println("This vehicle drives perfectly");
   }
   
   public double getPrice(double dollar){
       CalculatePrice c=new CalculatePrice();
       return c.convertCurrency(dollar);
   }
    public double getWidth(){
        return 100; 
    }
}
