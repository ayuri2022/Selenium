package introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		// invoking Browser
		
		WebDriver driver = new ChromeDriver();
		
		//Launch URL
		
		driver.get("https://m.rediff.com/");
		
		// Add Resolution
		driver.manage().window().maximize();
		
		//Add Explicitly  Wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Condition
		
	 WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='moneyicon relative']")));
	 element.click();
				
		
		
		

	}

}
