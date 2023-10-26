package com.pages;

import com.common.JavaCore;
import com.util.PropertyReader;
public class LoginPages extends JavaCore
{
	public static final String  USER_NAME = "id=:r0:";
	public static final String  PASS_WORD = "id=:r1:";
	public static final String  LOGIN_BUTTON = "xpath=//button[text()='Login']";
	
	
	//public static void enterUserName(String uname)
	public static void enterUserName()
	{
		//WebElement findElement = driver.findElement(By.id(USER_NAME));
		//findElement.sendKeys(uname);
		JavaCore.sendkeys(USER_NAME, PropertyReader.getConfigProperties("User_name"));
	}
	public static void enterPassWord(String pwrd)
	{
		//WebElement findElement = driver.findElement(By.id(PASS_WORD));
		//findElement.sendKeys(pwrd);
		JavaCore.sendpassword(PASS_WORD, pwrd);
	}
	public static void clickOnLogin()
	{
		//WebElement findElement = driver.findElement(By.id(LOGIN_BUTTON));
		//findElement.click();
		JavaCore.onClick(LOGIN_BUTTON);
	}
	public void getANDVerifyLableName()
	{
		SoftAssert  Assurt1 = new SoftAssert();
		   WebElement webTitle = driver.findElement(By.xpath(TITLE_PAGE));
	   	  String getTtle=webTitle.getText(); 
	   	  Assurt1.assertEquals("Login",getTtle);
	   	  Assurt1.assertAll();
	 	  
	}
	
}
