package com.company;


class Invoice {
    private String partNm;//partNm = partNumber
    private String partDs;//partDs = partDescription
    private int quantity;
    private double price;

    Invoice(String partNm, String partDs, int quantity, double price) {
        this.partDs = partDs;
        this.partNm = partNm;
        this.quantity = quantity;
        this.price = price;
    }

    public void setPartNm(String partNm) {
        this.partNm = partNm;
    }

    public String getPartNm() {
        return partNm;
    }

    public void setPartDs(String partDs) {
        this.partDs = partDs;
    }

    public String getPartDs() {
        return partDs;
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
        System.out.println("Number of part- " + getPartNm());
        System.out.println("Description- " + getPartDs());
        System.out.println("Sold items- " + getQuantity());
        System.out.println("Price of one item- " + getPrice() + "$");
        System.out.println("Total Invoice- " + totalInvoice() + "$");

    }
}

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Default", "Default", 0, 0.0);
        invoice.setPartNm("001A");
        invoice.setPartDs("Phone");
        invoice.setQuantity(10);
        invoice.setPrice(20.10);
        invoice.viewInvoice();
    }
}

