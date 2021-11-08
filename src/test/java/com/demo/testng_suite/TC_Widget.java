package com.demo.testng_suite;

import org.testng.annotations.Test;

public class TC_Widget {

	@Test(groups = {"sanity","regression"})
	public void TC_Widget_001() {
		System.out.println("TC_Widget_001");
	}
	@Test(groups = {"regression"})
	public void TC_Widget_002() {
		System.out.println("TC_Widget_002");
	}
	@Test
	public void TC_Widget_003() {
		System.out.println("TC_Widget_003");
	}
	@Test(groups = "sanity")
	public void TC_Widget_004() {
		System.out.println("TC_Widget_004");
	}
}
