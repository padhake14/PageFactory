package com.test.automation.uiAutomation.homepage;

import org.apache.log4j.Logger;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiAction.HomePage;

import junit.framework.Assert;

public class TC_001_VerifyLoginWithInvalidCredentails extends TestBase {
	
	public static final Logger log = Logger.getLogger(TC_001_VerifyLoginWithInvalidCredentails.class.getName());

	HomePage homepage;
	
	@BeforeTest
	public void setUp()  {
		init();
		
	}
	
	@Test
	public void verifyLoginWithInvalidCredentails() throws InterruptedException {
		log.info("*********Starting verifyLoginWithInvalidCredentails test*******");
		homepage = new HomePage(driver);
		homepage.loginToApplication("test@gmail.com", "password");
		Thread.sleep(3000);
		Assert.assertEquals(homepage.getInvalidLoginText() ,"Authentication failed.");
		log.info("*********Finshed verifyLoginWithInvalidCredentails test*******");

	}
	@AfterClass
	public void endTest() {
		driver.close();
	}
}
