package com.designpatterns.structural.adapter;

public class CommunityCustomer implements Customer
{
    private int trialEndsInDays;
    private String customerId;
    private String customerName;

    public CommunityCustomer(final String customerName) {
        this.customerName = customerName;
    }

    public int getTrialEndsInDays() {
        return this.trialEndsInDays;
    }

    public void setTrialEndsInDays(final int trialEndsInDays) {
        this.trialEndsInDays = trialEndsInDays;
    }

    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public String getCustomerId() {
        return this.customerId;
    }

    @Override
    public String getNotification() {
        return String.format("Hi %s, your free trial ends in few days...", this.customerName);
    }
}