
package com.designpatterns.structural.adapter;

public class ServiceEndReminderNotification implements Notification
{
    public String customerName;
    public int remainingDays;
    public String customerType;

    public ServiceEndReminderNotification(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }

    @Override
    public String getNotification() {
        if(this.customerType.isEmpty()){
            return String.format("Hi %s, your access ends in few days...", this.customerName);
        }else{
            NotificationAdaptor notificationAdaptor = new NotificationAdaptor(this.customerName, this.customerType);
            return notificationAdaptor.getNotification();
        }
    }
}