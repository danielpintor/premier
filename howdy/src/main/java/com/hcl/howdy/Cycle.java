package com.hcl.howdy;

class Cycle{
	String define_me() {
		return "a vehicle with pedals.";
		}
}

class Bike extends Cycle{
	String define_me() {
		return "a cycle with an engine.";
	}
	
	Bike(Cycle c){
		System.out.println("Hello I am a motorcycle, I am " + this.define_me());
		String temp = c.define_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}
}