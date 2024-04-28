package Task9;
/*Write a C program to calculate the hotel tariff. 
The room rent is 20% high during peak seasons [April-June, November-December] . 
Use Switch statement.*/

import java.util.Scanner;

public class hotelTariff {

	public static void main(String[] args) {
		int month,days; // variable declaration for int datatype
		float rent,normal=0,season=0;//// variable declaration for float datatype
		
		//Getting input from the user using Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month for booking: ");
		month=sc.nextInt();
		System.out.println("Enter the room rent for booking: ");
		rent=sc.nextFloat();
		System.out.println("Enter the days for stay: ");
		days=sc.nextInt();
		
		//Calculate the rent during normal month
		normal=rent*days;
		//Calculate the rent during seasonal month
		season=(float)((rent+(rent*0.2))*days);
		
		//Use Switch case to get the month for booking during normal or seasonal month
		switch(month) {
		case 1:
			System.out.println("The total rent for your stay is : " + normal);
			break;
		case 2:
			System.out.println("The total rent for your stay is : " + normal);
			break;
		case 3:
			System.out.println("The total rent for your stay is : " + normal);
			break;
		case 4:
			System.out.println("The total rent for your stay is : " + season);
			break;
		case 5:
			System.out.println("The total rent for your stay is : " + season);
		break;
		case 6:
			System.out.println("The total rent for your stay is : " + season);
			break;
		case 7:
			System.out.println("The total rent for your stay is : " + normal);
			break;
		case 8:
			System.out.println("The total rent for your stay is : " + normal);
			break;
		case 9:
			System.out.println("The total rent for your stay is : " + normal);
			break;
		case 10:
			System.out.println("The total rent for your stay is : " + normal);
			break;
		case 11:
			System.out.println("The total rent for your stay is : " + normal);
			break;
		case 12:
			System.out.println("The total rent for your stay is : " + season);
			break;
		default:
			System.out.println("Invalid input");
			
		}
		
	}

}
/*
output 1:
Enter the month for booking: 2
Enter the room rent for booking: 1500
Enter the days for stay: 2
The total rent for your stay is : 3000.0

output 2:
Enter the month for booking: 4
Enter the room rent for booking: 1000
Enter the days for stay: 5
The total rent for your stay is : 6000.0
*/
