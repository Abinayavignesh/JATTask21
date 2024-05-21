package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WikipedieDemo {

	public static void main(String[] args) throws Exception {
		// Set the path to the ChromeDriver executable
				WebDriverManager.chromedriver().setup();
				
				// Create a new instance of the ChromeDriver
				WebDriver driver=new ChromeDriver();
				
				// Open www.demoblaze.com website
				driver.get("https://www.wikipedia.org/");
				
				//Command for window Fullscreen
				driver.manage().window().maximize();
				
				//Sleeps for 1 seconds
				Thread.sleep(1000);
				
				// Find the search input element and enter the search query
				driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence"+Keys.ENTER);
								
				//To click on history section
				//driver.findElement(By.xpath("//*[@id=\"History\"]")).click();
				driver.findElement(By.id("History")).click();
				Thread.sleep(2000);
				
				//to get the title
				String title=driver.getTitle();
				
				//To print the title
				System.out.println("The Title of the page is : "+ title);
				
				driver.close();
	}

}

/*OUTPUT
 * The Title of the page is : Artificial intelligence - Wikipedia
*/