package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.AddCustomerPage;
import pages.LoginPage;

import utility.BaseClass;

public class AddCustTestCases extends BaseClass {
  
	@Test
	void AddCustomer() throws InterruptedException
	{
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LoginPage login  = new LoginPage(driver);
		login.setUserName("mngr486054");
		login.setPassword("Riyansh@12");
	    login.clickButton(); 
	    
	    
	    AddCustomerPage ac = new AddCustomerPage(driver);
	     ac.AddCust();
	   // Log.info(login);
	    
	    ac.setDate("2023-12-12");
	    ac.setCustName("RohiSantu");
	    ac.selectGender();
	    ac.setAddr("jalgoun");
	    ac.setCity("dhule");
	    ac.setState("maharashtra");
	    ac.setPin("234567");
	    ac.setMobNo("9088");
	    ac.setEmail("rohini531@gmail.com"); 
	    ac.setPassword("Riyansh@12");
	    ac.submit();
	    ac.testAssertFunction();
	   // ac.Logout();

	    
	}

}
