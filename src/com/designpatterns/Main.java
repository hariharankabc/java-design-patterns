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

        //Bridge Pattern
        System.out.println("Bridge Pattern");
        Order order1 = new Product(new CreditCard(), new EMI());
        order1.orderPayment();
        Order order2 = new Bill(new CreditCard(), new EMI());
        order2.orderPayment();

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

    }
}