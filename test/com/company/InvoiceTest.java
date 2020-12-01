package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice invoice;
    @BeforeEach
    void setUp() {
        invoice = new Invoice("001", "graphicsCard",5,100.00);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setPartNumber() {
        invoice.setPartNumber("002");
        assertEquals("002", invoice.getPartNumber());
    }

    @Test
    void getPartNumber() {
        assertEquals("001", invoice.getPartNumber());
    }

    @Test
    void setPartDescription() {
        invoice.setPartDescription("test");
        assertEquals("test", invoice.getPartDescription());
    }

    @Test
    void getPartDescription() {
        assertEquals("graphicsCard", invoice.getPartDescription());
    }

    @Test
    void setItemQuantity() {
        invoice.setItemQuantity(10);
        assertEquals(10, invoice.getItemQuantity());
    }

    @Test
    void getItemQuantity() {
        assertEquals(5, invoice.getItemQuantity());
    }

    @Test
    void setPricePerItem() {
        invoice.setPricePerItem(200.00);
        assertEquals(200.00, invoice.getPricePerItem());
    }

    @Test
    void getPricePerItem() {
        assertEquals(100.00, invoice.getPricePerItem());
    }

    @Test
    void getInvoiceAmount() {
        assertEquals(500.00, invoice.getInvoiceAmount());
    }
}