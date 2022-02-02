package com.designpatterns.structural.proxy;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;

public class Cart implements Order {

    private Order placeOrder = new PlaceOrder();
    private static ArrayList<String> orderDeliverable = new ArrayList<>();

    static {
        orderDeliverable.add("mobile");
        orderDeliverable.add("speaker");
        orderDeliverable.add("smart watch");
        orderDeliverable.add("power bank");
    }

    @Override
    public String placeOrder(String productName) {
        if (!orderDeliverable.contains(productName.toLowerCase())) {
            return "Item not deliverable at the moment";
        }
        return placeOrder.placeOrder(productName);
    }
}
