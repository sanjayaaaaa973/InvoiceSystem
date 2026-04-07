package com.invoice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceServiceTest {

    @Test
    public void testBillingAccuracy() {
        InvoiceService service = new InvoiceService();
        double total = service.calculateTotal(1000, 0.10, 0.05);
        assertEquals(1050, total);
    }

    @Test
    public void testTaxCalculation() {
        InvoiceService service = new InvoiceService();
        double total = service.calculateTotal(2000, 0.10, 0);
        assertEquals(2200, total);
    }

    @Test
    public void testDiscountCalculation() {
        InvoiceService service = new InvoiceService();
        double total = service.calculateTotal(2000, 0, 0.10);
        assertEquals(1800, total);
    }
}