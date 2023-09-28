package seleniumbasic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktestdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(1500); // wait for 1.5 seconds
		
				
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		
		
		driver.findElement(By.id("wpPassword1")).sendKeys("admin@123");
		
				
		driver.findElement(By.id("wpRemember")).click();
		
		Thread.sleep(1500);
		
		// Find locator of button and click on it
		
		driver.findElement(By.id("wpLoginAttempt")).click();
		
		Thread.sleep(1500);
		// Similar to link text we have one more locator called PartialLinktext locator
		// the value for this is partial text of the link
		// locator will still be able to find the element and click on it
		
		// Click on the new link on top with text as Create account link, it will redirect you to new page
		
		driver.findElement(By.partialLinkText("account")).click();

		
		

	}

}
