
package com.designpatterns.structural.adapter;

public class ServiceEndReminderNotification implements Notification
{
    public String customerName;
    public int remainingDays;

    public ServiceEndReminderNotification(final String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String getNotification() {
        return String.format("Hi %s, your access ends in few days...", this.customerName);
    }
}