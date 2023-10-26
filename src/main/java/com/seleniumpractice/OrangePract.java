package com.seleniumpractice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class OrangePract 
{
public static final String USER_NAME="//*[@id='app']//form//div/input";
public static final String PASS_WORD="//*[contains(@name,'password')]";
//public static final String LOGIN="//*[@id='app']//div[1]//form//button";
//public static final String SWIPEOFF="//button[contains(@role,'none')]";
	
	WebDriver driver;
	@Test(priority = 1)
public void launch()
{
	 driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize(); //maximize window
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); //sync app and code
	WebElement element=driver.findElement(By.xpath(OrangePract.USER_NAME));
	element.sendKeys("Admin"); //enter username by absolute path
	WebElement element1=driver.findElement(By.xpath(PASS_WORD));
	element1.sendKeys("admin123");	 //enter password by contains name
}
	//@Test(priority = 2,enabled = false)
	//public void login()
	//{
	//	WebElement element=driver.findElement(By.id(LOGIN));
	//	element.click(); //click on login button
	//}
	//@Test(priority = 3,enabled = false)
	//public void swipeOff()
	//{
	//	WebElement element=driver.findElement(By.id(SWIPEOFF));
	//	element.click();  //swipe off the menu		
	//}
}
