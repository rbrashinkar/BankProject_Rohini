package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.AddAccountPage;
import utility.BaseClass;

public class AddAccount extends BaseClass {

@Test
void Addaccount() throws InterruptedException
{
	//System.out.println(driver);
	// System.out.println(User);
	// System.out.println(pass);
	driver.get("https://demo.guru99.com/V4/index.php");
	LoginPage login  = new LoginPage(driver);
	login.setUserName("mngr486054");
	login.setPassword("Riyansh@12");
    login.clickButton(); 
    
    AddAccountPage mngr = new AddAccountPage(driver);
    mngr.AddAcc();
    mngr.setcid("14867");
    mngr.setacctype();
    mngr.setinitalAmt("3000");
    mngr.Submit();
   // mngr.Logout();
}
}





