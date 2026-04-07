package com.invoice;

public class InvoiceService {

    public double calculateTotal(double amount, double tax, double discount) {
        double taxAmount = amount * tax;
        double discountAmount = amount * discount;
        return amount + taxAmount - discountAmount;
    }
}