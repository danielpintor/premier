package com.hcl.howdy;
public class DogTest
{
	public static void main(String args[]) {
		Dog deg = new Dog("Dory", 2, 50);
		Dog dag = new Dog("Violet", 4, 45);
		Dog dig = new Dog("Striker");
		Dog dug = new Dog("Rex", 1);
				
		
		System.out.println(deg);
		System.out.println(dag);
		System.out.println(dig);
		System.out.println(dug);
		
		deg.showExcitement();
		dag.showExcitement();
		dig.showExcitement();
		dug.showExcitement();
		
		deg.showExcitement(4);
		dig.showExcitement(5);
		dag.showExcitement(7);
		
		dig.eating();
		dug.eating("cats");
	}
}