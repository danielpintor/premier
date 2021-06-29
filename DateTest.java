package com.hcl.howdy;
public class DateTest
{
    public static void main( String[] args )
    {
    	Date dt = new Date(6, 17, 2021);
    	
    	System.out.println(dt.getMonth());
    	System.out.println(dt.getDay());
    	System.out.println(dt.getYear());
    	
    	dt.displayDate();

    	dt.setDay(29);
    	
    	dt.displayDate();
    	
    }
}
