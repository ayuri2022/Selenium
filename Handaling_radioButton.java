package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handaling_radioButton {

	public static void main(String[] args) {
		
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();          //Invoking Browser
	    
		driver.manage().window().maximize();            // Manage Windows Resolution
		
		driver.get("https://www.letskodeit.com");
		
		System.out.println("Title Page :" + driver.getTitle());
		
		
		
		
		

	}

}
