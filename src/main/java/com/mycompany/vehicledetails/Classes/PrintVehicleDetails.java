/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehicledetails.Classes;

import com.mycompany.vehicledetails.Classes.VehicleDetails;
import com.mycompany.vehicledetails.Interfaces.Fuel;

/**
 *
 * @author OMEN
 */
public class PrintVehicleDetails {
    public static void main(String[] args) {
        
        VehicleDetails v1 = new VehicleDetails();
        System.out.println(v1.getPrice(10)) ;
        
        Petrol p =new Petrol();
        Car bmw = new Car(p);
        System.out.println(bmw.getPrice(10)) ;
        
        Gas f =new Gas();
        RacingCar mcLaren = new RacingCar(f);
        System.out.println(mcLaren.getPrice(10)) ;
       
        ///////////////////////////////////////////////////
        System.out.println("");
        
        Bike yamaha = new Bike(p);
        System.out.println(yamaha.getWidth()+" meter");
        System.out.println(bmw.getWidth()+" meter");
        System.out.println(mcLaren.getWidth()+" meter");
        System.out.println("");
        
        //////////////////////////////////////////////////
        
        System.out.println(bmw.numberOfDoors()+" doors"); 
        System.out.println(mcLaren.numberOfDoors()+" doors");
        System.out.println("");
        
        //////////////////////////////////////////////////
        
        bmw.start();
        mcLaren.start();
        yamaha.start();
        
        
        
    }
}
