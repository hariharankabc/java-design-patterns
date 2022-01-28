package com.designpatterns.structural.bridge;

public class CreditCard implements Payment {

    @Override
    public void payBill() {
        System.out.print("paid by credit card, ");
    }
}
