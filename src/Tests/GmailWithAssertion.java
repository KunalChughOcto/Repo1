package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailWithAssertion {
	
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://www.gmail.com";
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));   // FINDS EMAIL TEXT BOX ELEMENT
    	email.sendKeys("kunalchugh282@gmail.com");			// ENTERS INPUT EMAIL
		
    	WebElement next = driver.findElement(By.id("identifierNext"));   // FINDS ELEMENT NEXT  BUTTON
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    	next.click();
    	
    	driver.findElement(By.name("password")).sendKeys("RadheRadhe123");
    	
    	driver.findElement(By.id("passwordNext")).click();
    	
//    	Assert.assertEquals(actual, expected);
//    	Assert.assertTrue(condition);
//    	Assert.assertFalse(condition);
    	
    	Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Compose']")).isDisplayed());
    	System.out.println(driver.findElement(By.xpath("//a[contains(@href, 'Sign')]")).getAttribute("aria-label"));
    	
    	Assert.assertTrue(driver.findElement(By.xpath("//a[contains(@href, 'Sign')]")).getAttribute("aria-label").contains("kunalchugh282@gmail.com"));
    	
	}

}
