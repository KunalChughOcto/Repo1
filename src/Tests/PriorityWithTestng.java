package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityWithTestng {
	
	WebDriver driver;
	
	@Test
	   public void OpenBrowser() {
		driver = new ChromeDriver();
		}
	
	@Test
	    public void OpenGoogle() { 
		    driver.get("https://www.google.com");
	}

}
