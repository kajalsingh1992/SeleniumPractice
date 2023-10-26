package com.seleniumpractice;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Annotation2 
{
	@Test
	public void tc5()
	{    //before every tc
		System.out.println("Test no 2 from Annotation 2");
	}	
	@Test()
	public void tc6()
	{    //before every tc
		System.out.println("Test no 3 from Annotation 2");
	}
	
	@BeforeClass
	public void annot2()
	{
		System.out.println("Before Class from Annotation 2");
	}
	@AfterClass
	public void annot6()
	{
		System.out.println("After Class from Annotation 2");
	}
	
}
