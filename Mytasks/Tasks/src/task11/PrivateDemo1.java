package task11;

import classtask.ProtectedAMDemo;

public class PrivateDemo1 extends ProtectedAMDemo {

	public static void main(String[] args) {
		PrivateDemo1 obj = new PrivateDemo1();//Compile Time Error  
		   obj.msg();

	}

}
