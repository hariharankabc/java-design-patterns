package com.designpatterns.structural.bridge;

public class Product extends Order {

    public Product(Payment payment1, Payment payment2) {
        super(payment1, payment2);
    }

    @Override
    public void orderPayment() {
        System.out.print("Product bill ");
        payment1.payBill();
        payment2.payBill();
    }
}
