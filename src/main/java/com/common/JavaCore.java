package com.common;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.PropertyReader;

public class JavaCore 
{
	public static WebDriver driver;
	
	public void commonMethods()
	{
		String browser= PropertyReader.getConfigProperties("browser");
				switch(browser)
				{
				case "chrome":
				{
					driver= new ChromeDriver();
					break;
				}				
					case "firefox":
					{
						driver= new FirefoxDriver();
						break;
					}
					default: break;
				}
									
		//driver= new ChromeDriver();
		driver.get(PropertyReader.getConfigProperties("Server_Url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
	}		

	public static By getLocator(String locator)
	{
				By result= null;
				if(locator.startsWith(".//"))
				{
					result=By.xpath(locator);
	}
	else if(locator.startsWith("//"))
	{
		result=By.xpath(locator);
	}		
	else if(locator.startsWith("css="))
	{
		result=By.cssSelector(locator.replace("css=", ""));
	}		
	else if(locator.startsWith("name="))
	{
		result=By.name(locator.replace("name=", ""));
	}
	else if(locator.startsWith("link="))
	{
		result=By.linkText(locator.replace("link=", ""));
	}		
	else if(locator.startsWith("id="))
	{
		result=By.id(locator.replace("id=", ""));
	}			
	
				return result;
	}
			
	static	public void sendkeys(String locator, String value)

		{
			By locator2 = getLocator(locator);
			WebElement findElement = driver.findElement(locator2);
			findElement.sendKeys(value);
		}
	static	public void sendpassword(String locator, String value)
	{
		
		//WebElement findElement = driver.findElement(By.name(locator));
	//	findElement.sendKeys(value);
		By locator2 = getLocator(locator);
		//WebElement findElement = driver.findElement(By.id(locator2 ));
		//findElement.sendKeys(value);
	}
	
		
	static	public void onClick(String locator)
		{
			By locator3 = getLocator(locator);
			
			
			
			
		}
	
	
	
	
}
