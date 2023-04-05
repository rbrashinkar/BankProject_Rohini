package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAccountPage {
	WebDriver ldriver;
	  
	 public AddAccountPage(WebDriver driver)
	 {
		 ldriver= driver;
			PageFactory.initElements(driver, this);
	 }
		
	
	 @FindBy(xpath = "//a[normalize-space()='New Account']")
	 WebElement addAcc;
	 
	 @FindBy(xpath  = "//input[@name='cusid']")
	 WebElement cidElement;
	 
	 @FindBy(xpath = "//select[@name=\"selaccount\"]")
	 WebElement dropdownElement;
	 @FindBy(xpath = "//option[@value=\"Savings\"]")
	 WebElement acctypElement;
	 
	 @FindBy(name = "inideposit")
	 WebElement iniDepositElement;
	 
	 @FindBy(xpath = "//input[@name='button2']")
	 WebElement submitElement;
	 
	 @FindBy(xpath = "//a[normalize-space()='Home']")
	 WebElement homElement;
	 
	 @FindBy(xpath = "//a[normalize-space()='Log out']")
	 WebElement logoutElement;
	 
	 public void AddAcc()
	 {
		 addAcc.click();
	 }
	 public void homeruturn ()
	 {
		 homElement.click();
	 }
	 
	 public void setcid( String no)
	 {
		 cidElement.sendKeys(no);
	 }
	 
	 public void setacctype()
	 {
		 dropdownElement.click();
		 acctypElement.click();
	 }
	 public void setinitalAmt(String amt)
	 {
		 iniDepositElement.sendKeys(amt);
	 }
	 
	 public void Submit()
	 {
		 submitElement.click();
	 }
	 
	 public void  Logout()
	 {
		 logoutElement.click();
		 ldriver.switchTo().alert().accept();
		 
	 }
	 
	}

			
	


