package com.designpatterns.structural.bridge;

public class EMI implements Payment {
    @Override
    public void payBill() {
        System.out.println("remaining converted to EMI.");
    }
}
