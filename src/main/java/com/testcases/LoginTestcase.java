package com.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestcase
{
	@DataProvider(name="readData")
	public Object[][] readExcel()
	{
		Object o[][]= {{"username","Admin"},{"password","admin123"}};
		
		return o;
	}		
	@Test(priority = 1,dataProvider = "readData")
         public void myTest(String name,String value)
	
	{
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement userName=driver.findElement(By.name("username"));
	WebElement passWord=driver.findElement(By.name("password"));
	WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
	userName.sendKeys(name);
	passWord.sendKeys(value);
	loginButton.click();
	
	
	}
	
	 
	
}
