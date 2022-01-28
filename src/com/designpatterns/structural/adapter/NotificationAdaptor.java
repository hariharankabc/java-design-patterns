
package com.designpatterns.structural.adapter;

public class NotificationAdaptor implements Notification
{
    Customer customer;

    public NotificationAdaptor(String customerName, String customerType) {
        if(customerType.equalsIgnoreCase("premium")){
            customer = new PremiumCustomer("customerName");
        }else{
            customer = new CommunityCustomer ("customerName");
        }
    }

    public String getNotification(){
        return customer.getNotification();
    }
}