package com.hcl.howdy;

public class Date 
{
	int month;
	int day;
	int year;
	
	Date(){
		this.month = 1;
		this.day = 1;
		this.year = 1970;
	}
	
	Date(int mois, int jour, int an){
		this.month = mois;
		this.day = jour;
		this.year = an;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println(this.getMonth() + "/" + this.getDay() + "/" + this.getYear());
	}
	
    public static void main( String[] args )
    {
    	
    }
}
