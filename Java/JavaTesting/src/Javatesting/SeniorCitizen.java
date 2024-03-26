package Javatesting;
import java.util.*;

public class SeniorCitizen {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the birth year :");
		int birth_year=scan.nextInt();
		System.out.println("Enter the current year:");
		int curr_year=scan.nextInt();
		int age=curr_year-birth_year;
		if(age>60)
		{
		System.out.println("You are senior citizen");
		}
		else{
		System.out.println("You are not a senior citizen");
		}
	}
}
