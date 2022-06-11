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
public class PaymentGateway {
    private Payment payment;

    public PaymentGateway(Payment payment) {
        this.payment = payment;
    }
    public void acceptPayment(){
         this.payment.completePayment();
    }
}
