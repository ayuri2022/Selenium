package introduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDrag_Drop {

	public static void main(String[] args) {
//Invoking Browser
		WebDriver driver = new ChromeDriver();
		
// Add Window Resolution
		driver.manage().window().maximize();

// Launching URl
		driver.get("https://jqueryui.com/droppable/");
		
// Switch TO Frame
		driver.switchTo().frame(0);
		
// perform Drag And Drop Using Actions Class object
// Create Action class object and Give Argument who perform action
		Actions act = new Actions(driver);

//Drag The Element using object 1. ClickAndHold Element 
		//2.move Element to drop
		//3.release hold element on drop
		//4.then build all step
		//5 perform  build action 
		// pause for wait in actions class
	
		
		act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
		.pause(Duration.ofSeconds(5))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
		.release()
		.build()
		.perform();



	}

}
