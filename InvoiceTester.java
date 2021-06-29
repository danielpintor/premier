package com.hcl.howdy;
import java.util.Scanner;
public class InvoiceTester
{
    public static void main( String[] args )
    {
    	Invoice inv = new Invoice("128712", "A hammer.", 373, 8.99);
    	System.out.println(inv.getPartNo());
    	System.out.println(inv.getPartDesc());
    	System.out.println(inv.getItemQt());
    	System.out.println(inv.getItemPr());
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Wanna change the description?: ");
    	String newdesc = scan.nextLine();
    	inv.setPartDesc(newdesc);
    	
    	System.out.println(inv.getPartNo());
    	System.out.println(inv.getPartDesc());
    	System.out.println(inv.getItemQt());
    	System.out.println(inv.getItemPr());
    	
    	System.out.println("Invoice amount: " + inv.getInvoiceAmount());
    	
    	scan.close();
    }
}
