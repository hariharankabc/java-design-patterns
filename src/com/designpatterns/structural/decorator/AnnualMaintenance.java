package com.designpatterns.structural.decorator;

public class AnnualMaintenance extends AddOn {
    Order order;

    public AnnualMaintenance(Order order) {
        this.order = order;
    }

    public String getOrderSummary() {
        return order.getOrderSummary() + ", Annual Maintenance ";
    }

    public int getCost() {
        int orderCost = order.getCost();
        return (int) (orderCost + (orderCost * 0.05));
    }
}
