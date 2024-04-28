package Task9;

import java.util.Scanner;
//Create a class for finding the largest number among given three numbers.
public class largestNumber {

	//Main class
	public static void main(String[] args) {
		//Using scanner class, get the three values from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number to compare :");
		int firstnum=sc.nextInt();
		System.out.println("Enter the second number to compare :");
		int secondnum=sc.nextInt();
		System.out.println("Enter the third number to compare :");
		int thirdnum=sc.nextInt();
		
		//Using if else to check among three numbers
		//if both the condition is true it print the number 1 
		//else it check the else if condition
		if(firstnum>secondnum && firstnum>thirdnum)
		{
			System.out.println("First number is greater :" + firstnum);
		}
		//if this condition is also false it prints the else condition
		else if(secondnum>firstnum && secondnum>thirdnum)
		{
			System.out.println("Second number is greater :" + secondnum);
		}
		else 
		{
			System.out.println("Third number is greater :" + thirdnum);
		}
	}

}

/*Output:
Enter the first number to compare :
2
Enter the second number to compare :
9
Enter the third number to compare :
5
Second number is greater :9

*/