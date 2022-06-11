/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehicledetails.Classes;

import com.mycompany.vehicledetails.Classes.VehicleDetails;
import com.mycompany.vehicledetails.Interfaces.Fuel;
import com.mycompany.vehicledetails.Interfaces.VehicleInterface;

/**
 *
 * @author OMEN
 */
public class Bike extends VehicleDetails implements VehicleInterface{
    
    //Dependency Inversion
    private Fuel fuel;
    public Bike(Fuel e) {
        this.fuel = e;
    }
    public void start() {
        this.fuel.start();
    }
    
    
    public int numberOfWheels(){
        return 2;
    }
    
    //Open closed principle
    private double bikeExtraCost=5;
    @Override
    public double getPrice(double dollar){
        return bikeExtraCost+super.getPrice(dollar);
    }
    
    //Liskov substitution
    private double width=0.79;
    @Override
    public double getWidth(){
        return this.width;
    }
    
}
