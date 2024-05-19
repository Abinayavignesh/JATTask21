package com.example.hr;
//Creating a class for Employee
public class Employee {
	String name;
	int id;
	double salary;
//Creating a paramerterized constructor for the class employee	
public Employee(String empname,int empid,double empsal){
		name=empname;
		id=empid;
		salary=empsal;
	}
	//Method for Printing the name in the console
	public void printName() {
		System.out.println("Employee Name : "+ name);
		
	}
	//Method to print salary in console
	public void printSalary() {
		System.out.println("Employee Details : "+ salary);
	}
}
