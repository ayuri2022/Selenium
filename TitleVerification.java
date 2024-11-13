package introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) {
		
		//ChromeDriver driver1 = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");    //Get URL
		
		System.out.println("Page Tile :" + driver.getTitle());    // check page title
		
		//check weather the ActualTitle Is Same As ExpectedTitle (As per BRS Document)
		
		String ActualTitle = driver.getTitle();                 // declare here ActualTitle Variable And Save In GetTitle() Method
		System.out.println("Actual Title : " +driver.getTitle());   //To Show ActualTitle On Console
		
		
		String ExpectedTitle  = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra\r\n"; //declare Here ActualTitle Variable 
		System.out.println("Expected Title : " +ExpectedTitle);      // To Show  ExpectedTitle On Console
		
		
		// check here ActualTitle is Equal/Same As ExpectedTitle By using if ---else statement and EqualsIgnoreCase method
		
		if(ActualTitle.equalsIgnoreCase("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"))
		{
			System.out.println("Test Case Is Passed");
		}
		else
		{
			System.out.println("Test Case Is Failed");
		}
			
		driver.close();
		
		
		

	}

}
