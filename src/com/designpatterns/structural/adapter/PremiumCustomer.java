package com.designpatterns.structural.adapter;

public class PremiumCustomer implements Customer
{
    private String customerId;
    private String customerName;
    private int membershipRemainingDays;

    public PremiumCustomer(final String customerName, final int membershipRemainingDays) {
        this.customerName = customerName;
        this.membershipRemainingDays = membershipRemainingDays;
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
}