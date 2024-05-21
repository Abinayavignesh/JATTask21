package seleniumjava;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class FirefoxLoginDemo {

	public static void main(String[] args) throws Exception {
		
		//setting Chrome driver Setup
		WebDriverManager.firefoxdriver().setup();
		
		//Launching chrome driver instance
		WebDriver driver=new FirefoxDriver();
		
		//Used to launch a URL
		driver.get("https://www.google.com/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//To print the title of the page
		System.out.println(driver.getTitle());
		
		//To print the URL of the current page
		System.out.println(driver.getCurrentUrl());
		
		//Sleeps for 2 seconds
		Thread.sleep(2000);
		
		//To reload or refresh the page
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		//Close the window
		driver.close();
			
		

	}

}
