package Task10;
//Class Tea creation
public class Tea {
	private boolean isprepared;
	private boolean avlmilk;
	private boolean avlsugar;
	
	//Default constructor
	public Tea() {
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

	//method to add milk in tea
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
	
	//method to add sugar in tea
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
	public static void main(String[] args) {
		//Object creation for Tea
		Tea t=new Tea();
		//Calling the methods with objects
		t.prepareTea();
		t.addmilk();
		t.addsugar();
		t.addsugar();
		t.addmilk();
		t.prepareTea();
	}

}

/*
output:
Prepare tea with hot water and tea leaves:
Add some milk to the tea.
Add some sugar to tea
Sugar added already.
Milk is added already
Tea already prepared.
*/
