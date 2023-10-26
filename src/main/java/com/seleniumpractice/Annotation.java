package com.seleniumpractice;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Annotation 
{
@BeforeSuite
public void annot()
{
	//driver intilize code,basic setup project/framework
	System.out.println("Before Suite");
}
@BeforeTest
public void beforetst()
{    //before every tc
	System.out.println("Before Test");
}
@BeforeClass
public void annot2()
{
	System.out.println("Before Class");
}
@Test
public void tc1()
{    //before every tc
	System.out.println("Test no 1");
}	
@Test
public void tc2()
{    //before every tc
	System.out.println("Test no 2");
}	
@Test
public void tc3()
{    //before every tc
	System.out.println("Test no 3");
}	

@AfterSuite
public void annot8()
{ //after project completion, cleanup code,,browser close
	System.out.println("After Suit");
}

@BeforeMethod
public void annot3()
{
	System.out.println("Before Method");
}

@AfterClass
public void annot6()
{
	System.out.println("After Class");
}
@AfterTest
public void annot1()
{
	System.out.println("After Test");
}
@AfterMethod
public void annot5()
{
	System.out.println("After Method");
}

}
