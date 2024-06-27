package Task18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newAccountFB {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		//Launching chrome driver instance
		WebDriver driver=new ChromeDriver();
		
		//Used to launch a URL. open URL of application using get method
		driver.get("https://www.facebook.com/");
		
		//manage() method to maximize the window
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println("Checking Home Page");
		WebElement signIn=driver.findElement(By.xpath("//div[@class='_8esk']"));
		//isDisplayed() method returns boolean value either True or False
		System.out.println("Website has been redirected to the FaceBook Homepage: " + signIn.isDisplayed());
		
		//Declare and initialise a Explicit wait,also specify the timouts of the wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
				
		//Using ID locator with the Explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create new account"))).click();
		System.out.println("Creating New Account");
		//driver.findElement(By.linkText("Create new account")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("latha");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname"))).sendKeys("parthi");
		
		//Passing value as "abi91it@gmail.com" in the email field
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email__"))).sendKeys("latha@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email_confirmation__"))).sendKeys("latha@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_passwd__"))).sendKeys("latha1234@");
		
		
		WebElement date=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthday_day")));
		Select dat=new Select(date);
		//select by text
		dat.selectByVisibleText("11");
		Thread.sleep(3000);
		
		WebElement month=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthday_month")));
		Select mon=new Select(month);
		//select by text
		mon.selectByVisibleText("May");
		Thread.sleep(3000);
		
		WebElement year=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthday_year")));
		Select yr=new Select(year);
		//select by text
		yr.selectByVisibleText("1985");
		Thread.sleep(3000);
		
		// Select the FeMale Radio Button
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);
		//To click on the Signup
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		// checking whether the account is successfully registered or not
		String expected="Facebook – log in or sign up";
		String actual=driver.getTitle();
		System.out.println(actual);
		if(expected.equalsIgnoreCase(actual)) {
			System.out.println("The user is successfully registered");
		}
		else {
			System.out.println("The user is not successfully registered");
		}
		
	}

}

/* OUTPUT
Checking Home Page
Website has been redirected to the FaceBook Homepage: true
Creating New Account
Facebook – log in or sign up
The user is successfully registered
*/