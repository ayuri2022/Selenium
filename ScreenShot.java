package introduction;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// Invoking Browser
		WebDriver driver = new ChromeDriver();
		
		//Launch URl AND Add Resolution
		
		driver.get("https://www.mycarhelpline.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;  // cast WebDriver to TakesScreenshot 
		
		File Screenshot = ts.getScreenshotAs(OutputType.FILE);        // full page sc
		
		File Location  = new File("E:\\screenShotfile.jpge"); // save file Location
		
		FileHandler.copy(Screenshot, Location);
		
		
		
		// for Specific part Screen Shot Script
		driver.findElement(By.xpath("//div[@class='header-addbox']"));
		
		WebElement ss = driver.findElement(By.xpath("//div[@class='header-addbox']"));
		
		File Screenshot2 = ss.getScreenshotAs(OutputType.FILE);
		
		File Location2 = new File("E:\\seleniumSC3.jpg");
		
		FileHandler.copy(Screenshot2, Location2);
		
		
		
		
		
		

	}

}
