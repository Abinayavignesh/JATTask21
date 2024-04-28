package Task9;

import java.util.Scanner;
//Print the given number pattern
public class numberPattern {
	public static void main(String[] args) {
		//Variable declaration
	int i,j,k=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows to be printed :");
	int n=sc.nextInt();
	//printing the rows and columns with i and j
	//Outer loop to handle number of rows
	System.out.println("Your Number pattern :");
	for(i=1;i<=n;i++)
	{
		//inner loop to handle number of columns
		for(j=1;j<i+1;j++)
		{
			
			System.out.print(k+" ");
			k++;
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
Your Number pattern :
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/