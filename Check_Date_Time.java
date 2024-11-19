package introduction;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Date_Time {

	public static void main(String[] args) {
		//invoke Browser
		WebDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("https://m.rediff.com/");
		
		//Add Resolution For Window
		driver.manage().window().maximize();
		
		// Add Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// check Start Date and Time
		System.out.println("Start Time And Date:"+new Date());
		
		// Perform Task
		
		driver.findElement(By.xpath("//a[@class='eproicon relative']")).click();
		
		//Check End Date And Time
		
		System.out.println("End time And Date : " + new Date());
		
		// Check page title And Current URL
		
		System.out.println("Page Title :" + driver.getTitle());
		System.out.println("Current Page URL:" +driver.getCurrentUrl());
		
		

	}

}