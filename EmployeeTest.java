package com.hcl.howdy;
public class EmployeeTest
{
    public static void main( String[] args )
    {
    	Employee emp1 = new Employee("Michel", "Desjardins", 6300.00);
    	Employee emp2 = new Employee("JoAnne", "Farnesworth", 4750.00);
    	
    	System.out.println(emp1.getFirstName());
    	System.out.println(emp1.getLastName());
    	System.out.println(emp1.getMonthlySalary());
    	
    	System.out.println(emp2.getFirstName());
    	System.out.println(emp2.getLastName());
    	System.out.println(emp2.getMonthlySalary());
    	
    	emp1.setMonthlySalary((1.1*emp1.getMonthlySalary()));
    	emp2.setMonthlySalary((1.1*emp2.getMonthlySalary()));

    	System.out.println(emp1.getFirstName());
    	System.out.println(emp1.getLastName());
    	System.out.println(emp1.getMonthlySalary());
    	
    	System.out.println(emp2.getFirstName());
    	System.out.println(emp2.getLastName());
    	System.out.println(emp2.getMonthlySalary());
    }
}
