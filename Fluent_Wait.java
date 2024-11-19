package introduction;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait {

	public static void main(String[] args) {
		// Invoking Browser
		
		WebDriver driver = new ChromeDriver();
		
		//Launch URl & Add Window Resolution
		driver.get("https://m.rediff.com/");
		driver.manage().window().maximize();
		
		// Add Fluent Wait
		
		Wait <WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		
		//condition
		System.out.println("start Date And Time :" + new Date());
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='rediffGURUS']")));
		element.click();
		
		System.out.println("End Date And Time :" +new Date());
		
	
		
		
		

	}

}
