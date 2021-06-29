package com.hcl.howdy;
public class Dog
{
	String name;
	int age;
	double weight;
	
	public void showExcitement() {
		System.out.println(name + " is wagging its tail!!!");
	}
	public void showExcitement(int levelOfExcitement) {
		switch(levelOfExcitement) {
			case 1:
				System.out.println(name + " is laying down.");
				break;
			case 2:
				System.out.println(name + " lifted its head.");
				break;
			case 3:
				System.out.println(name + " is looking around.");
				break;
			case 4:
				System.out.println(name + " is running around.");
				break;
			case 5:
				System.out.println(name + " is jumping about and biting trees!");
				break;
			default:
				System.out.println(name + " is wagging its tail!!!");
				break;
		}
	}
	
	public void eating() {
		System.out.println(name + " eating!");
	}
	
	public void eating(String food) {
		System.out.println(name + " eating " + food + "!");
	}
	
	Dog(){
		this.name = "pupper";
		this.age = 0;
		this.weight = 0;
	}
	
	Dog(String nom, int edad, int poids){
		this.name = nom;
		this.age = edad;
		this.weight = poids;
	}
	
	Dog(String nom){
		this.name = nom;
		System.out.println("This here's " + nom + " and that's about all we know.");
	}
	
	Dog(String nom, int edad){
		this.name = nom;
		this.age = edad;
		System.out.println("This is " + nom + ", he/she's " + edad + " year(s) old, and our scale is broken.");
	}
	
	@Override
	public String toString() {
		return String.format(name + ", " +  age + " year(s) old, " + weight + "lbs.");
	}
	
}