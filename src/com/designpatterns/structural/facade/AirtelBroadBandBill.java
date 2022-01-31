package com.designpatterns.structural.facade;

public class AirtelBroadBandBill implements BroadbandBill {
    @Override
    public Bill getBill() {
        AirtelBill airtelBill = new AirtelBill();
        return airtelBill;
    }
}
