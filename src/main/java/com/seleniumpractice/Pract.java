package com.seleniumpractice;
import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Pract 
{

WebDriver driver;
public static final String URL="https://www.saucedemo.com";
public static final String USERNAME="user-name";
public static final String PASSWORD="password";
public static final String UNAME="standard_user";
public static final String PWORD="secret_sauce";
public static final String LOGIN="login-button";

@BeforeSuite
public void launch()
{
	SoftAssert assert1= new SoftAssert();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(URL);
String currenturl	=driver.getCurrentUrl();
System.out.println(currenturl);
assert1.assertEquals(URL, currenturl);


}
@Test(priority = 1)
public void login()
{
	driver.findElement(By.xpath(USERNAME)).sendKeys(UNAME);
	driver.findElement(By.xpath(USERNAME)).sendKeys(UNAME);
	
	
	
	
}
	
	
}
	
	
	

