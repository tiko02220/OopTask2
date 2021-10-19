package com.company;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Default", "Default", 0, 0);
        Invoice invoice2 = new Invoice("001A","Phone",10,20.10);
        invoice1.setPartNumber("001A");
        invoice1.setPartDescription("Phone");
        invoice1.setQuantity(10);
        invoice1.setPrice(20.10);
        System.out.println(invoice1.toString());
        System.out.println(invoice1.equals(invoice2));
    }
}

