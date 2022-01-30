package com.designpatterns.structural.decorator;

public abstract class Speaker extends Order {
    public Speaker() {
        orderSummary = "Speaker";
    }

    @Override
    public int getCost() {
        return 3000;
    }
}
