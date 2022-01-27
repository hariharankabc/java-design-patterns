package com.designpatterns.structural.adapter;

public class CommunityCustomer implements Customer
{
    private int trialEndsInDays;
    private String customerId;
    private String customerName;

    public CommunityCustomer(final String customerName, final int trialEndsInDays) {
        this.customerName = customerName;
        this.trialEndsInDays = trialEndsInDays;
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
}