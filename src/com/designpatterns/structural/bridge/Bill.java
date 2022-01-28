package com.designpatterns.structural.bridge;

public class Bill extends Order {

    public Bill(Payment payment1, Payment payment2) {
        super(payment1, payment2);
    }

    @Override
    public void orderPayment() {
        System.out.print("Bill ");
        payment1.payBill();
        payment2.payBill();
    }
}
