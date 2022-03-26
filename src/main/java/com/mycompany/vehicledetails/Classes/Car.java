/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehicledetails.Classes;

import com.mycompany.vehicledetails.Classes.VehicleDetails;
import com.mycompany.vehicledetails.Interfaces.VehicleWithDoors;
import com.mycompany.vehicledetails.Interfaces.Fuel;

/**
 *
 * @author OMEN
 */
public class Car extends VehicleDetails implements VehicleWithDoors{
    
    //Dependency Inversion
    private Fuel fuel;
    public Car(Fuel e) {
        this.fuel = e;
    }
    public void start() {
        this.fuel.start();
    }
    
  
    @Override
    public int numberOfWheels(){
        return 4;
    }
    //Open closed Principle
    private double carExtraCost=10;  
    @Override
    public double getPrice(double dollar){
        return carExtraCost+super.getPrice(dollar);
    }
    
    //Liskov substitution
    private double cabinWidth=70;
    @Override
    public double getWidth(){
        return this.getCabinWidth();
    }
    private double getCabinWidth(){
        return cabinWidth/39.37;
    }
    
    //Interface segregation principle
    @Override
    public int numberOfDoors(){
        return 4;
    }
}
