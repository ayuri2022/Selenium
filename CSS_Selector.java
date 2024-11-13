package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		//Invoking Browser
	//	ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
   // launching Browser
		driver.get("https://www.letskodeit.com/practice");
   // page title and current URl	
		System.out.println("Page Title: " +driver.getTitle());
		System.out.println("Current Page URL : "+driver.getCurrentUrl());

  // Create select class object and store value in it using CSS selector
		
		Select DropDown =new Select(driver.findElement(By.cssSelector("select#carselect")));
		
  // select DropDown with index values like 0,1,2,...used selectByIndex() method
		
		DropDown.selectByIndex(0);
		Thread.sleep(5000);
		
 // select DropDown With Values Use selectByValue() method
		
		DropDown.selectByValue("benz");
		Thread.sleep(5000);
		
 //select DropDown using selectByVisibeletext() method 		
		DropDown.selectByVisibleText("Honda");

	

}
}
