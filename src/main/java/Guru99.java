
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class Guru99 
{
public static final String URL= "http://demo.guru99.com/test/newtours/";
public static final String HOME_BUTTON= "//a[text()='Demo Site']";
public static final String CLOSE_BUTTON="//*[text()='Close']";
WebDriver driver;

@BeforeSuite
public void launch()
{
	driver= new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
}
@Test(priority = 1)
public void login()
{
	driver.findElement(By.xpath(HOME_BUTTON)).click();
	Actions builder = new Actions(driver);
	//Action mouseOverHome = builder.moveToElement(HOME_BUTTON).build();
//	 Actions builder = new Actions(driver);
//     Action mouseOverHome = builder
//             .moveToElement(link_Home)
//             .build();
//      
//     String bgColor = td_Home.getCssValue("background-color");
//     System.out.println("Before hover: " + bgColor);        
//     mouseOverHome.perform();        
//     bgColor = td_Home.getCssValue("background-color");
//     System.out.println("After hover: " + bgColor);
//     driver.close();

}





}
