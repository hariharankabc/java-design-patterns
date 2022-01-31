package com.designpatterns.structural.facade;

public class BillPay {

    public AirtelBill getAirtelBroadbandBill(String phoneNumber) {
        AirtelBroadBandBill airtelBB = new AirtelBroadBandBill();
        return (AirtelBill) airtelBB.getBill();
    }

    public JioBill getJioBroadbandBill(String phoneNumber) {
        JioBroadBandBill jioBroadBandBill = new JioBroadBandBill();
        return (JioBill) jioBroadBandBill.getBill();
    }
}
