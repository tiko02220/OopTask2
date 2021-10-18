package com.company;
public class Main {
    public static void main(String[] args) {
         Invoice invoice = new Invoice("Default","Default",0,0);
         invoice.setPartNumber("001A");
         invoice.setPartDescription("Phone");
         invoice.setQuantity(10);
         invoice.setPrice(20.10);
         invoice.ViewInvoice();
     }
 }
class  Invoice{
     private String  PartNumber;
     private String  PartDescription;
     private int Quantity;
     private double Price;
     Invoice ( String PartNumber, String PartDescription,int Quantity,double Price){
        this.PartDescription = PartDescription;
        this.PartNumber = PartNumber;
        this.Quantity = Quantity;
        this.Price = Price;
    }
    public void setPartNumber(String partNumber){
        this.PartNumber = partNumber;
    }
    public String getPartNumber(){
        return  PartNumber;
    }
    public void setPartDescription(String PartDescription){
        this.PartDescription =PartDescription;
    }
    public String getPartDescription(){
        return  PartDescription;
    }
    public void setQuantity(int Quantity){
          if(Quantity>0){
          this.Quantity = Quantity;
         }else this.Quantity = 0;
    }
    public int getQuantity(){
         return  Quantity;
    }
    public void setPrice(double Price){
         if(Price>0){
         this.Price = Price;
         }else this.Price = 0;
     }
    public double getPrice(){
         return Price;
    }
    public double TotalInvoice(){
         return Quantity * Price;
    }
    public void ViewInvoice(){
      System.out.println("Number of part- "+getPartNumber()+"\n"+"Description- "+getPartDescription()+"\n"
     +"Sold items- "+getQuantity()+"\n"+"Price of one item- "+getPrice()+"$"+"\n"+"Total Invoice- "+TotalInvoice()+"$");
    }
}

