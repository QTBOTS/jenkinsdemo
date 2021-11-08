package com.qtbots.seltestngscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.qtbots.selenium_demo.ISeleniumDriverManager;
import com.qtbots.selenium_demo.SeleniumDriver;
import com.qtbots.selenium_demo.TestBase;

public class Day3 extends TestBase {

	//static ISeleniumDriverManager sel = new SeleniumDriver();

	@Test(priority = 1)
	public static void experimentAutoComplete() throws Exception {
		WebElement eleWidget = driver.findElement(By.xpath("//button[contains(text(), 'Widget')]"));
		sel.waitForElementVisibleExplicit(10, eleWidget);
		eleWidget.click();
		WebElement eleAutoComplete = driver.findElement(By.xpath("//a[contains(text(), 'AutoComplete')]"));
		sel.waitForElementVisibleExplicit(5, eleAutoComplete);
		eleAutoComplete.click();
		WebElement eleCountry = driver.findElement(By.id("myInput"));
		sel.waitForElementVisibleExplicit(10, eleCountry);
		eleCountry.click();
		eleCountry.sendKeys("u");
		Thread.sleep(3000);
		List<WebElement> liCountry = driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
		System.out.println(liCountry.size());
		for (int count = 0; count < liCountry.size(); count++) {
			System.out.println(liCountry.get(count).getText());
			if (liCountry.get(count).getText().contains("America")) {
				System.out.println("Selecting " + count);
				liCountry.get(count).click();
				break;
			}
		}
		
	}

	@Test(priority = 2)
	public static void experimentAccordian() throws Exception {
		WebElement eleWidget = driver.findElement(By.xpath("//button[contains(text(), 'Widget')]"));
		sel.waitForElementVisibleExplicit(10, eleWidget);
		eleWidget.click();
		// driver.findElement(By.xpath("//button[contains(text(), 'Widget')]")).click();
		sel.waitForElementVisibleExplicit(10, driver.findElement(By.xpath("//a[contains(text(), 'Accordian')]")));
		driver.findElement(By.xpath("//a[contains(text(), 'Accordian')]")).click();
		WebElement eleSection1 = driver.findElement(By.xpath("//button[contains(text(), 'Section 1')]"));
		sel.waitForElementVisibleExplicit(10, eleSection1);
		eleSection1.click();
		WebElement eleSection1Text = driver
				.findElement(By.xpath("//button[contains(text(), 'Section 1')]/../div[1]/p"));
		sel.waitForElementVisibleExplicit(10, eleSection1Text);
		String sSection1Text = eleSection1Text.getText();
		System.out.println(eleSection1Text.getText());

	}

	@Test(priority = 3)
	public static void experimentDropDown() throws Exception {
		WebElement eleHome = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		eleHome.click();
		Thread.sleep(2000);
		sel.waitForElementVisibleExplicit(10, driver.findElement(By.id("city")));
		
		Select seCity = new Select(driver.findElement(By.id("city")));
		seCity.selectByVisibleText("PATNA");
		Thread.sleep(3000);
		seCity.selectByValue("newdelhi");
		Thread.sleep(3000);
		seCity.selectByIndex(3);
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public static void experimentRadioButton() throws Exception {
		WebElement eleHome = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		eleHome.click();
		sel.waitForElementVisibleExplicit(10, driver.findElement(By.xpath("//input[@value='female']")));
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//input[@value='female']")).isSelected());
		driver.findElement(By.xpath("//input[@value='female']")).click();

	}
}
