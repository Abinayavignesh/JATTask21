package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeDemo {

	public static void main(String[] args) throws Exception {
		
		// Set the path to the ChromeDriver executable
		WebDriverManager.chromedriver().setup();
		
		// Create a new instance of the ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		// Open www.demoblaze.com website
		driver.get("https://www.demoblaze.com/");
		
		//Command for window Fullscreen
		driver.manage().window().maximize();
		
		//to get the title
		String title=driver.getTitle();
		
		//To print the title
		System.out.println("The Title of the page is : "+ title);
		
		//To check whether the Page is landed correctly
		if(title.equals("STORE")) {
			System.out.println("Page Landed on Correct Website!");
		}else {
			System.out.println("Page not Landed on Correct Website!");
		}
		//Sleeps for 3 seconds
		Thread.sleep(3000);
		
		//Close the window
		driver.close();
	}

}

/*OUTPUT
 * The Title of the page is : STORE
Page Landed on Correct Website!
*/
