package Task10;
//Class TeaClass1
class TeaClass1 {
	protected boolean isprepared;
	protected boolean avlmilk;
	protected boolean avlsugar;
	
	//Default Constructor
	public TeaClass1() {
		isprepared=false;
		avlmilk=false;
		avlsugar=false;
	}
	//creating method to prepare tea
	public void prepareTea() {
			if(!isprepared) {
			System.out.println("Prepare tea with hot water and tea leaves");
			isprepared=true;
		}
		else
		{
			System.out.println("Tea already prepared.");
		}
	}
	//creating method to add milk
	public void addmilk() {
		if(isprepared) 
		{
			if(!avlmilk)
			{
				System.out.println("Add some milk to the tea.");
				avlmilk=true;
			}
			else
			{
				System.out.println("Milk is added already");
			}
			}
			else
			{
			System.out.println("First Prepare the tea");	
			}
		}
	
	//creating method to add sugar
	public void addsugar() {
		if(isprepared)
		{
			if(!avlsugar)
			{
				System.out.println("Add some sugar to tea");
				avlsugar=true;
			}
			else
			{
				System.out.println("Sugar added already.");
			}
			}
			else
			{
				System.out.println("Prepare the tea first");
			}
	}
}
//Creating a subclass BlackTea1 and inherits the parent class TeaClass1
class BlackTea1 extends TeaClass1{
	
	public void prepareTea() {
		//overriding the method
		if(!isprepared) {
		System.out.println("Prepare Black tea with hot water and black tea leaves");
		System.out.println("Brewing times :3 minutes");
		isprepared=true;
		
	}
	else
	{
		System.out.println("BlackTea has been already prepared.");
	}
  }
}

//Creating a subclass GreenTea1 and inherits the parent class TeaClass1
	class GreenTea1 extends TeaClass1{
		//overriding the method
		public void prepareTea() {
			if(!isprepared) {
				System.out.println("Prepare green tea with hot water and green tea leaves");
				System.out.println("Brewing time : 5 minutes");
				isprepared=true;
			}
			else
			{
				System.out.println("Green Tea has already been prepared.");
			}
		}
		
	}
	//Creating a subclass HerbalTea1 and inherits the parent class TeaClass1
	class HerbalTea1 extends TeaClass1{
		//overriding the method
		public void prepareTea() {
			if(!isprepared) {
				System.out.println("Prepare herbal tea with hot water and herbal tea leaves");
				System.out.println("Brewing time : 8 minutes");
				isprepared=true;
			}
			else
			{
				System.out.println("Herbal Tea has already been prepared.");
			}
		}
	}
	//class Main
public class Main1 {

	public static void main(String[] args) {
	// Creating array of Tea Objects
		TeaClass1[] tea=new TeaClass1[4];
		
		//Object creation with array for the super class and sub classes
		tea[0]=new TeaClass1();
		tea[1]=new BlackTea1();
		tea[2]=new GreenTea1();
		tea[3]=new HerbalTea1();
		
		//Using for loop to call the classes and subclasses
		for(TeaClass1 teas : tea)
		{
			teas.prepareTea();
			teas.addmilk();
			teas.addsugar();
			System.out.println();
		}
		

	}

}

/*
 Output:
Prepare tea with hot water and tea leaves
Add some milk to the tea.
Add some sugar to tea

Prepare Black tea with hot water and black tea leaves
Brewing times :3 minutes
Add some milk to the tea.
Add some sugar to tea

Prepare green tea with hot water and green tea leaves
Brewing time : 5 minutes
Add some milk to the tea.
Add some sugar to tea

Prepare herbal tea with hot water and herbal tea leaves
Brewing time : 8 minutes
Add some milk to the tea.
Add some sugar to tea
*/