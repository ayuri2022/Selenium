package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();   //invoking Browser
		
		driver.manage().window().maximize();    // Manage Windows Resolution
		
		driver.get("https://www.myntra.com/");  // Get 1 URL 
		
		driver.get("https://www.flipkart.com/");     // Get 2 URL
		
		driver.navigate().back();               // Get Back On 1 URL
		
		Thread.sleep(5000);                      // Add Wait
		
		driver.navigate().forward();            // Go forward On 2 URL
		
		driver.get("https://www.amazon.com/");   //Get 3 URL
		
		 Thread.sleep(5000);                      //Add Wait
		 
		driver.navigate().refresh();             // Refresh on 3 URL

	}

}
