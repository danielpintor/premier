package com.hcl.howdy;

import java.util.Scanner;

public class Tester {
	static int sum(int x) {
		if (x == 0) {return 0;}
		return x + sum(x-1);
	}
	
	static boolean isPrime(int pretender) {
		if (pretender == 0 || pretender == 1) {
			return false;
		}
		if (pretender == 2) {
			return true;
		}
		for (int i = (pretender-1); i >= 2; i--) {
			if ((pretender % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for (int j = 1; j <= 20; j++) {
			System.out.println(sum(j));
		}
	
	int age = 11;//Exercise 7
	
	Outer:
		
	while(age <= 21) {
		age++;
		if (age == 16) {
			System.out.println("Get your driver's licence");
			break Outer;
		}
		else {
			System.out.println("Another year");
			}
		}
	
		char character = 'g';//Exercise 8
		
		switch (character) {
		case 'a':
			System.out.println("As expected.");
			break;
		case 'b':
			System.out.println("Wait a second...");
			break;
		case 'c':
			System.out.println("Excuse me?");
			break;
		case 'd':
			System.out.println("Let me speak to the principal!");
			break;
		case 'f':
			System.out.println("...");
			break;
		default:
			System.out.println("Well, what are you waiting for?");
			break;
		}
		
		System.out.println(-5 + (8*6));//Exercise 10
		System.out.println((55+9) % 9);
		System.out.println(20+((-3*5)/8));
		System.out.println(5+((15/3)*2)-(8 % 3));
		
		Scanner scan = new Scanner(System.in);//Exercise 11a
		System.out.println("Enter first number: ");
		int a = scan.nextInt();
		System.out.println("Enter second number: ");
		int b = scan.nextInt();
		
		
		System.out.println("Sum: " + (a+b));
		System.out.println("Product: " + (a*b));
		System.out.println("Difference: " + (a-b));
		System.out.println("Quotient: " + (a/b));
		System.out.println("Remainder: " + (a%b));
		
		System.out.println("Enter first number: ");//Exercise 11b
		a = scan.nextInt();
		System.out.println("Enter second number: ");
		b = scan.nextInt();
		System.out.println("Enter third number: ");
		int c = scan.nextInt();
		
		System.out.println((a+b+c)/3.0);
		
		System.out.println("Enter first string: ");//Exercise 12
		StringBuffer h = new StringBuffer(scan.nextLine());
		System.out.println("Enter second string: ");
		StringBuffer i = new StringBuffer(scan.nextLine());
		StringBuffer z = new StringBuffer();
		
		System.out.println("At first the order was "+ h + ", " + i);
		
		z = i;
		i = h;
		h = z;
		
		System.out.println("But after swap, it is "+ h + ", " + i);
		
		System.out.println("Do you have a prime number in mind?: ");//Exercise 13
		int p = scan.nextInt();
		boolean result = isPrime(p);
		
		if (result) {
			System.out.println("Hey, you do!");
		}
		else {
			System.out.println("Sorry, you don't.");
		}
		
		System.out.println("Wanna know your ASCII?: ");//Exercise 14
		char asciiPrototype = scan.next().charAt(0);
		int ascii = (int) asciiPrototype;
		
		System.out.println("Here it is: " + ascii);
		
		for (int m = 1; m <= 100; m++) {//Exercise 15
			if ((m % 3 == 0) && (m % 5 != 0)) {
				System.out.println("Fizz");
			}
			if ((m % 3 != 0) && (m % 5 == 0)) {
				System.out.println("Buzz");
			}
			if ((m % 3 == 0) && (m % 5 == 0)) {
				System.out.println("Fizz Buzz");
			}
			if ((m % 3 != 0) && (m % 5 != 0)) {
				System.out.println(m);
			}
		}
		scan.close();
	}
}