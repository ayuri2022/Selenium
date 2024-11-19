package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

public class KeyBoard_Func_handaling {

	public static void main(String[] args)  {
		
	//invoking URL
		
	//	ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
   //Launching Browser
		driver.get("https://www.instagram.com/#");
		
  // ADD Resolution
		driver.manage().window().maximize();

  // Start Input Tab 
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).click();
		
       
   
   // Keyboard function
        Actions act = new Actions(driver);
        
     // keyboard Function action
        act.sendKeys(Keys.TAB);
       
       
     // Add Pause or wait
        act.pause(Duration.ofSeconds(5));
        
        act.sendKeys(Keys.TAB);
     
        act.pause(Duration.ofSeconds(5));
        
        act.sendKeys(Keys.TAB);
      
		
		act.sendKeys(Keys.ENTER);
	
	 // Build Actions And Perform Build
		act.build().perform();

	}

}
