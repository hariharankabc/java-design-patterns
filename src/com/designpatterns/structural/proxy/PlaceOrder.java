package com.designpatterns.structural.proxy;

public class PlaceOrder implements Order {

    @Override
    public String placeOrder(String productName) {
        return String.format("%s Order Placed", productName);
    }
}
