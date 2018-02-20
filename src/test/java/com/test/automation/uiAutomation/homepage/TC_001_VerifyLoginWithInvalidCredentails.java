package com.test.automation.uiAutomation.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.uiAction.HomePage;

import junit.framework.Assert;

public class TC_001_VerifyLoginWithInvalidCredentails {
	
	WebDriver driver;
	HomePage homepage;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		
	}
	
	@Test
	public void verifyLoginWithInvalidCredentails() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.loginToApplication("test@gmail.com", "password");
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/ol/li")).getText() ,"Authentication failed.");
		
	}
	@AfterClass
	public void endTest() {
		driver.close();
	}
}
