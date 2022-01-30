package com.designpatterns.structural.decorator;

public class Insurance extends AddOn {
    Order order;

    public Insurance(Order order) {
        this.order = order;
    }

    public String getOrderSummary() {
        return order.getOrderSummary() + ", Insurance ";
    }

    public int getCost() {
        int orderCost = order.getCost();
        return (int) (orderCost + (orderCost * 0.1));
    }
}
