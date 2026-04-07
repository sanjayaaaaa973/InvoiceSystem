package com.invoice;

public class Invoice {
    private String customerName;
    private double amount;
    private double tax;
    private double discount;

    public Invoice(String customerName, double amount, double tax, double discount) {
        this.customerName = customerName;
        this.amount = amount;
        this.tax = tax;
        this.discount = discount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }

    public double getDiscount() {
        return discount;
    }
}