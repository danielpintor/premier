package com.hcl.howdy;
public class Person
{
	private String name = "Jackson";
	private int age = 34;
	private double shoeSize = 9.5;
	
	
	
	private void walking() {
		System.out.println(age + " year old " + name + " is walking in his/her size " + shoeSize + " shoes.");
	}
	
	public void startWalking() {
		this.walking();
	}
}