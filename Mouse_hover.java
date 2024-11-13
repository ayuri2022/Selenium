package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
   //invoking Browser
		
		 WebDriver driver = new ChromeDriver();
  // Add Windows Resolution 
		 
		 driver.manage().window().maximize();
		 
  // Launching URL
		 
		 driver.get("https://www.facebook.com/");
		 
 //  check Page Title and current URL
		 
		 System.out.println("Page Title :-" +driver.getTitle());
		 System.out.println("Current URL :-  " +driver.getCurrentUrl());
		 
 // Enter User name 
		 
		 driver.findElement(By.name("email")).sendKeys("Admin");
		 
// Enter Password	
		 
		 driver.findElement(By.name("pass")).sendKeys("Admin@123");
	
// click on login	
		 
		 driver.findElement(By.name("login")).click();
		 
		 Thread.sleep(5000);
//By using mouse Hover handle Forgotten  password
		 
// create Actions Class object and 
		 
		Actions act = new Actions(driver);
		
// call 
		
		act.moveToElement(driver.findElement(By.linkText("Forgotten password?")));
		
		 act.perform();
		 
		driver.close();
		
   
    
	}

}
