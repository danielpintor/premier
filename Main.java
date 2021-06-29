package com.hcl.howdy;
import java.util.Scanner;

public class Main//Exercise 16
{
    public static void main( String[] args )
    {
       UserMainCode umc = new UserMainCode();
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a positive integer: ");
       int number = scan.nextInt();
       int result = umc.checkSum(number);
       if (result == 1) {
    	   System.out.println("Sum of odd digits is odd");
       }
       else {
    	   System.out.println("Sum of odd digits is even");
       }
       scan.close();
    }
}

