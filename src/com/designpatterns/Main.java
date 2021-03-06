package com.designpatterns;

import com.designpatterns.structural.adapter.Customer;
import com.designpatterns.structural.adapter.NotificationAdaptor;
import com.designpatterns.structural.adapter.PremiumCustomer;
import com.designpatterns.structural.adapter.ServiceEndReminderNotification;
import com.designpatterns.structural.bridge.*;
import com.designpatterns.structural.composite.ProductCatalogue;
import com.designpatterns.structural.composite.Products;
import com.designpatterns.structural.composite.Television;
import com.designpatterns.structural.composite.WashingMachine;
import com.designpatterns.structural.decorator.AnnualMaintenance;
import com.designpatterns.structural.decorator.Insurance;
import com.designpatterns.structural.decorator.Mobile;
import com.designpatterns.structural.facade.AirtelBill;
import com.designpatterns.structural.facade.BillPay;
import com.designpatterns.structural.facade.JioBill;
import com.designpatterns.structural.proxy.Cart;

public class Main
{
    public static void main(final String[] args) {

        //Adapter Pattern
        System.out.println("Adapter Pattern");
        ServiceEndReminderNotification serviceEndReminderNotification = new ServiceEndReminderNotification("Jack", "");
        System.out.println(serviceEndReminderNotification.getNotification());
        ServiceEndReminderNotification serviceEndReminderNotificationPremium = new ServiceEndReminderNotification("Rock", "premium");
        System.out.println(serviceEndReminderNotificationPremium.getNotification());
        ServiceEndReminderNotification serviceEndReminderNotificationCommunity = new ServiceEndReminderNotification("Dev", "community");
        System.out.println(serviceEndReminderNotificationCommunity.getNotification());
        System.out.println("---");

        //Bridge Pattern
        System.out.println("Bridge Pattern");
        Order order1 = new Product(new CreditCard(), new EMI());
        order1.orderPayment();
        Order order2 = new Bill(new CreditCard(), new EMI());
        order2.orderPayment();
        System.out.println("---");

        //Composite Pattern
        System.out.println("Composite Pattern");
        ProductCatalogue televisionCatalogue = new ProductCatalogue();
        Television samsungTelevision = new Television(10000, 1232123, "Samsung Television");
        Television sonyTelevision = new Television(10000, 1232123, "Sony Television");
        televisionCatalogue.addProductToCatalogue(samsungTelevision);
        televisionCatalogue.addProductToCatalogue(sonyTelevision);

        ProductCatalogue washingMachinesCatalogue = new ProductCatalogue();
        WashingMachine boschWashingMachine = new WashingMachine(10000, 1232123, "Bosch washingMachinesCatalogue");
        WashingMachine lgWashingMachine = new WashingMachine(10000, 1232123, "LG washingMachinesCatalogue");
        washingMachinesCatalogue.addProductToCatalogue(boschWashingMachine);
        washingMachinesCatalogue.addProductToCatalogue(lgWashingMachine);

        ProductCatalogue smartTelevisionCatalogue = new ProductCatalogue();
        Television samsungSmartTelevision = new Television(10000, 1232123, "Samsung Smart Television");
        Television sonySmartTelevision = new Television(10000, 1232123, "Sony Smart Television");
        smartTelevisionCatalogue.addProductToCatalogue(samsungSmartTelevision);
        smartTelevisionCatalogue.addProductToCatalogue(sonySmartTelevision);

        ProductCatalogue productCatalogue = new ProductCatalogue();
        productCatalogue.addProductToCatalogue(televisionCatalogue);
        productCatalogue.addProductToCatalogue(washingMachinesCatalogue);
        productCatalogue.addProductToCatalogue(smartTelevisionCatalogue);
        productCatalogue.showProductDetails();
        System.out.println("---");

        //Decorator Pattern
        System.out.println("Decorator Pattern");
        com.designpatterns.structural.decorator.Order order = new Mobile();
        System.out.println(order.getOrderSummary() +
                " Cost :" + order.getCost());

        com.designpatterns.structural.decorator.Order orderOne = new Mobile();
        orderOne = new Insurance(orderOne);
        orderOne = new AnnualMaintenance(orderOne);
        System.out.println(orderOne.getOrderSummary() +
                " Cost :" + orderOne.getCost());
        System.out.println("---");


        //Facade Pattern
        System.out.println("Facade Pattern");
        BillPay billPay = new BillPay();
        JioBill jioBill = billPay.getJioBroadbandBill("9999999999");
        AirtelBill airtelBill = billPay.getAirtelBroadbandBill("9999999999");
        System.out.println("---");

        //Proxy Pattern
        System.out.println("Proxy Pattern");
        com.designpatterns.structural.proxy.Order cart = new Cart();
        System.out.println(cart.placeOrder("TV"));
        System.out.println(cart.placeOrder("Mobile"));
        System.out.println("---End of Structural Design pattern ---");

        //Chain of Responsibilities Pattern
        System.out.println("Chain of Responsibilities Pattern");

    }
}