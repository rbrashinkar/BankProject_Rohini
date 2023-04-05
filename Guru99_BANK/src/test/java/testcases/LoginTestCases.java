package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.BaseClass;
import utility.ExcelUtility;

public class LoginTestCases extends BaseClass {
	
//for Negative test cases....	
	@DataProvider
	Object readData() throws IOException // creating | reading the data and will give the data  to another method 
	{
	/*	String loc="C:\\Users\\Lenovo\\Desktop\\LoginData.xlsx";
		ExcelUtility read = new ExcelUtility(loc);
	    int rows= read.getRowCount("Sheet1");
	    int cols = read.getCellCount("Sheet1", rows);
		Object[][] data = new Object[rows][cols];  // creating two dim array
		
		for(int i = 1;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				    data[i-1][j]=  read.getCellData("Sheet1",i, j);
				    System.out.println("==================================="+data[i-1][j]);
			}
		} */
		Object[][] data = new Object[1][2];  // creating two dim array
		//wrong userName correct password
		//[0][0]= "anu";    data[0][1]= "Riyansh@12";   
		
		//wrong userName and wrong password
		//data[1][0]= "mngr486054";    data[1][1]= "suman"; 
		
		//correct userName and wrong password
		// data[0][0]= "mngr486054";    data[0][1]= "abuq"; 
		
		//Correct UserName and correct password.
		data[0][0]= "mngr486054";    data[0][1]= "Riyansh@12"; 
		
		//correct userName and blank password
		//data[4][0]= "mngr480371";    data[4][1]= " ";
		
		//blank userName and correct password
		//data[5][0]= " ";    data[5][1]= "AbuqUvY";
		
		//blank userName and blank password
		//data[6][0]= " "; data[6][1]= " ";     
		
		//data[0][0]= "mngr480371";    data[0][1]= "AbuqUvY"; 
		return data;
	}
	

	@Test(dataProvider ="readData")
	void verifyUser(String User,String pass)
	{
		//System.out.println(driver);
		 System.out.println(User);
		 System.out.println(pass);
		driver.get("https://demo.guru99.com/V4/index.php");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage login  = new LoginPage(driver);
		login.setUserName(User);
		login.setPassword(pass);
	    login.clickButton(); 
	}

}
