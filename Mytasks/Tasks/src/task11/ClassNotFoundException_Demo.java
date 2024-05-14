package task11;

public class ClassNotFoundException_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{ 
            Class.forName("Class1");   // Class1 is not defined 
        } 
        catch(ClassNotFoundException e){ 
            System.out.println(e); 
            System.out.println("Class Not Found..."); 
        } 
	}

}
