/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehicledetails.Classes;

import com.mycompany.vehicledetails.Classes.VehicleDetails;
import com.mycompany.vehicledetails.Interfaces.Fuel;
import com.mycompany.vehicledetails.Interfaces.VehicleWithDoors;

/**
 *
 * @author OMEN
 */
public class RacingCar extends VehicleDetails implements VehicleWithDoors{
    
    //Dependency Inversion
    private Fuel fuel;
    public RacingCar(Fuel e) {
        this.fuel = e;
    }
    public void start() {
        this.fuel.start();
    }
    
    
    @Override
    public int numberOfWheels(){
        return 6;
    }
    
    //Open closed Principle
    private double racingCarExtraCost=100;
    @Override
    public double getPrice(double dollar){
        return racingCarExtraCost+super.getPrice(dollar);
    }
    
    //Liskov substitution
    private double cockpitWidth=500;
    @Override
    public double getWidth(){
        return this.getCockpitWidth();
    }
    private double getCockpitWidth(){
        return cockpitWidth/1000;
    }
    
    //Interface segregation principle
    @Override
    public int numberOfDoors(){
        return 2;
    }
}
