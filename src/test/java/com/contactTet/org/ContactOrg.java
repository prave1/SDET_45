package com.contactTet.org;

import org.testng.annotations.Test;

public class ContactOrg {
	
	@Test(groups= {"smokeTest"})
	public void createCust()
	{
		System.out.println("Create Customer");
	}
	@Test(groups= {"smokeTest"})
	public void editCust()
	{
		System.out.println("Edit Customer");
	}

}
