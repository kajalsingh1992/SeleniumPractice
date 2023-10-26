package com.seleniumpractice;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.common.JavaCore;
public class TestWindow extends JavaCore
{

	//WebDriver driver=null;
	 
	public static final String URL="https://demoqa.com/browser-windows";
	public static final String URL1="//button[@id='tabButton']";
	
	@BeforeSuite
	public void openBrowser()
	{
	//driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.manage().window().maximize();
	driver.get(URL);
	}
	
	@Test(priority = 1)
	public void login()
	{
driver.findElement(By.xpath("//button[@id='tabButton']")).click();//click on tab button
//     String mainwindow = driver.getWindowHandle();//to handle single window
//      System.out.println(mainwindow);//to print unique id of window
//    Set<String> windowhandles  =driver.getWindowHandles();
//      Iterator<String> iterator = windowhandles.iterator();
//      while (iterator.hasNext()) 
//      {
//		String  childwindow = (String) iterator.next();
//		if(!mainwindow.equalsIgnoreCase(childwindow))
//		{
//			driver.switchTo().window(childwindow);
//		}
//		String title=driver.findElement(By.id("sampleHeading")).getText();
//		System.out.println(title);
//	}
   //  Set<String> windowhandles  =driver.getWindowHandles();
   //  System.out.println(windowhandles.size());//find out size of window handles
    // ArrayList tabs = new ArrayList(windowhandles);
    // String object = (String) tabs.get(1);
     //driver.switchTo().window(object);
  //  driver.switchTo().window((String)tabs.get(1));
   //  String title=driver.findElement(By.id("sampleHeading")).getText();
 	//	System.out.println(title);
JavaCore.tabSwitch(1);

	}	
	
	@Test(priority = 2)
	public void dashboard()
	{ 
  
  
	}
     
	}
       
       

  
	 
	

