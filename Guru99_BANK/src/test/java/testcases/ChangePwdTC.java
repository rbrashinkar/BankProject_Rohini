package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ChangePwdPage;
import pages.LoginPage;
import utility.BaseClass;

public class ChangePwdTC extends BaseClass{
	@Test
	void ChangePassword()
	{
	driver.get("https://demo.guru99.com/V4/index.php");
	LoginPage login  = new LoginPage(driver);
	login.setUserName("mngr486054");
	login.setPassword("Riyansh@12");
    login.clickButton();
    																							
    
    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    ChangePwdPage pc = new ChangePwdPage(driver);
    //pc.changepassword();
    //pc.setoldpass("Riyansh@10");
    //pc.newpass("Riyansh@12");
    //pc.confirmpwd("Riyansh@12");
    pc.MiniStmt();
    pc.setAccNo("120464");
    pc.submit();
    Assert.assertTrue(true);

}
}
