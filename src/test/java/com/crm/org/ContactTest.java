package com.crm.org;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups= {"smokeTest"})
	public void test()
	{
		System.out.print("Test1 Executing");
		
		//String URL = System.getProperty("url");
		System.out.println("-----------URL----------");
		//String BROWSER = System.getProperty("Browser");
		System.out.println("-----------Browser--------");
		
	}
	@Test(groups= {"smokeTest"})
	public void test2()
	{
		System.out.print("Test1 Executing");
	}

}
