/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategypattern;

import java.util.Scanner;

/**
 *
 * @author OMEN
 */
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 for payment with bkash");
        System.out.println("Type 2 for payment with Rocket");
        
        int input = sc.nextInt();
        if(input==1){
        PaymentGateway pg = new PaymentGateway(new Bkash());
        pg.acceptPayment();
        }
        else{
        PaymentGateway pg = new PaymentGateway(new Rocket());
        pg.acceptPayment();
        }


    }
   
}
