package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePwdPage {
	WebDriver ldriver;
	public ChangePwdPage(WebDriver driver) {
		ldriver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[normalize-space()='Change Password']")
	WebElement chgpwdElement;
	
	@FindBy(xpath ="//input[@name='oldpassword']")
	WebElement oldpassElement;
	
	@FindBy(name  = "newpassword")
	WebElement newpassElement;
	
	@FindBy(name  = "confirmpassword")
	WebElement confirmElement;
	
	@FindBy(name = "sub")
	WebElement submitElement;
	
	@FindBy(xpath = "//a[normalize-space()='Mini Statement']")
	WebElement ministmtElement;
	
	@FindBy(xpath = "//input[@name='accountno']")
	WebElement accNoElement;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement submitElement2;
	
	public void MiniStmt()
	{
		ministmtElement.click();
	}
	
	public void setAccNo(String no) {
		accNoElement.sendKeys(no);
		
	}
	public void submit() {
		submitElement2.click();
		
	}
	public void changepassword() {
		chgpwdElement.click();
		
	}
	
	public void setoldpass(String opass)
	{
		oldpassElement.sendKeys(opass);
	}
	
	public void newpass(String npass) {
		newpassElement.sendKeys(npass);
		
	}
	
	public void confirmpwd(String cpass) {
		confirmElement.sendKeys(cpass);
		
	}
	
	

}
