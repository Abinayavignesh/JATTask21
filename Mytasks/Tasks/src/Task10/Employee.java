package Task10;
//Create a class Employee
public class Employee {
	 int id; //global variable for id
	 String firstName,lastName; //variable declaration for firstname and lastname 
	 int salary; //variable declaration for salary
	 Employee(){
		 id=0;
		 firstName="";
		 lastName="";
		 salary=0;
		 
	 }
	
	 //Parameterized constructor with class name
	Employee(int id1,String FirstName,String LastName,int Salary){
		id=id1;
		firstName=FirstName;
		lastName=LastName;
		salary=Salary;
	}
	//Creating getter methods for the given attributes 
	
	public void setid(int id1) {
		id=id1;
	}
	public int getid() {
		return id;
	}
	public void setfirstName(String fname) {
		firstName=fname;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setlastName(String lname) {
		lastName=lname;
	}
	public String getlastName() {
		return lastName;
	}
	public String getName() {
		return firstName + " " + lastName;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int Salary) {
		salary=Salary;
	}
	//Annual salary= monthly salary *12
	 public int getAnnualsalary() {
		 return salary*12;
	 }
	 //raise salary method creation
	 public int raiseSalary(int percent) {
		 
	 int newSalary=salary*percent/100;
	 salary+=newSalary;
	 return salary;
	 }
	  public String toString() {
		  return "Employee ID :" + id +"\n "+"Name :"+ getName() +"\n "+ "AnnualSalary :"+getAnnualsalary()+"\n"+"Salary raise per month :"+salary;
	  }
	  
	  //Main class
	public static void main(String[] args) {
		//Object creation for default constructor
		Employee emp=new Employee();
		emp.setid(110);
		emp.setsalary(50000);
		emp.setfirstName("Aadhvik");
		emp.setlastName("Seyon");
		emp.getName();
		emp.raiseSalary(10);
		System.out.println(emp);
		
		//object for parameterized constructor
		Employee employee=new Employee(100,"Abinaya","Vignesh",60000);
		employee.raiseSalary(20);
		System.out.println(employee);
		
		//object for parameterized constructor with different parameters
		Employee employee1=new Employee(101,"aarav","vishakan",100000);
		employee.raiseSalary(30);
		System.out.println(employee1);

	}

}
/*Output:
 Employee ID :110
 Name :Aadhvik Seyon
 AnnualSalary :660000
Salary raise per month :55000
Employee ID :100
 Name :Abinaya Vignesh
 AnnualSalary :864000
Salary raise per month :72000
Employee ID :101
 Name :aarav vishakan
 AnnualSalary :1200000
Salary raise per month :100000

*/
