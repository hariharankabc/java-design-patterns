package com.designpatterns.structural.bridge;

public abstract class Order {
    Payment payment1;
    Payment payment2;

    protected Order(Payment payment1, Payment payment2) {
        this.payment1 = payment1;
        this.payment2 = payment2;
    }

    abstract public void orderPayment();

}
