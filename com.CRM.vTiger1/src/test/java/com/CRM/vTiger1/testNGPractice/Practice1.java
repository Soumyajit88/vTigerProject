package com.CRM.vTiger1.testNGPractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Practice1 {
	
	@Test(priority = 2,invocationCount = 2)
	public void ananda() {
		Reporter.log("My Name Is Ananada",true);
	}
	
	@Test(priority = -1,dependsOnMethods = "maharshi")
	public void ram() {
		Reporter.log("My Name Is ram",true);
	}
	
	@Test
	public void maharshi() {
		Reporter.log("My Name Is maharshi",true);
	}
	
	@Test(priority = 1,alwaysRun = false)
	public void shyam() {
		Reporter.log("My Name Is shyam",true);
		Assert.fail();
	}
	
	@Test(priority = -2,invocationCount = 2)
	public void narendra() {
		Reporter.log("My Name Is narendra",true);
	}
	
	@Test(dependsOnMethods = "maharshi", enabled = true)
	public void ankit() {
		Reporter.log("My Name Is narendra",true);
	}
	
}
