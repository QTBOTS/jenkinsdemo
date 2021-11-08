package com.demo.testng_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_demo {

	@Test
	public void imTest1() {
		System.out.println("imTest1");
	}
	
	@Test
	public void imTest2() {
		System.out.println("imTest2");
	}
	@Test
	public void imTest3() {
		System.out.println("imTest3");
	}
	@BeforeSuite
	public void iminBeforeSuiteMethod() {
		System.out.println("iminBeforeSuiteMethod");
	}
	
	@AfterSuite
	public void iminAfterSuiteMethod() {
		System.out.println("iminAfterSuiteMethod");
	}
	
	@AfterTest
	public void iminAfterTest() {
		System.out.println("iminAfterTest");
	}
	
	@BeforeTest
	public void iminBeforeTest() {
		System.out.println("iminBeforeTest");
	}
	@BeforeClass
	public void iminBeforeClass() {
		System.out.println("iminBeforeClass");
	}
	@AfterClass
	public void iminAfterClass() {
		System.out.println("iminAfterClass");
	}
	@BeforeMethod
	public void iminBeforeMEthod() {
		System.out.println("iminBeforeMEthod");
	}
	@AfterMethod
	public void iminAfterMethod() {
		System.out.println("iminAfterMethod");
	}
}
