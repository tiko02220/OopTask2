package com.company;


class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partDescription = partDescription;
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.price = price;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else this.quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else this.price = 0.0;
    }

    public double getPrice() {
        return price;
    }

    public double totalInvoice() {
        return quantity * price;
    }

    public void viewInvoice() {
        System.out.println("Number of part- " + getPartNumber());
        System.out.println("Description- " + getPartDescription());
        System.out.println("Sold items- " + getQuantity());
        System.out.println("Price of one item- " + getPrice() + "$");
        System.out.println("Total Invoice- " + totalInvoice() + "$");

    }
}

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

