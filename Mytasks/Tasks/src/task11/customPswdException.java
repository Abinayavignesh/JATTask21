package task11;
//Importing Scanner Class for user input
import java.util.Scanner;
//Create a InvalidPasswordException class
class InvalidPasswordException extends Exception{
	InvalidPasswordException(String message){
		super(message);
	}
}
public class customPswdException {
		public static void main(String[] args) {
		//Declaring variables
		String name;
		String password;
		String pswd="Guvi@123";
		// Taking input from user
		Scanner sc=new Scanner(System.in);
		try {
			
			// Taking input of username
			System.out.println("Enter the Username to login : ");
			name=sc.nextLine();
			// Taking input of Password
			System.out.println("Enter the Password to login : ");
			password=sc.nextLine();
			// Validation the password with the given password
			if(!password.equals(pswd)){
				 throw new InvalidPasswordException("wrong password");
	        }else {
	        	System.out.println("Login Successful");
	        }
			// If there is any  exception in the try block
	        // then catch will handle the exception
		 }catch (InvalidPasswordException e){
			// Message printed after catching the exception
            System.out.println("Caught an Exception");
            System.out.println(e.getMessage());
        }
		
	}

}
