package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://@the-internet.herokuapp.com/basic_auth");
		
		//driver.get("https:admin:admin//@the-internet.herokuapp.com/basic_auth");
	

	}

}
