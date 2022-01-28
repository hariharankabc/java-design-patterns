package com.designpatterns;

import com.designpatterns.structural.adapter.Customer;
import com.designpatterns.structural.adapter.NotificationAdaptor;
import com.designpatterns.structural.adapter.PremiumCustomer;
import com.designpatterns.structural.adapter.ServiceEndReminderNotification;

public class Main
{
    public static void main(final String[] args) {
        ServiceEndReminderNotification serviceEndReminderNotification = new ServiceEndReminderNotification("Jack","");
        System.out.println(serviceEndReminderNotification.getNotification());
        ServiceEndReminderNotification serviceEndReminderNotificationPremium = new ServiceEndReminderNotification("Rock","premium");
        System.out.println(serviceEndReminderNotificationPremium.getNotification());
        ServiceEndReminderNotification serviceEndReminderNotificationCommunity = new ServiceEndReminderNotification("Dev","community");
        System.out.println(serviceEndReminderNotificationCommunity.getNotification());
    }
}