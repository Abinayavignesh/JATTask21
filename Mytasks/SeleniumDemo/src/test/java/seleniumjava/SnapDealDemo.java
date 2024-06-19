package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealDemo {

	public static void main(String[] args) throws Exception {
		//setting Chrome driver Setup
				WebDriverManager.chromedriver().setup();
				
				//Launching chrome driver instance
				WebDriver driver=new ChromeDriver();
				
				//Used to launch a URL
				driver.get("http://www.snapdeal.com");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//To click the signin button
				driver.findElement(By.xpath("//div[@class='accountInner']")).click();
				
				//To click the Login button
				driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
				Thread.sleep(2000);
				
				//Switching to the page to frames
				driver.switchTo().frame("loginIframe");
				Thread.sleep(2000);
				
				//Entering the username or mobile to login
				WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
				username.sendKeys("abi91it@gmail.com" + Keys.ENTER);
				
				//You will be redirected to the OTP Page, this thread.sleep with slowdown the process. As the OTP is randomly genererated numeric value.
				//so we need to type the OTP manually. 
				Thread.sleep(30000);
				//It will click continue button
				driver.findElement(By.xpath("//button[@id='loginUsingOtp']")).click();
				
				//We provide the variable expected for the conditions checking
				String expected="Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items";
				// We get the title of the current page
				String actual=driver.getTitle();
				//checks the condition whether the expected and actual are equal. 
				//If true, logged in successfully message will be displayed in the console
				
				if(expected.equals(actual)) {
					System.out.println("Welcome.....!You have logged in Successfully");
				}
				else {
					System.out.println("Sorry....!You have not logged in Successfully");
				}

	}

}

/*OUTPUT
 Welcome.....!You have logged in Successfully
*/