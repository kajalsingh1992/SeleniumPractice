package com.seleniumpractice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DashboardEws 
{
	WebDriver driver;
	@Test(priority = 1)
public void login() 
{
	 driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	driver.get("http://132.145.24.71:3000/ews/");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.id(":r0:"));
	element.sendKeys("kathrine.kaper");
	WebElement element1=driver.findElement(By.id(":r1:"));
	element1.sendKeys("welcome");
	WebElement element2=driver.findElement(By.xpath("//button[@btntext=\"Login\"] "));
	element2.click();

}
	
	@Test(priority = 2)
public void dashboard() throws InterruptedException
{	
	WebElement element =driver.findElement(By.xpath("//*[@id='root']/header/div/button"));
	element.click();
	WebElement element1 =driver.findElement(By.linkText("User Preferences"));
	element1.click();
	WebElement element2 =driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/div/div/div/div[3]"));
	element2.click();
	Thread.sleep(2000);
	WebElement element3 =driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/div[1]/div[3]/button"));
	element3.click();
	WebElement element4 =driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/div/div/div/div[2]/div/div/label[2]/span/input"));
	element4.click();
}}
