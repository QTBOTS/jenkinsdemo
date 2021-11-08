package com.demo.testng_suite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class TC_Home {


	@Test(groups = "sanity")
	public void TC_HOME_001() {
		System.out.println("TC_HOME_001");
	}
	@Test(groups = "regression")
	public void TC_HOME_002() {
		System.out.println("TC_HOME_002");
	}
	@Test
	public void TC_HOME_003() {
		System.out.println("TC_HOME_003");
	}
	@Test(groups = {"sanity","regression"})
	public void TC_HOME_004() {
		System.out.println("TC_HOME_004");
		assertEquals(1, 1);
		
	}
}
