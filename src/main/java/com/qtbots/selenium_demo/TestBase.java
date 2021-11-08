package com.qtbots.selenium_demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver;
	public static ISeleniumDriverManager sel = new SeleniumDriver();
	
	@BeforeSuite
	public void prerequisite() throws Exception {
		sel.launchBrowser();
		sel.loginToQTApplication();
	}
	
	@AfterSuite
	public void lastprocess() {
		sel.quitApplication();
	}
}
