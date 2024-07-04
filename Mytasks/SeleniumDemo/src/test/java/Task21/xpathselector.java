package Task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathselector {

	public static void main(String[] args) {
	//setting Chrome driver Setup
	WebDriverManager.chromedriver().setup();
				
	//Launching firefox driver instance
	WebDriver driver=new ChromeDriver();
				
    //Navigate to the URL
	driver.get("https://the-internet.herokuapp.com/iframe");
				
	//Maximize the browser window
	driver.manage().window().maximize();
				
	//Calling implicit method
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
	//Switch to IFRAME
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
				
   //Locate the area and write the content "Hello People!"
	WebElement text=driver.findElement(By.xpath("//p"));
	text.clear();
	text.sendKeys("Hello People!");
				
	//Close the browser
	driver.close();
				
	}

}


/* OUTPUT
TinyMCE is in read-only mode because you have no more editor loads available this month.
Please request that the admin to upgrade your plan or add a valid payment method for additional editor load charges. 

*/