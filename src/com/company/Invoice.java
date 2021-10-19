package com.company;

public class Invoice {
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
        }
        else {
            this.quantity = 0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
        else {
            this.price = 0.0;
        }
    }

    public double getPrice() {
        return price;
    }

    public float totalInvoice() {
        return (float) (quantity * price);
    }


    public String toString() {
        return "Invoice-" + "PartNumber is'" + getPartNumber() + '\n' +
                "       PartDescription is'" + getPartDescription() + '\n' +
                "       Quantity is'" + getQuantity() + '\n' +
                "       Price is'" + getPrice() + "$" + '\n' +
                "       Total Invoice is'" + totalInvoice() + "$";

    }

    public boolean equals(Invoice invoice) {
        if (getQuantity() == invoice.getQuantity() &&
                getPrice() == invoice.getPrice() &&
                getPartNumber().equals(invoice.getPartNumber()) &&
                getPartDescription().equals(invoice.getPartDescription())) {
            return true;
        }
        else {
            System.out.println(invoice);
        }
        return false;
    }


}

