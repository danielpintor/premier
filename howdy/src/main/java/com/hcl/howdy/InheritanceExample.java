package com.hcl.howdy;

public class InheritanceExample
{
	public static void main(String[] args) 
	{
		Cycle C = new Cycle();
		Bike M = new Bike(C);
	}
}