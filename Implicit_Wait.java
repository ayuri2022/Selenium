package introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		// invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Add Resolution 
		driver.manage().window().maximize();
		
		// launch URL
		driver.get("https://m.rediff.com/");
		
		// Add implicit Wait
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //add action 
	 
	    driver.findElement(By.xpath("//a[@class='moneyicon relative']")).click();
	    
	   
	
	 

	}

}
