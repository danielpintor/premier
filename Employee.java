package com.hcl.howdy;

public class Employee 
{
	String firstName;
	String lastName;
	double monthlySalary;
	
	Employee(){
		this.firstName = "John";
		this.lastName = "Doe";
		this.monthlySalary = 0.0;
	}
	
	Employee(String fstname, String lstname, double mthlyslry){
		this.firstName = fstname;
		this.lastName = lstname;
		if(mthlyslry >= 0) {
		this.monthlySalary = mthlyslry;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
    public static void main( String[] args )
    {
    	
    }
}
