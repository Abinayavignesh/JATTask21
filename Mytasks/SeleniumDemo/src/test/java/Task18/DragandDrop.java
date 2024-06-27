package Task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		
		WebElement dragbox=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppedbox=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		//Creating object for Action class
		Actions actions=new Actions(driver);
		
		// performing drag and drop operation
		actions.dragAndDrop(dragbox, droppedbox).build().perform();
		
		//Validating the Text
		String ExpectedText="Dropped!";
		
		//Getting the text with locator and getText() mthod
		String actualText=driver.findElement(By.id("droppable")).getText();
		System.out.println(actualText);
		
		//Validating the text 
		if(actualText.equals(ExpectedText)) 
			System.out.println("Yes....! Its Dropped");
		else 
			System.out.println("No....! Its not Dropped");
		
		//Creating a variable for actualcolor
		String actualColor="#fffa90";
		
		//Verify the color property of the target element's CSS
        String targetColor = droppedbox.getCssValue("background-color");
        
        //creating a object for color class.
        //convert rgb color to hex method where i have passed the rgb and converting and storing in the string for validation
        String ActualResult=Color.fromString(targetColor).asHex();
        
		//Printing the actual color
		System.out.println(ActualResult);
		
		//Validating the background Color
        if (ActualResult.equals(actualColor)) {
            System.out.println("Yessssssss it's successful.Target element has changed color.");
        } else {
            System.out.println("oooohhhhhh it's failed.Target element color not changed.");
        }
	}
}


/* OUTPUT
Dropped!
Yes....! Its Dropped
#fffa90
Yessssssss it's successful.Target element has changed color.
*/
