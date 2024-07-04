package Task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyOriginalWindow {

	public static void main(String[] args) {
		//setting Chrome driver Setup
		WebDriverManager.chromedriver().setup();
		
		//Launching firefox driver instance
		WebDriver driver=new ChromeDriver();
		
		 //Navigate to the URL
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Calling implicit method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 //Click on "CLICKHERE" link 
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		//Switch to main window
		  String mainwindow=driver.getWindowHandle();
		  System.out.println(mainwindow);
		  
		 //Switch to Child window
	     for(String windowHandle:driver.getWindowHandles()) {
	      System.out.println(windowHandle);
	      driver.switchTo().window(windowHandle);
	     }
		
		//Get the title of new window
	    String expected="New Window";
		String actualResult=driver.getTitle();
		
		if(actualResult.equals(expected))
			System.out.println("New window is present in the Page");
		else
			System.out.println("No!....New window is not present in the Page");
		
		//Close the new window
		driver.close();
		
		//Validate the original window is present
		driver.switchTo().window(mainwindow);
		
		//Validating the original window 
		String oldexpected="The Internet";
		String oldactual=driver.getTitle();
		
		if(oldactual.equals(oldexpected))
			System.out.println("Original window is present in the Page");
		else
			System.out.println("No!....Original window is not present in the Page");
		
		//Close the browser instance
		driver.close();
	}

}

/* OUTPUT
E79EFB44249AC9C8FBD899CD2C9A3078
E79EFB44249AC9C8FBD899CD2C9A3078
BFE3D7458A323CE969180477C874676B
New window is present in the Page
Original window is present in the Page
*/
