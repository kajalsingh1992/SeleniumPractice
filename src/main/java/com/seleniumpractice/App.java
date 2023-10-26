package com.seleniumpractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class App 
{
	WebDriver driver;
	@Test(priority = 1)
    public  void login(  )
    {
    	
 driver= new ChromeDriver();
 //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/maintenance/purgeEmployee");
 //driver.manage().window().maximize();
 System.out.println("login");
    }
	
	@Test(enabled = false)
	public void app()
	{
		System.out.println("App");
	}
	@Test(priority =2)
	public void vapp()
	{
		System.out.println("Vpp");
	}
	@Test
	public void zapp()
	{
		System.out.println("Vpp");
	}
}
