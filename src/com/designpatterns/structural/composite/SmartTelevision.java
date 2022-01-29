package com.designpatterns.structural.composite;

public class SmartTelevision implements Products {
    private int productCost;
    private int productCode;
    private String productName;

    public SmartTelevision(int productCost, int productCode, String productName) {
        this.productCost = productCost;
        this.productCode = productCode;
        this.productName = productName;
    }

    @Override
    public void showProductDetails() {
        System.out.println(String.format("The %s code is %1d and it costs %2d.", productName, productCode, productCost));
    }
}
