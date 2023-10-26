package com.seleniumpractice;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LaunchOrange
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
	//WebElement element1=driver.findElement(By.xpath("//*[contains(@placeholder,'Type here')]"));
	//element1.sendKeys("Remarks"); //enter remarks under punch in
	//WebElement element2=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
	//element2.click(); //Click on Out button to save not working
		WebElement element3=driver.findElement(By.linkText("My Timesheets"));
		element3.click(); //click on timesheet menu
		//WebElement element4=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[1]/a"));
		//element4.click(); //Click on my timesheet link
	//	WebElement element5=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[1]"));
		//element5.click(); //click on timesheet menu
		//Thread.sleep(2000);
		//WebElement element6= driver.findElement(By.linkText("Employee Timesheets"));
		//element6.click();	 //Click on Employee timesheet
		//Thread.sleep(2000); //2 sec pause
		//WebElement element7=driver.findElement(By.xpath("//*[@id='app']//div[2]/button"));
		//element7.click(); //Click on View button under employ timesheet not working
	}
	@Test(priority = 5,enabled = false)
	public void attendance()
	{
		WebElement element=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
		element.click(); //click on attendance
		WebElement element1=driver.findElement(By.linkText("My Records"));
		element1.click(); //Click on my record
		//WebElement element2=driver.findElement(By.xpath("//button[@type='button']"));
		//element2.click(); //Click on View button under my record not working
		WebElement element3=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
		element3.click(); //click on attendance
		WebElement element4=driver.findElement(By.linkText("Punch In/Out"));
		element4.click(); //Click on Punch in punch Out
		WebElement element5=driver.findElement(By.xpath("//textarea[@placeholder='Type here']"));
		element5.sendKeys("Notes Remarks"); //enter remarks under notes
		WebElement element6=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button"));
		element6.click(); //Click on Out button
		
	}
	@Test(priority = 6,enabled = false)
	public void employeerecords()
	{
		WebElement element1=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
		element1.click(); //click on attendance
		WebElement element2=driver.findElement(By.linkText("Employee Records"));
		element2.click(); //Click on Employee Records
		//WebElement element3=driver.findElement(By.xpath("//button[@type='submit']"));
		//element3.click(); //click on view button under EmployeeRecords
		WebElement element4=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
		element4.click(); //click on attendance
		WebElement element5=driver.findElement(By.linkText("Configuration"));
		element5.click(); //Click on Configuration
		WebElement element6=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/form/div[2]/button"));
		element6.click(); //click on attendance
	}	
	@Test(priority = 7,enabled = false)
	public void reports()
	{	
		WebElement element1=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span"));
		element1.click(); //click on reports
		WebElement element2=driver.findElement(By.linkText("Project Reports"));
		element2.click(); //Click on Project Reports
	//	WebElement element3=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div[1]/div[2]/div[3]/button"));
		//element3.click(); //click on dropdown option not working
		WebElement element4=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div/div/div[2]/div/div/input"));
		element4.sendKeys("prject name"); //Enter project name
		WebElement element5=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
		element5.click(); //Enter project date"));
	//select date
		//select togle
		//
		
		
	}}

