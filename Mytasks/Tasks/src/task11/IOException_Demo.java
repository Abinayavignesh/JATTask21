package task11;

import java.util.Scanner;

public class IOException_Demo {

	public static void main(String[] args) {
		// Create a new scanner with the specified String 
        // Object 
        Scanner scan = new Scanner("Hello Geek!"); 
  
        // Print the line 
        System.out.println("" + scan.nextLine()); 
  
        // Check if there is an IO exception 
        System.out.println("Exception Output: " + scan.ioException()); 
  
      
	}
	}


