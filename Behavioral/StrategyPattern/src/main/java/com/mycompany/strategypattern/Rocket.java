/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategypattern;

/**
 *
 * @author OMEN
 */
public class Rocket implements Payment{
    @Override
    public void completePayment(){
        System.out.println("You have completed payment with Rocket");
    }
            
}