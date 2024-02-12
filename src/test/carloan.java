package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class carloan {

	@Parameters({"URL"})
	@Test
	public void weblogincarloan(String urlname)
	{
		System.out.println("weblogincarloan");
		System.out.println(urlname);
	}
	@Test
	public void applogincarloan()
	{
		System.out.println("applogincarloan");
	}
	@Test
	public void apilogincarloan()
	{
		System.out.println("apilogincarloan");
	}
	
	
	@Test
	public void mobilesignin1()
	{
		System.out.println("weblogincarloan");
	}
	@Test
	public void mobilesignin2()
	{
		System.out.println("applogincarloan");
	}
	@Test
	public void mobilesignin3()
	{
		System.out.println("apilogincarloan");
	}
	
}
