package Task10;

//Class TeaClass
class TeaClass {
	protected boolean isprepared;
	protected boolean avlmilk;
	protected boolean avlsugar;
	//Default Constructor
	public TeaClass() {
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
	//Creating method to add sugar
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
//Creating a subclass BlackTea and inherits the parent class TeaClass
class BlackTea extends TeaClass{
	//overriding the method
	public void prepareTea() {
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

//Creating a subclass GreenTea and inherits the parent class TeaClass
	class GreenTea extends TeaClass{
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
	//Creating a subclass HerbalTea and inherits the parent class TeaClass
	class HerbalTea extends TeaClass{
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
	//Main Class
	public class Main{
		public static void main(String[] args) {
			//Creating the objects for the sub classes and calling the methods
			BlackTea black=new BlackTea();
			black.prepareTea();
			black.addmilk();
			black.addsugar();
			black.prepareTea();
			System.out.println();
			
			GreenTea green=new GreenTea();
			green.prepareTea();
			green.addmilk();
			green.addsugar();
			System.out.println();
			
			HerbalTea herbal=new HerbalTea();
			herbal.prepareTea();
			herbal.addmilk();
			herbal.addsugar();
			System.out.println();

			}
		}

/*
Output:
Prepare Black tea with hot water and black tea leaves
Brewing times :3 minutes
Add some milk to the tea.
Add some sugar to tea
BlackTea has been already prepared.

Prepare green tea with hot water and green tea leaves
Brewing time : 5 minutes
Add some milk to the tea.
Add some sugar to tea

Prepare herbal tea with hot water and herbal tea leaves
Brewing time : 8 minutes
Add some milk to the tea.
Add some sugar to tea
*/
	
		
		