package com.test.automation.uiAutomation.homepage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiAction.HomePage;




public class TC_002_VerifyRegistration extends TestBase {
	HomePage homepage;
	@BeforeTest
	public void setUp()  {
		init();
		
	}
	
	@Test
	public void verifyLoginWithInvalidCredentails() throws InterruptedException  {
		homepage = new HomePage(driver);
		homepage.registarUser();
	
	}
	@AfterClass
	public void endTest() {
		driver.quit();
	}
}
