package com.designpatterns.structural.decorator;

public abstract class Order {
    String orderSummary = "Order yet to be placed";

    public String getOrderSummary() {
        return orderSummary;
    }

    public abstract int getCost();
}
