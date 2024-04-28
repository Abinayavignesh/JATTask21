package Task9;
/*The newly appointed Vice-Chancellor of Anna University wanted to create an automated 
 * grading system for the students to check their grade. 
 * When a student enters the marks, the grading system displays the corresponding grade. 
 * Now, write a program to display the grade if marks are entered. 
 * Marks scored Grade 100 S 90 - 99 A 80 - 89 B 70 - 79 C 60 - 69 D 50 - 59 E <50 F*/
import java.util.Scanner;

public class gradingSystem {
//Anna University grading system
/* The input consists of one integer which corresponds to the marks sscored by the student*/
	public static void main(String[] args) {
		
		// Create a Scanner object to read input.
		Scanner sc=new Scanner(System.in);
		
		// Get the test score.
		System.out.println("Enter the marks obtained: ");
		int marks=sc.nextInt();
		
		// Calculate the grade.
		if(marks>100)
			System.out.println("Enter a valid Input");
		else if(marks==100) 
			System.out.println("You have scored S grade");
		else if(marks>=90 && marks<100) 
			System.out.println("You have scored A grade");
		else if(marks>=80 && marks<90) 
			System.out.println("You have scored B grade");
		else if(marks>=70 && marks<80) 
			System.out.println("You have scored C grade");
		else if(marks>=60 && marks<70) 
			System.out.println("You have scored D grade");
		else if(marks>=50 && marks<60) 
			System.out.println("You have scored E grade");
		else 
			System.out.println("You have scored F grade");
	}

}

/*
output 1:
	Enter the marks obtained: 60
	You have scored D grade

output 2:
	Enter the marks obtained: 100
	You have scored S grade

output 3:	
	Enter the marks obtained: 48
	You have scored F grade	
*/
