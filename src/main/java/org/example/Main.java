package org.example;

import com.invoice.Invoice;
import com.invoice.InvoiceService;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Sanjay", 1000, 0.10, 0.05);

        InvoiceService service = new InvoiceService();
        double total = service.calculateTotal(
                invoice.getAmount(),
                invoice.getTax(),
                invoice.getDiscount()
        );

        System.out.println("----- Invoice -----");
        System.out.println("Customer Name: " + invoice.getCustomerName());
        System.out.println("Amount: " + invoice.getAmount());
        System.out.println("Tax: " + invoice.getTax());
        System.out.println("Discount: " + invoice.getDiscount());
        System.out.println("Total Amount: " + total);
    }
}