package Task10;

import java.util.Scanner;
//Create class Account
public class account {
	private double balance,amount;
	
	//Constructor with no arguments
	account(){
		balance=0.0;
		amount=0.0;
	}
	
	//constructor with arguments
	account(double bal){
		balance=bal;
	}
	//Creating getter and setter methods for the given attributes
	public double getbalance() {
		 return balance;
	}
	public void setbalance(double bal) {
		balance=bal;
	}
	//method withdraw to check the remaining balance
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance)
		{
			balance=balance-amount;
			System.out.println("The withdrawn amount is:" + amount);
		}
		else
		{
			System.out.println("You dont have enough amount");
		}
	}
	
	//To calculate the deposited amount and total the sum amount
	public void depositBalance(double amount) {
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("The deposited amount is:" + amount);
		}
		else 
		{
		System.out.println("Invalid Deposit");	
		}
	}
	public double balance1() {
		return balance;
	}
	public static void main(String[] args) {
		
		// create a circle object using the constructor with no arguments
		account acc=new account();
		System.out.println("Initial Balance is :" + acc.balance1());
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the amount to deposit:");
		double amount=sc.nextDouble();
		acc.depositBalance(amount);
		System.out.println("Your new balance after deposit is :"+ acc.balance1());
		
		System.out.println("Enter the amount to withdraw:");
		double drawn=sc.nextDouble();
		acc.withdraw(drawn);
		System.out.println("Your balance after withdrawn is:" + acc.balance1());
		
		// create a circle object using the constructor with one arguments\
		System.out.println("Your balance:");
		double ini=sc.nextDouble();
		account acc1=new account(ini);
		System.out.println("Your Balance after deposit :" +acc1.balance1());
		
		System.out.println("Enter the amount to Deposit:");
		double depo=sc.nextDouble();
		acc1.depositBalance(depo);
		System.out.println("Your new balance after Deposit is :"+ acc1.balance1());
		
		System.out.println("Enter the amount to withdraw:");
		double draw1=sc.nextDouble();
		acc1.withdraw(draw1);
		System.out.println("Your balance after withdrawn is:" + acc1.balance1());

	}

}

/*
 * Output:
Initial Balance is :0.0
Enter the amount to deposit:
200
The deposited amount is:200.0
Your new balance after deposit is :200.0
Enter the amount to withdraw:
50
The withdrawn amount is:50.0
Your balance after withdrawn is:150.0
Your balance:
1000
Your Balance after deposit :1000.0
Enter the amount to Deposit:
200
The deposited amount is:200.0
Your new balance after Deposit is :1200.0
Enter the amount to withdraw:
4000
Invalid
Your balance after withdrawn is:1200.0

 */
