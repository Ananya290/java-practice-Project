package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethod {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver(); // open the browser
			
			
		   
		     driver.get("https://www.selenium.dev/");
		     
		    
		     
		     String title = driver.getTitle();
		     System.out.println("The title of the page is : " + title);
		     
		     String url = driver.getCurrentUrl();
		     
		     System.out.println("The URL of the page is : " + url);
			
			// close the browser window
		     
		     driver.close();
		     
		     
			
			}

	}


