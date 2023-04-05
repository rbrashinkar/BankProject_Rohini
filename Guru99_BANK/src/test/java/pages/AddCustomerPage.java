package pages;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddCustomerPage {
	WebDriver ldriver;
	  
	 public AddCustomerPage(WebDriver driver)
	 {
		 ldriver= driver;
			PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath = "//a[normalize-space()='New Customer']")
	 WebElement newcustomerElement;
	 
	 @FindBy(xpath = "//input[@name='name']")
	 WebElement cnameElement;
	 
	 @FindBy(xpath = "//input[@value='f']")
	 WebElement fElement;
	 
	 @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
	 WebElement datElement;
	 
	 @FindBy(id = "dob")
	 WebElement datElement2;
	 
	 @FindBy(xpath ="//textarea[@name='addr']")
	 WebElement addrElement;
	 
	 @FindBy(xpath = "//input[@name='city']")
	 WebElement cityElement;
	 
	 @FindBy(xpath = "//input[@name='state']")
	 WebElement statElement;
	 
	 @FindBy(xpath = "//input[@name='pinno']")
	 WebElement pinElement;
	 
	 @FindBy(xpath = "//input[@name='telephoneno']")
	 WebElement mobElement;
	 
	 @FindBy(xpath = "//input[@name='emailid']")
	 WebElement emailElement;
	 
	 @FindBy(xpath = "//input[@name='password']")
	 WebElement passElement;
	 
	 @FindBy(xpath ="//input[@name='sub']")
	 WebElement submitElement;
	 
	 @FindBy(xpath = "//p[@class='heading3']")
	 WebElement msgElement;
	 
	 @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	 WebElement logoutElement;
	 
	 @FindBy(xpath = "//p[@class='heading3']")
	 WebElement expectedElement;
	 
	 public void testAssertFunction()
	 {
		 String actualString="Customer Registered Successfully!!!";
		 String expectString=expectedElement.getText();
		 System.out.println(expectString);
		 Assert.assertEquals(expectString, actualString);
	 }
			 
	public void AddCust()
	{
		newcustomerElement.click();
	}
	public void setCustName(String name)
	 {
		 cnameElement.sendKeys(name);
	 }
	 
	public void selectGender()
	 {
		 fElement.click();
	 }
	public void setDate(String date) throws InterruptedException
	 {
		
		 Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) ldriver;
			js.executeScript("window.scrollTo(0,78.66666412353516)");
		
		Actions actions = new Actions(ldriver);
		
		actions.doubleClick(datElement).build().perform();
		 
	    Thread.sleep(3000);
		datElement2.click();
		datElement2.sendKeys(date);
		// datElement.sendKeys(Keys.TAB);
	 }
	public void setAddr(String addr)
	 {
		 addrElement.sendKeys(addr);
	 }
	public void setCity(String city)
	 {
		 cityElement.sendKeys(city);
	 }
	public void setState(String state)
	 {
		 statElement.sendKeys(state);
	 }
	 
	public void setPin(String pin)
	 {
		 pinElement.sendKeys(pin);
	 }
	public void setMobNo(String mno)
	 {
		 mobElement.sendKeys(mno);
	 }
	public void setEmail(String mail)
	 {
		 emailElement.sendKeys(mail);
	 }
	public void setPassword(String pass)
	 {
		passElement.clear();
		 passElement.sendKeys(pass);
	 }
	public void submit()
	 {
		 submitElement.click();
	 }
	 public void Logout()
	 {
		 logoutElement.click();
		 ldriver.switchTo().alert().accept();
	 }







}
