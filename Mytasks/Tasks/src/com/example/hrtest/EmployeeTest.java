package com.example.hrtest;
//Importing Employee class from package com.example.hr
import com.example.hr.Employee;

public class EmployeeTest {
//Main method
	public static void main(String[] args) {
		//Creating instance of Employee class
			Employee obj=new Employee("Aarav",100,25000.0);
			System.out.println("The Employee Details");
			//Calling printName method from Employee Class
			obj.printName();
			//Calling printSalary method from Employee Class
			obj.printSalary();
			Employee obj1=new Employee("Aadhvik",101,23000.0);
			System.out.println();
			System.out.println("The Employee Details 2");
			//Calling printName method from Employee Class for employee 2
			obj1.printName();
			//Calling printSalary method from Employee Class for employee 2
			obj1.printSalary();
	}

}
