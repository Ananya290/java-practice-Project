package seleniumbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//driver.findElement(By.xpath("//input[@type ='submit']")).click();
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(1500);
		
		Alert a = driver.switchTo().alert();

		String alertText= a.getText();
		System.out.println(alertText);
		
		a.accept(); 
		
        driver.findElement(By.id("login1")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("admin");
		
		
		
	}

}


/*
//We will not make driver object to switch from main window of app to alert window
// once we switch to alert we will use Alert class object to perform actions on the alert
		// we can perform 3 actions on the alert : getText, send keys, press ok or cancel button
		*/
