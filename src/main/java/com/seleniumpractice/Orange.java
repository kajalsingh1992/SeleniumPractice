package com.seleniumpractice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange
{
	public static final String URL_APP="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	@Test(priority = 1)
public void launch()
{
	 driver= new ChromeDriver();
	driver.get(Orange.URL_APP); //launch url
	driver.manage().window().maximize(); //maximize window
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); //sync app and code
	String url=driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertEquals(URL_APP, url);
}
	@Test(priority = 2,enabled = false)
	public void login()
	{
		WebElement element=driver.findElement(By.xpath("//*[@id='app']//form//div/input"));
		element.sendKeys("Admin"); //enter username by absolute path
		WebElement element1=driver.findElement(By.xpath("//*[contains(@name,'password')]"));
		element1.sendKeys("admin123");	 //enter password by contains name
		WebElement element2=driver.findElement(By.xpath("//*[@id='app']//div[1]//form//button"));
		element2.click(); //click on login button
		
	}
	@Test(priority = 3,enabled = false)
	public void swipeOff()
	{
		WebElement element=driver.findElement(By.xpath("//button[contains(@role,'none')]"));
		element.click();  //swipe off the menu		
	}
	@Test(priority = 4,enabled = false)
	public void assignLeave()
	{
		WebElement element=driver.findElement(By.xpath("//*[@id='app']//div[2]//div/div[3]//div[2]//button"));
		element.click();  //click on Assign leave
		WebElement element1=driver.findElement(By.xpath("//input[contains(@placeholder,'Type for hints...')]"));
		element1.sendKeys("Robot Framework");	
		
	}
	
}
