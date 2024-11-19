package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uploading {

	public static void main(String[] args) throws Exception {

		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.ilovepdf.com/merge_pdf");
		 
		 driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		 
		Runtime.getRuntime().exec("E:\\autoit files\\file2.exe");
		 
		 
	   // driver.findElement(By.xpath("//a[@title='Add more files']")).click();
	    
	  Runtime.getRuntime().exec("E:\\autoit files\\file3.exe");

	}

}
