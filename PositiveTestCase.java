package PhantomjsTests.PhantomjsTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



//Positive E2E Test

public class PositiveTestCase {

	public static void main(String[] args) {

		
		
        
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:3000/");
		String title = driver.getTitle();
		System.out.println("Title of the page is: " +title);
		
		
		
		
		try {
			driver.findElement(By.id("chn")).sendKeys("Joey");
			System.out.println("Card Holder Name Entered");

			driver.findElementById("ccn").sendKeys("1234567");
			System.out.println("Credit Card Number Entered");
			
			driver.findElementById("cct").sendKeys("visa");
			System.out.println("Credit Card Type Entered");
			
			driver.findElementById("ed").sendKeys("10/5/2025");
			System.out.println("Expiration Date Entered");
			
			driver.findElementById("sc").sendKeys("098");
			System.out.println("Security Code Entered");
			
			driver.findElementById("zc").sendKeys("A1B2C3");
			System.out.println("Zip Code Entered");
		} 
		
		catch (Exception e) {
			System.out.println("Error in entering values");
			}
		
		driver.findElement(By.className("submit")).click();
		System.out.println("Clicked on Submit");
		
		driver.quit();
	
		
	}

}