package com.seleniumpractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LaunchEws 
{
	WebDriver driver;
	
	@Test(priority = 1)
public void launch() throws InterruptedException
{ 
	
	 driver= new ChromeDriver();
	driver.get("http://132.145.24.71:3000/ews/");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
}
	@Test(priority = 2)
public void enterUsername()
{
WebElement element=driver.findElement(By.id(":r0:"));
element.sendKeys("kathrine.kaper");

}
	@Test(priority = 3)
public void enterPassword()
{
	WebElement element=driver.findElement(By.id(":r1:"));
	element.sendKeys("welcome");
}
	@Test(priority = 4)
public void login()
{
	//List<WebElement> elements =driver.findElements(By.xpath("//button[@type='button']"));
	//elements.get(0).click();
		WebElement element=driver.findElement(By.xpath("//button[@btntext=\"Login\"] "));
	element.click();
}


}
