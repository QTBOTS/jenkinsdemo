package com.qtbots.selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver extends TestBase implements ISeleniumDriverManager{

	
	public void launchBrowser() {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void loginToQTApplication() throws Exception {
		driver.get("https://qtbots-selenium.web.app/");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email_field"))));
				//close and quit. 
		//To acceess element we have used element id. 
		driver.findElement(By.id("email_field")).click();
		driver.findElement(By.id("email_field")).clear();
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).click();
		driver.findElement(By.id("password_field")).clear();
		
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		//driver.findElement(By.linkText("Login to Account")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Home')]"))));
		
	}

	@AfterSuite
	public void quitApplication() {
		driver.quit();
		
	}

	public void waitForElementVisibleExplicit(int iSecondsToWait, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,iSecondsToWait);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

	

	
}
