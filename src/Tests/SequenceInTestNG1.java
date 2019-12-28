package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SequenceInTestNG1 {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("I am before suite");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am beforeClass");
		
		//Driver
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("I am before method");
		//launch url homepage
	}
	
	@Test
	public void testcase1() {
		System.out.println("TestCase 1");
	}
	
	
	@Test
	public void testcase2() {
		System.out.println("TestCase 2");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("I am after method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am after class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am afterTest");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("I am after suite");
	}
	
	//STC M @Test

}
