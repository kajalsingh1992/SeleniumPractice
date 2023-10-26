package com.seleniumpractice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//unable to select shift,edit button xpath not found
public class ManageWorkPlan 
{
	WebDriver driver;
	public static final String URL="http://132.145.24.71:3000/ews/";
	public static final String USERNAME=":r0:";
	public static final String PASSWORD=":r1:";
	public static final String LOGIN="//button[@btntext=\'Login\'] ";
	public static final String MENU_BUTTON="//*[@id='root']/div[1]/header//button";
	public static final String MANAGEWORKPLAN_BUTTON="//*[text()='Manage Work Plans']";
	public static final String ADD_BUTTON="//button[contains(@btntext,'+ New')]";
	public static final String WORK_PLAN_TEXT="//input[contains(@id,':r3:')]";
	public static final String ACTIVE="//input[contains(@type,'checkbox')]";
	public static final String SHIFT_SUNDAY="//body//div[3]//div[3]//div[3]/div[1]/div/div/div";
	public static final String SHIFT_MONDAY="//div[2]//div//div[3]/div[2]/div/div/div";
	public static final String SHIFT_TUESDAY="//html//div[2]//div//div[3]/div[4]/div/div/div";
	public static final String SHIFT_WEDNESDAY="//html//div[6]//div[4]/div/div/div";
	public static final String SHIFT_THURSDAY="//html//div[6]/div[3]//div[5]/div/div/div";
	public static final String SHIFT_FRIDAY="//html//div[3]//div[2]//div[6]/div/div/div";
	public static final String SHIFT_SATURDAY="//html//div[6]//div[7]/div/div/div";
	//public static final String EDIT_BUTTON="unable to find xpath";
	public static final String SAVE="//button[contains(@btntext,'Save')]";
	public static final String CANCEL="//button[contains(@btntext,'Cancel')]";
	public static final String ACTIVE_EDIT="/html//div[2]//span/input";
	public static final String SAVE_EDIT="//button[contains(@btntext,'Save')]";
	public static final String DELETE_EDIT="//button[contains(@btntext,'Delete')]";
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
public void menuButton() 
{
	driver.findElement(By.xpath(MENU_BUTTON)).click();
	driver.findElement(By.xpath(MANAGEWORKPLAN_BUTTON)).click();
	driver.findElement(By.xpath(ADD_BUTTON)).click();
	driver.findElement(By.xpath(WORK_PLAN_TEXT)).sendKeys("Test123");
	driver.findElement(By.xpath(ACTIVE)).click();
	WebElement selectShiftSunday=driver.findElement(By.xpath(SHIFT_SUNDAY));
	selectShiftSunday.click();
	WebDriverWait wait= new WebDriverWait(driver,(Duration.ofSeconds(120)));
	WebElement waitoption=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='menu-']/div[3]/ul/li[5]")));
	waitoption.click();
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SHIFT_SUNDAY)));
	//new WebDriverWait(driver, Duration.ofSeconds(120)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[5]"))).click();
	//new WebDriverWait(driver, Duration.ofSeconds(120)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='selectric-items']//li[contains(., 'Borrowing Capacity')]"))).click();
	
	WebElement shiftMonday=driver.findElement(By.xpath(SHIFT_MONDAY));
	shiftMonday.click();
	WebDriverWait waitMonday= new WebDriverWait(driver,Duration.ofSeconds(120));
	WebElement waitMon=waitMonday.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'menu-\']/div[3]/ul/li[5]")));
	waitMon.click();
	WebElement shiftTuesday = driver.findElement(By.xpath(SHIFT_TUESDAY));
	WebDriverWait waitTuesday= new WebDriverWait(driver,Duration.ofSeconds(60));
	WebElement waitTues=waitTuesday.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'menu-\']/div[3]/ul/li[6]")));
	waitTues.click();
	WebElement shiftWednesday=driver.findElement(By.xpath(SHIFT_WEDNESDAY));
	shiftWednesday.clear();
	WebDriverWait waitWed= new WebDriverWait(driver,Duration.ofSeconds(60));
	WebElement waitWed1=waitWed.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'menu-\']/div[3]/ul/li[6]")));
	waitWed1.click();
	WebElement shiftThursday=driver.findElement(By.xpath(SHIFT_THURSDAY));
   shiftThursday.click();
   WebDriverWait shiftThu= new WebDriverWait(driver, Duration.ofSeconds(60));
   WebElement shiftThu1=shiftThu.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'menu-\']/div[3]/ul/li[5]")));
   shiftThu1.click();
   WebElement shiftFriday=driver.findElement(By.xpath(SHIFT_FRIDAY));
   shiftFriday.click();
   WebDriverWait shiftFri= new WebDriverWait(driver, Duration.ofSeconds(60));
   WebElement shiftFri1=shiftFri.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'menu-\']/div[3]/ul/li[5]")));
   shiftFri1.click();
   WebElement shiftSat=driver.findElement(By.xpath(SHIFT_SATURDAY));
   shiftSat.click();
   WebDriverWait shiftSat1= new WebDriverWait(driver, Duration.ofSeconds(60));
  WebElement shiftSatu= shiftSat1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'menu-\']/div[3]/ul/li[5]")));
  shiftSatu.click();
}
	
@Test(priority = 3)
public void edit() 
	
{
//	driver.findElement(By.xpath(MENU_BUTTON)).click();
	driver.findElement(By.xpath(ACTIVE_EDIT)).click();
	driver.findElement(By.xpath(SAVE_EDIT)).click();
	driver.findElement(By.xpath(DELETE_EDIT)).click();
	driver.findElement(By.xpath(CANCEL_EDIT)).click();
	
	
}
	
}
	
