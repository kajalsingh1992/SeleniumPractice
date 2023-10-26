package com.seleniumpractice;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testautomationpractice
{
public static final String APP_URL="https://testautomationpractice.blogspot.com/";
public static final String NEW_WINDOW="//button[text()='New Browser Window']";
public static final String SELECT_COLOR="colors";
public static final String SELECT_CALENDER="datepicker";
public static final String SELECT_DATE="//a[text()='12']";
public static final String SELECT_LINK="orange HRM";
public static final String ORAGNE_URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
public static final String USER_NAME="username";
public static final String POST_ATOM="Posts (Atom)";
public static final String SELECT_WINDOW="//*[@id='HTML4']/div[1]/button";
public static final String DESKTOP="//a[text()='Desktops']";
public static final String DRAG= "//*[text()='Drag me to my target']";
public static final String DROP= "//*[@id='droppable']";
public static final String TAB="Wikipedia1_wikipedia-search-input";
public static final String ALERT="//button[text()='Alert']";
public static final String CONFIRM_BOX="//button[text()='Confirm Box']";
public static final String PROMPT="//button[text()='Prompt']";
public static final String LINK_TEXT="//button[text()='Copy Text']";
public static final String SELECT_SLIDER="slider";

WebDriver driver;	
@BeforeSuite
public void openUrl()
{
	driver= new ChromeDriver();
	driver.get(APP_URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
}
@Test(priority = 1)
	public void entertextbox()
	{
		driver.findElement(By.id("name")).sendKeys("kajal Singh");
		driver.findElement(By.id("email")).sendKeys("kajal.singh@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9080706050");
		driver.findElement(By.id("textarea")).sendKeys("Panipat");				
	}
@Test(priority = 2)
public void selectradiobutton()
{
	driver.findElement(By.id("male")).click();
	driver.findElement(By.id("female")).click();
				
}
@Test(priority = 3)
public void selectcheckbox()
{
	driver.findElement(By.id("sunday")).click();	
	driver.findElement(By.id("monday")).click();
	driver.findElement(By.id("tuesday")).click();
	driver.findElement(By.id("wednesday")).click();
	driver.findElement(By.id("thursday")).click();
	driver.findElement(By.id("friday")).click();
	driver.findElement(By.id("saturday")).click();				
}
@Test(priority = 4)
public void selectdropdown1()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,700)");
	//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Select country= new Select(driver.findElement(By.id("country")));	
	country.selectByIndex(1);//select by index
	//country.selectByValue("usa");//select by value,choose from inspect element
	//country.selectByVisibleText("Germany");//select by text
	List<WebElement> allOptions = country.getOptions();
	System.out.println(allOptions.size());
	
	        Iterator<WebElement> iterator=allOptions.iterator();
             while (iterator.hasNext()) {
				WebElement Option1 = (WebElement) iterator.next();
			System.out.println("List of Countrys"+Option1.getText()+"****************");
			}


}
@Test(priority = 5)
public void selectColor()
{
WebElement selectCol=driver.findElement(By.id(SELECT_COLOR));
Select selectC= new Select(selectCol);
selectC.selectByIndex(2);
List<WebElement> options = selectC.getOptions();
System.out.println(options);
Iterator<WebElement> iterator = options.iterator();
while (iterator.hasNext()) {
	WebElement webElement = (WebElement) iterator.next();
	System.out.println("List of Colors"+webElement.getText()+"****************");
}}
@Test(priority = 6)
public void selectCalendar()
{
WebElement selectCalendar=driver.findElement(By.id(SELECT_CALENDER));
selectCalendar.click();
driver.findElement(By.xpath(SELECT_DATE)).click();
}

@Test(priority = 7,enabled = false)
public void selectlink()
{
WebElement selectlink=driver.findElement(By.linkText(SELECT_LINK));
selectlink.click();
}
@Test(priority = 8,enabled = false)
public void selectWindow() throws InterruptedException
{
	Set<String> windowHandles = driver.getWindowHandles();
	Iterator<String> iterator = windowHandles.iterator();
	while (iterator.hasNext()) {
		String childWindow = (String) iterator.next();
		driver.switchTo().window(childWindow);
	}
	
	
	driver.findElement(By.name(USER_NAME)).sendKeys("Admin");
      Thread.sleep(2000);
      driver.navigate().back();

}
@Test(priority = 9)
public void selectPostAtom() throws InterruptedException 
{
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("Window.scrollTo", ("0,300"));
	
//driver.findElement(By.linkText(POST_ATOM)).click();
//driver.navigate().back();
Thread.sleep(2000);
}
@Test(priority = 10)
public void selectTab()  
{
driver.findElement(By.id(TAB)).sendKeys("abc");
}
@Test(priority = 11,enabled = false)
public void selectWindows() throws InterruptedException 
{
	//driver.findElement(By.linkText(POST_ATOM)).click();
	//driver.navigate().back();
	JavascriptExecutor js= (JavascriptExecutor) driver;	
	js.executeScript("scroll(0, -250)");
	driver.findElement(By.xpath(SELECT_WINDOW)).click();
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles .size());
	ArrayList<String> al= new ArrayList(windowHandles);
	Object obj=(String)al.get(1);
	driver.switchTo().window((String) obj);
	driver.findElement(By.xpath(DESKTOP)).click();
	Thread.sleep(20000);
	driver.close();
	
}
@Test(priority = 12)
public void dragDrop()  
{
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("Window.scrollTo", ("0,100"));
WebElement sourceLocator = driver.findElement(By.xpath(DRAG));
WebElement destinationLocator = driver.findElement(By.xpath(DROP));

	Actions drgdrp= new Actions(driver);
	drgdrp.dragAndDrop(sourceLocator, destinationLocator).build().perform();
	
	
}

@Test(priority = 13,enabled = false)
public void selectAlert()  
{
//driver.findElement(By.xpath(ALERT)).click();
//unable to find out path for OK button
//driver.findElement(By.xpath(CONFIRM_BOX)).click();
//unable to find out path for OK button
//driver.findElement(By.xpath(PROMPT)).click();
//unable to find out path for OK/Cancel button


}
@Test(priority = 14,enabled = false)
public void doubleClick()  
{
	Actions act = new Actions(driver);
	WebElement doubclick = driver.findElement(By.xpath(LINK_TEXT));
	act.doubleClick(doubclick);

}
@Test(priority = 15,enabled = false)
public void doubleSlider()  
{
WebElement selSlider = driver.findElement(By.id(SELECT_SLIDER));
Actions selctSlid= new Actions(driver);
//Action action = (Action)move.dragAndDropBy(slider, 30, 0).build();
//((Actions) action).perform();


}
@AfterSuite
public void close() throws InterruptedException
{
	Thread.sleep(10000);
driver.quit();
		

}
}


