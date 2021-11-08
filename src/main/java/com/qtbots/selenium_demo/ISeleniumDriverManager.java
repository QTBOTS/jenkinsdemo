package com.qtbots.selenium_demo;

import org.openqa.selenium.WebElement;

public interface ISeleniumDriverManager {
	
	void launchBrowser();
	void loginToQTApplication() throws Exception;
	void quitApplication();
	void waitForElementVisibleExplicit(int iSecondsToWait, WebElement ele);
}
