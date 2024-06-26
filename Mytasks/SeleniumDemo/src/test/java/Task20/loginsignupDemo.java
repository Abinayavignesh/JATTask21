package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginsignupDemo {

	public static void main(String[] args) throws Exception {
		
		// Set the path to the ChromeDriver executable
		WebDriverManager.chromedriver().setup();
		
		// Create a new instance of the ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		// Open guvi.in website
		driver.navigate().to("https://www.guvi.in/");
		
		//Command for window Fullscreen
		driver.manage().window().maximize();
		
		//Print the title of the page in console
		System.out.println(driver.getTitle());
		
		
		 //Click on SIGNUP button
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    //Enter the First name 
		driver.findElement(By.id("name")).sendKeys("Abinaya");

	    //Enter the Email
		driver.findElement(By.id("email")).sendKeys("abiaarav1720@gmail.com");

	    //Enter the Password
		driver.findElement(By.id("password")).sendKeys("abivicky@123");
		
	    //Enter the Mobile number
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
		
	    //click on sign-up
		driver.findElement(By.id("signup-btn")).click();
	    Thread.sleep(2000);
	          
	   System.out.println(driver.getTitle()); 
	   	
	 	
	 	//Tell us about yourself page info updating,Your current Profile
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	 	Select profile = new Select(driver.findElement(By.id("profileDrpDwn")));  
	 	profile.selectByVisibleText("Student");
	 		
	 	//Your Degree
	 	Select degree=new Select(driver.findElement(By.id("degreeDrpDwn"))); 
	 	degree.selectByVisibleText("B.E. / B.Tech. Computer Science");
	 		
	 	//Year of passing
	 	driver.findElement(By.id("year")).sendKeys("2022");
	 		
	 	//click submit button
	 	driver.findElement(By.id("details-btn")).click(); 
	   
	    //Verify that the user is successfully registered 
	   
	   String actualSignin= driver.getTitle();
	   String ExpectedSignin="GUVI | Sign Up";
	    if (actualSignin.equals(ExpectedSignin)) 
	     System.out.println("User is successfully registered");
	    else 
	     System.out.println("User is not successfully registered");
	     
	    //Navigating URL to the homepage for Login
	    driver.navigate().to("https://www.guvi.in/");
	    
	    //Providing the implicit time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	    //Click on login button 
	    driver.findElement(By.id("login-btn")).click();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    //Enter the Email address 
	    driver.findElement(By.id("email")).sendKeys("abiaarav1720@gmail.com");

	    //Enter the Password 
	    driver.findElement(By.id("password")).sendKeys("abivicky@123");

	    //Click on login button 
	    driver.findElement(By.xpath("//a[@id='login-btn']")).click();
	  	    
	    //Verifying whether the user is logged in successfully
	    System.out.println(driver.getTitle());
	    String expectedLogin="Login";
	    String actualLogin=driver.getTitle();
	    
	    if (actualLogin.contains(expectedLogin))
	     System.out.println("User is Logged in  successfully");
	    else
	     System.out.println("User is not Logged in successfully");

	    //Close the Browser
	    driver.close();

	 }
}

/* Output
GUVI | Learn to code in your native language
GUVI | Sign Up
User is successfully registered
GUVI | Login
User is Logged in  successfully */