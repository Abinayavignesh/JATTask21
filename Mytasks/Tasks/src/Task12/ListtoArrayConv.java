package Task12;

import java.util.ArrayList;
import java.util.List;

public class ListtoArrayConv {

	public static void main(String[] args) {
		//Creating Array List of type String
		//Declaring Object for List
		List<String> name=new ArrayList<String>();
		//using add method adding custom element to ArrayList
		name.add("Aarav");
		name.add("Aadhvik");
		name.add("Visakan");
		name.add("Seyon");
		name.add("Latha");
		name.add("Parthi");
		name.add("Vicky");
		//Printing the elements from List
		System.out.println(name);
		//Storing the elements inside array of Strings
		String[] nameArray=new String[name.size()];
		//Converting ArrayList to array
		for(int i=0;i<name.size();i++) {
			nameArray[i]=name.get(i);
		}
		System.out.println();
		System.out.println("After Converting List to Array");
		//Printing all elements of the array
		for(String na:nameArray) {
			System.out.println(na);
		}
		

	}

}
