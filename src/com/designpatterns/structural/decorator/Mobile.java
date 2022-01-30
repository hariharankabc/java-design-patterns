package com.designpatterns.structural.decorator;

public class Mobile extends Order {
    public Mobile() {
        orderSummary = "Mobile";
    }

    @Override
    public int getCost() {
        return 60000;
    }
}
