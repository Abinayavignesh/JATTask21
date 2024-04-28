package Task9;

import java.util.Scanner;

public class starPattern {

		//Print the given Star pattern
		public static void main(String[] args) {
			//Variable declaration
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows to be printed :");
		int n=sc.nextInt();
		//printing the rows and columns with i and j
		//Outer loop to handle number of rows
		System.out.println("Your Star pattern :");
		for(i=1;i<=n;i++)
		{
			//inner loop to handle number of columns
			for(j=1;j<=n;j++)
			{
				if(i==j || i+j == n+1) 
				{
				System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
			}
			// print new line for each row
			System.out.println();
			
		}
		
	}
		
}

/*
Output:
Enter the number of rows to be printed :
5
Your Star pattern :
*   *
 * * 
  *  
 * * 
*   *

*/
