package com.seleniumpractice;
import static org.hamcrest.CoreMatchers.allOf;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class LaunchManageWorkDuration
{
WebDriver driver;
public static final String URL="http://132.145.24.71:3000/ews/";
public static final String USERNAME=":r0:";
public static final String PASSWORD=":r1:";
public static final String LOGIN="//button[@btntext=\'Login\'] ";
public static final String MENU_BUTTON="//*[@id='root']/div[1]/header//button";
public static final String MANAGEWORKDURATION_BUTTON="//*[text()='Manage Work Duration']";
public static final String WORK_DURATION_NAME="//*[@id=\':rc:\']";
public static final String TIME="//*[@id=\":rd:\"]";
public static final String SEARCH="//button[text()='Search']";
public static final String RESET="//button[text()='Reset']";
public static final String NEW="//button[text()='+ New']";
public static final String WORK_DURATION_CODE_VALUE= "//*[@id=\':r1d:\']";
public static final String WORK_DURATION_NAME_VALUE= "//*[@id=\':r1e:\']";
public static final String VALID_FROM= "//div[6]//div[1]//div[2]//button";
public static final String VALID_FROM_SELECTION= "/html/body/div[7]//div//div[2]/div[3]";
public static final String VALID_TO= "//div[3]//div[2]/div[2]//div[2]//div/button";
public static final String VALID_TO_SELECTION="/html//div[3]//div[2]/div/div[2]/div[7]";
public static final String SELECT_DAYS= "/html//div//label//input";
public static final String TIME_START= "//*[@id=\':r1f:\']";
public static final String TIME_END= "//*[@id=':r1g:']";
public static final String WORK_DURATION_CATEGORY="//html//div[6]//div[2]//div[5]//div/div/div";
public static final String SAVE="//button[text()='Save']";
public static final String CANCEL="//button[text()='Cancel']";
public static final String EDIT="//*[contains(@data-testid,'EditIcon')]";
public static final String SAVE_EDIT="/html//div[6]/div[3]/div//div[3]/div//button[1]";
public static final String DELETE="//button[contains(@btntext,'Delete')]";
public static final String DELETE_CLOSE="//html//div[7]//div[1]//button";
public static final String CANCEL_EDIT="//button[contains(@btntext,'Cancel')]";


@BeforeSuite
public void launch()
{
	driver= new ChromeDriver();
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
	public void menuButton() throws InterruptedException
	{
		SoftAssert softAssert1= new SoftAssert();
		driver.findElement(By.xpath(MENU_BUTTON)).click();
		Thread.sleep(5000);
		WebElement manageDuration=driver.findElement(By.xpath(MANAGEWORKDURATION_BUTTON));
		manageDuration.click();
		String text=manageDuration.getText();
		System.out.println(text);
		softAssert1.assertEquals("Manage Work Duration", text);
		softAssert1.assertAll();
		
	}
	@Test(priority = 3)
	public void create() throws InterruptedException 
	{
	driver.findElement(By.xpath(WORK_DURATION_NAME)).sendKeys("D12.5 07:00 AM_WS");
	Thread.sleep(5000);
	driver.findElement(By.xpath(TIME)).sendKeys("8am");
		driver.findElement(By.xpath(SEARCH)).click();
		driver.findElement(By.xpath(RESET)).click();
		driver.findElement(By.xpath(NEW)).click();
		driver.findElement(By.xpath(WORK_DURATION_CODE_VALUE)).sendKeys("D12 09:00 AM_WS");
		driver.findElement(By.xpath(WORK_DURATION_NAME_VALUE)).sendKeys("Testing Automation");
	driver.findElement(By.xpath(VALID_FROM)).click();	
	driver.findElement(By.xpath(VALID_FROM_SELECTION)).click();
	driver.findElement(By.xpath(VALID_TO)).click();	
	driver.findElement(By.xpath(VALID_TO_SELECTION)).click();	
	driver.findElement(By.xpath(SELECT_DAYS)).click();	
	driver.findElement(By.xpath(TIME_START)).sendKeys("8:00");
	driver.findElement(By.xpath(TIME_END)).sendKeys("12:00");
	WebElement workdurationcategory=driver.findElement(By.xpath(WORK_DURATION_CATEGORY));
	workdurationcategory.click();
	WebDriverWait wait= new WebDriverWait(driver,(Duration.ofSeconds(120)));
	WebElement waitoption=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")));
	waitoption.click();
	driver.findElement(By.xpath(SAVE)).click();
	//driver.findElement(By.xpath(RESET)).click();
	
}
	
	@Test(priority = 4)
	public void edit()
	{
		driver.findElement(By.xpath(EDIT)).click();
		driver.findElement(By.xpath(SAVE_EDIT)).click();
		driver.findElement(By.xpath(DELETE)).click();
		driver.findElement(By.xpath(DELETE_CLOSE)).click();
		driver.findElement(By.xpath(CANCEL_EDIT)).click();
	}



}
