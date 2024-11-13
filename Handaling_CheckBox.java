package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handaling_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
	//Invoking Browser
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	//launching URL
		
		driver.get("https://www.letskodeit.com/practice");
	
    // Page Title Check
		
	    System.out.println("Page Title Is :-" + driver.getTitle());
   
	//Handle check Box Using x-path 1. create WebElement class object and save location of check box in it
	    
	    WebElement HondaCheck = driver.findElement(By.xpath("//input[@id=\"hondacheck\" and @value=\"honda\"]"));
	    
   //click on  Honda Check Box	 
	    
	    HondaCheck.click();
	    
  // check weather the check box is ticked or select
	    
	    System.out.println("Honda CheckBox Is Ticked :- "+ HondaCheck.isSelected());
	    
	    Thread.sleep(5000);
  // Select Another Check Box 
	   
	    WebElement BmwCheck = driver.findElement(By.xpath("//input[@id=\"bmwcheck\" and @value=\"bmw\"]"));
	    BmwCheck.click();
	    System.out.println("BMW CheckBox Is Ticked :-" +BmwCheck.isEnabled());  // isEnabled() Method is used for checking 
	    
	    Thread.sleep(5000);
 // select Next Check box
	    WebElement BenzCheck =driver.findElement(By.xpath("//input[@id=\"benzcheck\" and @value=\"benz\"]"));
	    BenzCheck.click();
	    System.out.println("BENZ CheckBox IS ticked :-" + BenzCheck.isSelected());
	    
		
	   
		

	}

}
