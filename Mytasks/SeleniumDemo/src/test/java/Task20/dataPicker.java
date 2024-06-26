package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataPicker {

	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		WebDriverManager.chromedriver().setup();
		
		// Create a new instance of the ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		// Open www.demoblaze.com website
		driver.get("https://jqueryui.com/datepicker/");
		
		//Command for window Fullscreen
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		 // go to URL
		driver.get("https://jqueryui.com/");
		  
		 //click on datepicker
		driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();
		  
		 //switching focus to inside frame
		  WebElement stringFrame =driver.findElement(By.className("demo-frame"));
		  driver.switchTo().frame(stringFrame);
		  
		  //Click on Date 
		  WebElement dateField = driver.findElement(By.xpath("//input[@id='datepicker']"));
		  dateField.click();
		  
		  //Click on next month
		  WebElement nextmonth=driver.findElement(By.xpath("//a[contains(.,'Next')]/span[contains(.,'Next')]"));
		  nextmonth.click();
		  
		  
		  //Click on date 22 
		  WebElement date22 = driver.findElement(By.xpath("//a[@data-date='22']"));
		  date22.click();
		  
		  //printing the selected date by getting attribute
		  String selectedDate = dateField.getAttribute("value");
		  
		  System.out.println("The Selected Date is: "+ selectedDate);
		  
		 //Close the browser 
		  driver.quit();


		 }

	}


