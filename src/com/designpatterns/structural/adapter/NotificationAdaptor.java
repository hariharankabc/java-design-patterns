
package com.designpatterns.structural.adapter;

public class NotificationAdaptor implements Notification
{
    Customer customer;

    public NotificationAdaptor(Customer customer) {
        this.customer = customer;
    }

    public String getNotification(){
        return String.format("Hi %s, your access ends in few days...", customer.getCustomerName());
    }
}