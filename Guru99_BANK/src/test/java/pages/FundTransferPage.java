package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferPage {
	WebDriver lDriver;
	public FundTransferPage(WebDriver driver) {
	    lDriver=driver;
	    PageFactory.initElements(driver, this);
	}
   
	@FindBy(xpath = "//a[normalize-space()='Fund Transfer']")
	WebElement fundtransElement;
	
	@FindBy(name = "payersaccount")
	WebElement payersElement;
	
	@FindBy(name = "payeeaccount")
	WebElement payeeElement;
	
	@FindBy(name = "ammount")
	WebElement amtElement;
	
	@FindBy(name = "desc")
	WebElement descElement;
	
	@FindBy(name = "AccSubmit")
	WebElement acsubmitElement;
	
	public void FundTransfer()
	{
		fundtransElement.click();
	}
	
	public void setPayersAcc(String payers) {
		payersElement.sendKeys(payers);
		
	}
	public void setPayeeAcc(String payee)
	{
		payeeElement.sendKeys(payee);
	}
	public void setAmmount(String amt)
	{
		amtElement.sendKeys(amt);
	}
	public void setDesc(String desc)
	{
		descElement.sendKeys(desc);
	}
	public void Submit() {
		acsubmitElement.click();
	}
}
