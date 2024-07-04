package Task21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framesMove {

	public static void main(String[] args) {		
			
	//setting Chrome driver Setup
	WebDriverManager.chromedriver().setup();
			
	//Launching firefox driver instance
	WebDriver driver=new ChromeDriver();
			
	//Navigate to the URL
	driver.get("http://the-internet.herokuapp.com/nested_frames");
			
	//Maximize the browser window
	driver.manage().window().maximize();
			
	//Calling implicit method
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	//Switch to Top frame
	WebElement topElement = driver.findElement(By.xpath("//frame[@name='frame-top']"));
	driver.switchTo().frame(topElement);

	//Verify that there are three frames on the page
	List<WebElement> frameCount=driver.findElements(By.tagName("frame"));
	if (frameCount.size()==3)
		System.out.println("Three frames are available on top frame");
	else
		System.out.println("Available frames are "+ frameCount);
		    
	//Switch to left frame
	WebElement Leftframe=driver.findElement(By.name("frame-left"));
	driver.switchTo().frame(Leftframe);
	System.out.println("Left Frame");
		  
	//Verify that left frame has the text "LEFT"
	WebElement leftFrameCheck=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
	if (leftFrameCheck.getText().equals("LEFT"))
		System.out.println("Yes....! It has text LEFT");
	else
		System.out.println("No....! It has no text LEFT");  
		  
	//Switch to top frame
	driver.switchTo().defaultContent();
	driver.switchTo().frame(topElement);
	System.out.println("Switched from left Frame to Top frame");
		   
	//Switch to middle frame 
	WebElement middleframe=driver.findElement(By.name("frame-middle"));
	driver.switchTo().frame(middleframe);
	System.out.println("Middle Frame");
		  
	//Verify that left frame has the text "MIDDLE"
	WebElement middleFrameCheck=driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]"));
	if (middleFrameCheck.getText().equals("MIDDLE"))
		System.out.println("Yes....! It has text MIDDLE");
	else
		System.out.println("No....! It has no text MIDDLE"); 
		  
	//Switch to top frame
	driver.switchTo().defaultContent();
	driver.switchTo().frame(topElement);
	System.out.println("Switched from middle Frame to Top frame");
		   
	//Switch to middle frame 
	WebElement rightframe=driver.findElement(By.name("frame-right"));
	driver.switchTo().frame(rightframe);
	System.out.println("Right Frame");
		  
	//Verify that left frame has the text "MIDDLE"
	WebElement rightFrameCheck=driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
	if (rightFrameCheck.getText().equals("RIGHT"))
		 System.out.println("Yes....! It has text RIGHT");
	else
		System.out.println("No....! It has no text RIGHT"); 
		  
	//Switch to top frame
	driver.switchTo().defaultContent();
	//driver.switchTo().frame(topElement);
	System.out.println("Switched from right Frame to Top frame");
	
	
    //Switch to bottom frame
    WebElement bottomFrameElement = driver.findElement(By.xpath("//frame[2]"));
    driver.switchTo().frame(bottomFrameElement);
    //d.switchTo().frame("frame-bottom");
    System.out.println("Switched to bottom Frame");

	  
	//Verify that left frame has the text "BOTTOM"
    WebElement bottomBodyFrameElement = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
    if (bottomBodyFrameElement.getText().equals("BOTTOM"))
     System.out.println("Yes....! Left frame has the text BOTTOM");
    else
     System.out.println("No.....! Left frame does not have the text BOTTOM");
   
		
    //Switch to top frame
    driver.switchTo().defaultContent();
    System.out.println("Switched from bottom Frame to top frame");
    
    //Switch back to the frame
    driver.switchTo().defaultContent();
    
    //Print the current URL in console for validation
    System.out.println(driver.getCurrentUrl());
    
    //Verify that page title is "Frames"
    String expectedresult="nested_frames";
	String actualresult=driver.getCurrentUrl();
	
	if(actualresult.contains(expectedresult))
		System.out.println("Yes!.... The current URL has Nested Frames");
	else
		System.out.println("No!.... The current URL has not Nested Frames");
    //Close the browser
	driver.close();
		
	}

}



/* OUTPUT
Three frames are available on top frame
Left Frame
Yes....! It has text LEFT
Switched from left Frame to Top frame
Middle Frame
Yes....! It has text MIDDLE
Switched from middle Frame to Top frame
Right Frame
Yes....! It has text RIGHT
Switched from right Frame to Top frame
Switched to bottom Frame
Yes....! Left frame has the text BOTTOM
Switched from bottom Frame to top frame
https://the-internet.herokuapp.com/nested_frames
Yes!.... The current URL has Nested Frames


*/
