package task11;

import java.util.*;
import java.lang.*;
//class representing custom exception  
class InvalidAgeException extends Exception {
	InvalidAgeException(String message){
		// calling the constructor of parent Exception 
		super(message);
	}
}
//class that uses custom exception InvalidAgeException  
public class customeAgeException{
	public static void main(String[] args) {
		int age;
		// Taking input from user
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("Enter Your Age :");
		age=sc.nextInt();
		 // Attempt to check the age
		if(age<18) {
			// Throw a custom PaymentException for invalid payment amount
			throw new InvalidAgeException("Invalid Age, You are not Eligible");
		}else {
			System.out.println("You are Eligible");
		}
		}catch(InvalidAgeException ae) {
			// Handle the PaymentException
			System.out.println("Caught an Exception");
			System.out.println(ae.getMessage());
		}
	}
			
}

