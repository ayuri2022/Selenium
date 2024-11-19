package introduction;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handaling_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
//Invoking browser
		WebDriver driver = new ChromeDriver();
		
//Add windows resolution
		driver.manage().window().maximize();
	
//Launching URL 
		driver.get("https://www.google.com/");
		
//Active Search box and add input 
	    driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
//Add Explicit Wait
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-attrid='AutocompletePrediction']")));
		
//Adding list 
		List<WebElement>SearchList =driver.findElements(By.xpath("//li[@data-attrid='AutocompletePrediction']"));
		
//calculate List Size
		System.out.println("Size of List :-" + SearchList.size());
		
//Print Auto Suggestion
	  for(WebElement SearchName:SearchList)
	  {
		  
		 String SearchValue = SearchName.getText();
		  
		 System.out.println(SearchValue);
		  
		  Thread.sleep(2000);
		  
	  }
	
		
		
	}

}