package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dummy {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		// driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/V4/index.php");
		WebElement unamElement=driver.findElement(By.name("uid"));
		unamElement.sendKeys("mngr486054");
		WebElement passElement =driver.findElement(By.name("password"));
		passElement.sendKeys("Riyansh@10");
		WebElement loginElement=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		loginElement.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,78.66666412353516)");
	    //driver.findElement(By.linkText("New Customer")).click();
		//driver.findElement(By.partialLinkText("Manager")).click();
		Actions action = new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]"));
		action.doubleClick(ele).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("dob")).click();
	    driver.findElement(By.id("dob")).sendKeys("2023-03-01");
		
		

	}
}
