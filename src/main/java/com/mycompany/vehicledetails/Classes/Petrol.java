/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vehicledetails.Classes;

import com.mycompany.vehicledetails.Interfaces.Fuel;

/**
 *
 * @author OMEN
 */
public class Petrol implements Fuel{
 
    public void start(){
        System.out.println("This vehicle is running on petrol");
    }
}
