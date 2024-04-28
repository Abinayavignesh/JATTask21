package Task9;
// Program to read a string and reverse it using loop
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// variable declaration
		String rev="";
		//object creation for Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word to Reverse :");
		// getting the input from the user and storing it in a variable
		String original=sc.nextLine();
		// reversing the given word using for loop
		for(int i=original.length()-1;i>=0;i--)
		{
			char ch=original.charAt(i);
			rev=rev+ch;
		}
		//Printing the reversed string
		System.out.println(" the reversed word is: " + rev);
	}
}
/*Enter the word to Reverse : Abinaya
 the reversed word is: ayanibA */
