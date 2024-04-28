/*Program to find whether the given number is Palindrome or not 
using for loop and if-else*/

package Task9;
// package import
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//declaring Variables
		int i; 
		String rev="";
		// Creating object for the Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word to check : ");
		String word=sc.nextLine();
		//reversing the string using for loop
		for(i=word.length()-1;i>=0;i--) 
		{
			char ch=word.charAt(i);
			rev=rev+ch;
		}
		//Checking conditions using if-else Loop
		if(word.equals(rev)) {
			System.out.println("Yes the given Word is a Palindrome:"+" "+ word);
			return;
		}
		//if condition fails it moves to the else block
		else
		{
			System.out.println("Yes the given Word is not a Palindrome:"+""+ word);
		}
	}
}

/* Enter the word to check : amma
Yes the given Word is a Palindrome: amma */
