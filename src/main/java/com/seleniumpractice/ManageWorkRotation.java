package com.seleniumpractice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.common.JavaCore;
public class ManageWorkRotation extends JavaCore
{//rotation name,search reset not working
//	WebDriver driver;
	
	public static final String URL="http://132.145.24.71:3000/ews/";
	public static final String USERNAME=":r0:";
	public static final String PASSWORD=":r1:";
	public static final String LOGIN="//button[@btntext=\'Login\'] ";
	public static final String MENU_BUTTON="//*[@id='root']/div[1]/header//button";
	public static final String MANAGE_WORK_ROTATION="//*[text()='Manage Work Rotations']";
	public static final String WORK_ROTATION_NAME="//*[@id=':r2:']";
	public static final String SEARCH="//button[@btntext='Search']";
	public static final String RESET="//button[@btntext='Reset']";
	public static final String NEW="//button[contains(@btntext,'+ New')]";
	public static final String WORK_ROTATION_TEXT="//*[@id='root']//following::input[2]";
	public static final String START_FROM="/html//div[2]//div[2]/div//div/div[2]/div/div/button";
	public static final String START_FROM_SELECTION="/html//div[3]/div[3]/div//div[2]/div[3]";
	public static final String FOREVER_FLAG="/html/body/div[2]/div[3]//label//input";
	public static final String NEW_WORK_PLAN="//html//div[3]//div[2]/div[1]/div/div/div/button";
	public static final String SEARCH_WORK_PLAN="/html//div[3]//div[2]/div[2]//div/button";
	public static final String SELECT_WORK_PLAN="/html//div[2]//div[1]/label/div";
	public static final String SELECT_BUTTON="//button[contains(@btntext,'Select')]";
	public static final String SEQUENCE="//*[@id=\":r14:\"]";
	public static final String ITERATION="//*[@id=\":r15:\"]";
	public static final String SAVE="//button[contains(@btntext,'Save')]";
	public static final String CANCEL="//button[contains(@btntext,'Cancel')]";
	public static final String EDIT_BUTTON="//*[@id='root']/div[2]//div[2]//div[2]/div[2]/div[2]/div[1]//div";
	public static final String SAVE_EDIT="//button[contains(@btntext,'Save')]";
	public static final String DELETE_EDIT="//button[contains(@btntext,'Delete')]";
	public static final String CANCEL_EDIT="//button[contains(@btntext,'Cancel')]";
	
	
	
	@BeforeSuite
	public void launch()
	{
	//driver= new ChromeDriver();
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
			
	}
	@Test(priority = 1)
	public void login()
	{
		driver.findElement(By.id(USERNAME)).sendKeys("kathrine.kaper");
		driver.findElement(By.id(PASSWORD)).sendKeys("welcome");	
		driver.findElement(By.xpath(LOGIN)).click();
	}
	@Test(priority = 2)
	public void menuButton() 
	{
		driver.findElement(By.xpath(MENU_BUTTON)).click();
		driver.findElement(By.xpath(MANAGE_WORK_ROTATION)).click();
	driver.findElement(By.xpath(WORK_ROTATION_NAME)).sendKeys("Work Rotation Test");
		driver.findElement(By.xpath(SEARCH)).click();
	driver.findElement(By.xpath(RESET)).click();	
	}
			
	@Test(priority = 3)
	public void newButton() 
	{
		driver.findElement(By.xpath(NEW)).click();	
	List<WebElement> workrottext	=driver.findElements(By.xpath(WORK_ROTATION_TEXT));
	workrottext.get(0).sendKeys("Work Rot Test");
		driver.findElement(By.xpath(START_FROM)).click();	
		driver.findElement(By.xpath(START_FROM_SELECTION)).click();
		driver.findElement(By.xpath(FOREVER_FLAG)).click();
		driver.findElement(By.xpath(NEW_WORK_PLAN)).click();
		driver.findElement(By.xpath(SEARCH_WORK_PLAN)).click();
		driver.findElement(By.xpath(SELECT_WORK_PLAN)).click();
		driver.findElement(By.xpath(SELECT_BUTTON)).click();
		//driver.findElement(By.xpath(SEQUENCE)).sendKeys("2");
		JavaCore.sendKeys(SEQUENCE,"2");
		driver.findElement(By.xpath(ITERATION)).sendKeys("2");
		driver.findElement(By.xpath(SAVE)).click();
	//	driver.findElement(By.xpath(CANCEL)).click();
		
		
		
	}
	@Test(priority = 4,enabled = false)
	public void editButton() 
	{
		driver.findElement(By.xpath(EDIT_BUTTON)).click();
		driver.findElement(By.xpath(DELETE_EDIT)).click();
		driver.findElement(By.xpath(CANCEL_EDIT)).click();
		
		
}
}