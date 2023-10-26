package com.seleniumpractice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Practice
{
	WebDriver driver;	
	public static final String URL="https://www.saucedemo.com/";
	public static final String USERNAME="user-name";
	public static final String PASSWORD="password";
	public static final String UNAME="standard_user";
	public static final String PWORD="secret_sauce";
	public static final String LOGIN="login-button";
	public static final String PRODUCT="//*[text()='Products']";
	
	@BeforeSuite()
	public void openBrowser()
	{
	SoftAssert softassert1= new SoftAssert();
	driver= new ChromeDriver();
	driver.manage().window().maximize(); //maximize window
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); //sync app and code
	driver.get(URL);
	System.out.println(URL);
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
	softassert1.assertEquals(URL, currenturl);
	softassert1.assertAll();
	}
	@Test(priority = 1)
	public void login()
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
	
}
