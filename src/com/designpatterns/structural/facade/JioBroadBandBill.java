package com.designpatterns.structural.facade;

public class JioBroadBandBill implements BroadbandBill {
    @Override
    public Bill getBill() {
        JioBill jioBill = new JioBill();
        return jioBill;
    }
}
