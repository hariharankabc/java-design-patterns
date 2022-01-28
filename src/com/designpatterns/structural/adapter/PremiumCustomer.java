package com.designpatterns.structural.adapter;

public class PremiumCustomer implements Customer
{
    private String customerId;
    private String customerName;
    private int membershipRemainingDays;

    public PremiumCustomer(final String customerName) {
        this.customerName = customerName;
    }

    public int getMembershipRemainingDays() {
        return this.membershipRemainingDays;
    }

    public void setMembershipRemainingDays(final int membershipRemainingDays) {
        this.membershipRemainingDays = membershipRemainingDays;
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
        return String.format("Hi %s, your premium subscription ends in few days...", this.customerName);
    }
}