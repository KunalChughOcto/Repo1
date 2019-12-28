package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequence {
   
	@BeforeSuite
	public void Beforesuit(){
    	System.out.println("I am Before suite");
    }
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("I am Before Test");
	}
	
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("I am before Class");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("I am Before Method");
	}
	
	
	@Test
	public void Testcase1(){
		System.out.println("I am Test Case 1");
	}
	
	
	@Test
	public void Testcase2() {
		System.out.println("I am Test Case 2");
	}
	
	@Test
	public void Testcase3() {
		System.out.println("I am Test Case 3");
	}

    @AfterMethod
    public void AfterMethod() {
    	System.out.println("I am After Method");
    }
    	
    	
    @AfterClass
    public void AfterClass() {
    	System.out.println("I am After Class");
    }
    
    @AfterSuite
    public void AfterSuite() {
    	System.out.println("I am after suite");
    }
   public void print() {
	   System.out.println("git change");
   }
}
    
	


