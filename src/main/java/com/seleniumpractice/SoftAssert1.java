package com.seleniumpractice;
import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 
{
	WebDriver driver;	
	public static final String URL="https://www.saucedemo.com";
	public static final String USERNAME="user-name";
	public static final String PASSWORD="password";
	public static final String UNAME="standard_user";
	public static final String PWORD="secret_sauce";
	public static final String LOGIN="login-button";
   // public static final String DASHBOARD_PRODUCT="https://www.saucedemo.com/v1/inventory.html";
	public static final String PRODUCT_URL="//*[text()='Products']";
	
				 
		@BeforeSuite
		public void openBrowser()
		{
		driver= new ChromeDriver();
		driver.manage().window().maximize(); //maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); //sync app and code
		driver.get(URL);
		String urlapp=driver.getCurrentUrl();
		//Assert.assertEquals(URL, urlapp);	
		}
				
		@Test(priority = 1)
		public void login()
		{
			driver.findElement(By.id(USERNAME)).sendKeys(UNAME);;
			driver.findElement(By.id(PASSWORD)).sendKeys(PWORD);;
			driver.findElement(By.id(LOGIN)).click();
	//String name=driver.findElement(By.xpath(DASHBOARD_PRODUCT)).getText();//return text name
			//WebElement element1=driver.findElement(By.xpath(DASHBOARD_PRODUCT));
		//	System.out.println(element1);
			//Assert.assertEquals(DASHBOARD_PRODUCT, name);
			
		}
		
		@Test(priority = 2)
		public void dashboard()
		{
			SoftAssert assert1= new SoftAssert();
			WebElement element=driver.findElement(By.xpath(PRODUCT_URL));
			boolean b=element.isDisplayed();
			assert1.assertEquals(true, b);
			
			//WebElement element1=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack"));
			if(b)
			{
				element.click();
			}
			assert1.assertAll();
		}
		@Test(priority = 3,enabled = false)
		public void loginPract()
		{
			SoftAssert softassert1= new SoftAssert();
			driver.findElement(By.id(USERNAME)).sendKeys(UNAME);
			driver.findElement(By.id(PASSWORD)).sendKeys(PWORD);
			driver.findElement(By.id(LOGIN)).click();
			WebElement element = driver.findElement(By.xpath(PRODUCT));	
			String text = element.getText();
		   softassert1.assertEquals("Products", text);
		softassert1.assertAll();
		   
		   
		   
		}
		
		@AfterSuite
		public void teardown()
		{
		//	driver.close();
		}		
	}
	