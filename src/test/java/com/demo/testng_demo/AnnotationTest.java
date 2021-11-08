package com.demo.testng_demo;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationTest {

	@Test
	public void aa1() {
		System.out.println("m1");
	}
	@Test
	public void aa2() {
		System.out.println("a1");
	}
	@Test
	public void AAa1() {
		System.out.println("b1");
	}
	@Test
	public void A1a2() {
		System.out.println("z1");
	}
	@BeforeSuite
	public void zz1() {
		System.out.println("zz1");
	}
	@BeforeSuite
	public void zz2() {
		System.out.println("zz2");
	}
	/*
	 if you have more than one annotation for an given method. Then it will go with ascending order
	 
	 Number will take over the letters
	 capital letter will come first then the small one
	 
	 aa1 
	 aa2 
	 aaa1 
	 aaa2
	 * */
}
