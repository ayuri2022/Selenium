package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
	
		
		//ChromeDriver driver = new ChromeDriver();    //ChromeDriver 
		
		WebDriver driver = new ChromeDriver();           //invoking browser
		driver.manage().window().maximize();            // manage Windows Resolution
		
		
		driver.get("https://www.myntra.com/");           // Get URL
		
	  
		
		System.out.println("Page Tilte Is : "+driver.getTitle()); // Get Page Title And Write MSG On Console
		
     
		System.out.println("Current URL Is : " + driver.getCurrentUrl()  ); //checking current running URL Correct or not
		
	    driver.close();                                                        // close window
		
		
		
		
		
		
		
		
		
		

	}

}
