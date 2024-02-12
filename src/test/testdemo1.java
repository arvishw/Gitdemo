package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testdemo1 {

	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test");
	}
	
	
	
	@Test
	public void demotestng1()
	{
		System.out.println("Good");
	}
	
	@BeforeTest
	public void prerequest()
	{
	 System.out.println("I will execute first");	
	}
}
