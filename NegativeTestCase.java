package PhantomjsTests.PhantomjsTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



//Negative E2E Test

public class NegativeTestCase {

	public static void main(String[] args) {

		
		
        
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:3000/");
		String title = driver.getTitle();
		System.out.println("Title of the page is: " +title);
		
		
		
		
	
			driver.findElement(By.id("chn")).sendKeys("Joey");
			System.out.println("Card Holder Name Entered");
			
			
			

			try {
				driver.findElementById("ccn").sendKeys("abc!!");
				System.out.println("Credit Card Number Entered");
			} 
			catch (Exception e) 
			{
				System.out.println("**Entered alpabhets or special characters in Credit Card field**");
			}
			
			driver.findElementById("cct").sendKeys("visa");
			System.out.println("Credit Card Type Entered");
			
			driver.findElementById("ed").sendKeys("10/5/2025");
			System.out.println("Expiration Date Entered");
			
			driver.findElementById("sc").sendKeys("098");
			System.out.println("Security Code Entered");
			
			driver.findElementById("zc").sendKeys("A1B2C3");
			System.out.println("Zip Code Entered");
		
		

		
		driver.findElement(By.className("submit")).click();
		System.out.println("Clicked on Submit");
		
		driver.quit();
	
		
	}

}