package Javatesting;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First number:");
		a=scan.nextInt();
		System.out.println("Enter the Second number:");
		b=scan.nextInt();
		System.out.println("before swapping numbers: "+a +"  "+ b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping: "+a +"   " + b);  
	       
	}

}
