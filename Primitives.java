package com.hcl.howdy;

public class Primitives 
{
    public static void main( String[] args )
    {
    	
    	int i = 57;//Exercise 3
    	char c = 'd';
    	boolean b = true;
    	String str = "yo";
    	System.out.println(i);
        System.out.println(c);
        System.out.println(b);
        System.out.println(str);
        
        int x = 2;//Exercise 4
        int y = 5;
        int z = 0;
        
        System.out.println(x==2);
        System.out.println(x!=5);
        System.out.println(x!=5 && y>=5);
        System.out.println(z!=0 || x==2);
        System.out.println(!(y<10));
        
        for (int j = 1; j <= 10; j++) {//Exercise 5
        	System.out.println(j);
        }
    	
        	
    }
    }
