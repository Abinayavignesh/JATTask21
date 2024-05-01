package Task10;
//Create a class person
public class person {
	//attributes are created for name and age
	private String name; // global variable
	private int age; //global variable
	
	//Creating constructor same as the class name.
	//Default constructor
	person() {
	System.out.println("hello this is Default constructor");
	}
	
	//Parameterized Constructor
	person(String a,int b){
		name=a;
		age=b;
	}
	
	//Creating getter methods for the attributes name and age
	public String getname() 
	{
		return name;
	}
		
	public int getage() {
		return age;
		
	}
	
	public static void main (String[] args) {
		//Creating object for the default constructor
		person def=new person();
		//Creating object for the parameterized constructor
		person p=new person("Aarav", 4);
		System.out.println("The name and the age is :");
		System.out.println("Name :" +" " + p.getname());
		System.out.println("Age :"+" "+ p.getage());
		
		person p1=new person("Aadhvik", 2);
		System.out.println("The name and the age is :");
		System.out.println("Name :" +" " + p1.getname());
		System.out.println("Age :"+" "+ p1.getage());
		
	}
}

/*
Output :
hello this is Default constructor
The name and the age is :
Name : Aarav
Age : 4

The name and the age is :
Name : Aadhvik
Age : 2


*/
