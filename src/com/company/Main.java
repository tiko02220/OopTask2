package com.company;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Default", "Default", 0, 0);
        invoice.setPartNumber("001A");
        invoice.setPartDescription("Phone");
        invoice.setQuantity(10);
        invoice.setPrice(20.10);
        invoice.viewInvoice();
    }
}

