package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handaling_radioButton {

	public static void main(String[] args) throws InterruptedException {
		
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();          //Invoking Browser
	    
		driver.manage().window().maximize();            // Manage Windows Resolution
		
		driver.get("https://www.letskodeit.com/practice");       // Launch URL
		
		System.out.println("Title Page :" + driver.getTitle());  // Get Title Page
		
		// saving Location of radio button in WEBELEMENT Class Object (Bmwradio) using X-path 
		
	    WebElement Bmwradio = driver.findElement(By.xpath("//input[@id=\"bmwradio\"]")); 
	    
	    // Select Radio Button using Click() Method
		Bmwradio.click();
		
		// Check Weather Button is Select using isSelect () Method  it gives answer. on console in true/false
		System.out.println("Bmw Radio Button is Selected :-" + Bmwradio.isSelected());
		
		Thread.sleep(5000);
		//Select Next Radio Button
		
		WebElement Hondaradio = driver.findElement(By.xpath("//input[@id=\"hondaradio\"]"));
		
		Hondaradio.click();
		
		System.out.println("Honda Radio Button Is Selected :-" +Hondaradio.isSelected());
		
		 Thread.sleep(5000);
		 
		// Select Next Radio Button
		
		WebElement Benzradio = driver.findElement(By.xpath("//input[@id=\"benzradio\"]"));
		
		Benzradio.click();
		
		System.out.println("Benz Radio Button Is Selected :-" + Benzradio.isSelected());
		
		
        
	}

}
