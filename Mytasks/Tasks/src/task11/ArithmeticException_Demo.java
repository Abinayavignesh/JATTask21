package task11;
import java.util.Scanner;

// Java program to demonstrate ArithmeticException
public class ArithmeticException_Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		try { 
			// performing division and storing the result  
			int c = a/b;  // cannot divide by zero 
			System.out.println("Division process has been done successfully.");  
            System.out.println ("Result = " + c); 
        } 
		// handling the exception in the catch block  
        catch(ArithmeticException e) { 
            System.out.println ("Can't divide a number by 0"); 
        } 
    } 

	}

