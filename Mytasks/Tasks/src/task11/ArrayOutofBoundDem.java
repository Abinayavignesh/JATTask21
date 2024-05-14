package task11;

public class ArrayOutofBoundDem {

	public static void main(String[] args) {
		// declaring and initializing an array of length 4
        int[] x = { 1, 2, 3, 4 };
 
        // accessing the element at 0 index
        System.out.println(x[0]);
 
        // accessing an index which is greater than the
        // length of array
        System.out.println(x[10]);
 
        // accessing a negative index
        System.out.println(x[-1]);

	}

}
