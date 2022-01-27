
package com.designpatterns.structural.adapter;

public class NotificationAdaptor extends ServiceEndReminderNotification
{
    Customer customer;

    public NotificationAdaptor(final Customer customer) {
        super(customer.getCustomerName());
    }
}