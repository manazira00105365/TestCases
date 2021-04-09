package PhantomjsTests.PhantomjsTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnitTestOne {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:3000/");
		String title = driver.getTitle();
		System.out.println("Title of the page is: " +title);
		
		
		
		
			try {
				driver.findElement(By.id("chn")).sendKeys("Joey");
				System.out.println("Card Holder Name Entered");
			} catch (Exception e) {
                            System.out.println("Error Found");
			}

	}

}
