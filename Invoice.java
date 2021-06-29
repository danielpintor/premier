package com.hcl.howdy;

public class Invoice 
{
	String partNo;
	String partDesc;
	int itemQt;
	double itemPr;
	
	Invoice(){
		this.partNo = "0";
		this.partDesc = "Sample text";
		this.itemQt = 0;
		this.itemPr = 0.00;
	}
	
	Invoice(String number, String description, int quantity, double price){
		this.partNo = number;
		this.partDesc = description;
		this.itemQt = quantity;
		this.itemPr = price;
	}
	
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	
	public void setItemQt(int itemQt) {
		this.itemQt = itemQt;
	}
	
	public void setItemPr(double itemPr) {
		this.itemPr = itemPr;
	}
	
	public String getPartNo() {
		return partNo;
	}
	
	public String getPartDesc() {
		return partDesc;
	}
	
	public int getItemQt() {
		return itemQt;
	}
	
	public double getItemPr() {
		return itemPr;
	}
	
	public double getInvoiceAmount() {
		int quantity = this.getItemQt();
		if (quantity < 0) {quantity = 0;}
		double price = this.getItemPr();
		if (price < 0.0) {price = 0.0;}
		double amount = quantity * price;
		return amount;
	}
	
    public static void main( String[] args )
    {
    	
    }
}
