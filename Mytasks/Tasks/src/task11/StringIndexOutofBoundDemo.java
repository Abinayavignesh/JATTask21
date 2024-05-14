package task11;

import java.util.Scanner;

public class StringIndexOutofBoundDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Line=sc.nextLine();
	try { 
			char ch = Line.charAt(20); // Trying to access index out of bounds 
            System.out.println("Character at index 20: " + ch); 
        } catch (StringIndexOutOfBoundsException e) { 
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of bounds."); 
           
        } 
	   }
	}
