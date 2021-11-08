package com.demo.testng_demo;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PriorityDemo {
	@Test(priority=2, enabled=true)
	public void m4() {
		System.out.println("m1");
	}
	@Test(priority=1)
	public void m2() {
		System.out.println("a1");
	}
	@Test(priority=-2)
	public void m1() {
		System.out.println("b1");
	}
	@Test(priority=-1)
	public void m3() {
		System.out.println("z1");
	}
	/*
	 * priority will override the method orders
	 * lower the priority will be the first to run
	 * If you dont give priority it will add priority=0
	 * 
	 * */
}
