package com.demo.testng_demo;

import org.testng.annotations.Test;

public class DemoTestNG {
/*
 * 1. we add dependency to pom file
 * 2. install testng plugin from eclipse market place
 * 	help --> market place -->go to search , Type testng in search
 * click on install and follow the instructions
 * 3.  Why we use testng with selenium?
 * login, formhome, click, mouse hover, popup
 * organise your test runs. 
 * Generate a report
 * 
 * organise your runs using annotation
 * 
 * @beforeMethod @AfterMethod @BeforeSuite @AfterSuite
 * 
 * @BeforeSuite
 * @BeforeTest
 * @Test
 * @AfterTest
 * @AfterSuite
 * 
 * 
 * */

	@Test
	public void launchBrowser() throws Exception{
		System.out.println("launching browser with selenium code");
		throw new Exception("sads");
	}
	
	@Test
	public void loginToWebsite() {
		System.out.println("Logged succesfully to browser");
	}
}
