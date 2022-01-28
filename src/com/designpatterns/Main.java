package com.designpatterns;

import com.designpatterns.structural.adapter.Customer;
import com.designpatterns.structural.adapter.NotificationAdaptor;
import com.designpatterns.structural.adapter.PremiumCustomer;
import com.designpatterns.structural.adapter.ServiceEndReminderNotification;
import com.designpatterns.structural.bridge.*;

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
    }
}