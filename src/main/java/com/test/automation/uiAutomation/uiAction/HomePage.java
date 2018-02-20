package com.test.automation.uiAutomation.uiAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@class=\"login\"]")
	WebElement signIn;
	
	@FindBy(xpath="//input[@id=\"email\"]")
	WebElement loginEmailAddress;
	
	@FindBy(xpath="//input[@id=\"passwd\"]")
	WebElement loginPassword;
	
	@FindBy(id="SubmitLogin")
	WebElement submitbutton;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationfailed;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginToApplication(String emailAddress, String password) throws InterruptedException {
		signIn.click();
		Thread.sleep(3000);
		loginEmailAddress.sendKeys(emailAddress);
		Thread.sleep(3000);
		loginPassword.sendKeys(password);
		Thread.sleep(3000);
		submitbutton.click();
		Thread.sleep(3000);
	}
	
}
