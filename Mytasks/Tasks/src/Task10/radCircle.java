package Task10;
//Create a class radCircle
public class radCircle {
	double radius,circumference;
	
	//Default Constructor
	radCircle(){
		radius=0.0;
		circumference=0.0;
	}
	
	//Parameterized Constructor
	radCircle(double rad){
		radius=rad;
	}
	
	//Creating getter and setter methods for the radius
	public void setradius(double rad) {
		radius=rad;
	}

	public double getradius() {
		return radius;
	}
	
	//Calculating the circumference using math function
	public double getcircumference() {
		circumference= 2*Math.PI*radius;
		return circumference;
	}
	public String toString() {
		return "Radius :" +  radius + "\n" + "Circumference:"+ getcircumference();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object creation for default constructor
		radCircle rad=new radCircle();
		rad.setradius(3.0);
		rad.getcircumference();
		System.out.println("The circumference of the circle is:"+"\n"+ rad);
		
		//object creation for parameterized constructor with different inputs
		radCircle rad1=new radCircle(5.0);
		System.out.println("The circumference of the circle is:"+"\n"+ rad1);
		
		radCircle rad2=new radCircle(9.0);
		System.out.println("The circumference of the circle is:"+"\n"+ rad2);
	}

}

/*
 Output:
The circumference of the circle is:
Radius :3.0
Circumference:18.84955592153876
The circumference of the circle is:
Radius :5.0
Circumference:31.41592653589793
The circumference of the circle is:
Radius :9.0
Circumference:56.548667764616276

*/