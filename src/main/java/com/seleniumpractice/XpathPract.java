package com.seleniumpractice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class XpathPract 
{
	WebDriver driver;
	@Test(priority = 1)
public void launch()
{
	 driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize(); //maximize window
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); //sync app and code
	WebElement element=driver.findElement(By.xpath("//*[@id='app']//form//div/input"));
	element.sendKeys("Admin"); //enter username by absolute path
	WebElement element1=driver.findElement(By.xpath("//*[contains(@name,'password')]"));
	element1.sendKeys("admin123");	 //enter password by contains name
}
	@Test(priority = 2)
	public void login()
	{
		WebElement element=driver.findElement(By.xpath("//*[@id='app']//div[1]//form//button"));
		element.click(); //click on login button
	}
	@Test(priority = 3)
	public void swipeOff()
	{
		WebElement element=driver.findElement(By.xpath("//button[contains(@role,'none')]"));
		element.click();  //swipe off the menu
		
	}
	@Test(priority = 4)
	public void dashboard() throws InterruptedException
	{	
		WebElement element=driver.findElement(By.xpath("//*[@id='app']//div[2]/div//div[2]/button/i"));
		element.click(); //Click on timer against punch in
		
		WebElement element1=driver.findElement(By.xpath("//*[contains(@placeholder,'Type here')]"));
		element1.sendKeys("Remarks"); //enter remarks under punchin
		WebElement element2=driver.findElement(By.xpath("//button[contains(@role,'none')]"));
		element2.click(); //Click on Out button to save
		//WebElement element3=driver.findElement(By.xpath("//*[@id='app']//header//nav//li[1]"));
	//	element3.click(); //click on timesheet menu
}}
