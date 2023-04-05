package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	  public LoginPage(WebDriver driver)
		{
		    ldriver= driver;
			PageFactory.initElements(driver, this);
		}
		
		
		
			
		@FindBy(name="uid")
		WebElement usernameElement;
		

		@FindBy(name="password")
		WebElement passwordElement;

		

		@FindBy(name="btnLogin")
		WebElement buttonElement;
		
		
		public void setUserName(String username)
		{
			usernameElement.sendKeys(username);
		}
		
		
		public void setPassword(String password)
		{
			passwordElement.sendKeys(password);
		}
		
		
		public  void clickButton()
		 {
			buttonElement.click();
		 }

}
