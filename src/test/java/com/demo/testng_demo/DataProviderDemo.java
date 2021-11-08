package com.demo.testng_demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	
	@Test(dataProvider="demo_credentials")
	public void loginToBrowser(String sUsername, String sPassword) {
		System.out.println("USername "+sUsername+"\t password "+sPassword);
	}
	
	@DataProvider(name="demo_credentials")
	public Object [][] credentials() {
		String[][] strCre = {{"u1","p1"},{"u2","p2"},{"u3","p3"}};
		return strCre;
		
	}
}
