package org.emp;

public class Employee {
	
	private void empid() {
		System.out.println("Employee Id is : 123");
	}	
	private void empname() {
		System.out.println("Employee name is : shalini");

	}
	private void empdob() {
		System.out.println("Employee DOB is : 19.8.1990");

	}
	private void empphone() {
		System.out.println("Employee phone number is 9952184132");

	}
	private void empemail() {
		System.out.println("Employee Email is : shalini.charan@gmail.com");

	}
	private void empaddress() {
		System.out.println("Employee address is Perumbakkam");
	}
    public static void main(String[] args) {
		Employee e = new Employee();
		e.empid();
		e.empname();
		e.empdob();
		e.empphone();
		e.empemail();
		e.empaddress();
	}
}
