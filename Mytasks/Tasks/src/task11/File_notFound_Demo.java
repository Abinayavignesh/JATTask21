// import required classes and packages  
package task11;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//create FileNotFoundExceptionExample1 to understand the first point. 
public class File_notFound_Demo {

	public static void main(String[] args) {
		
		 try { 
			// creating an instance of the FileReader class  
		        File file = new File("E://file.txt"); 

		        // create an instance of the FileReader and pass the File instance to it.  
		        FileReader fr = new FileReader(file); 
		        
		        // If there is any  exception in the try block
		        // then catch will handle the exception
            } catch (FileNotFoundException e) { 
            	// Message printed after catching the exception
           System.out.println("File does not exist"); 
        } 
	}

}
