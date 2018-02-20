package com.test.automation.uiAutomation.uiAction;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.uiAutomation.testBase.TestBase;

public class HomePage {
	public static final Logger log = Logger.getLogger(HomePage.class.getName());

	@FindBy(xpath = "//a[@class=\"login\"]")
	WebElement signIn;

	@FindBy(xpath = "//input[@id=\"email\"]")
	WebElement loginEmailAddress;

	@FindBy(xpath = "//input[@id=\"passwd\"]")
	WebElement loginPassword;

	@FindBy(id = "SubmitLogin")
	WebElement submitbutton;

	@FindBy(xpath = ".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationfailed;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String emailAddress, String password) throws InterruptedException {
		log.info("click on sign in and objecct" + signIn.toString());
		signIn.click();
		Thread.sleep(3000);
		loginEmailAddress.sendKeys(emailAddress);
		log.info("Entered email Address:-" + emailAddress + "and objet is" + loginEmailAddress.toString());
		Thread.sleep(3000);
		loginPassword.sendKeys(password);
		log.info("Entered password :-" + password + "and objet is" + loginPassword.toString());
		Thread.sleep(3000);
		submitbutton.click();
		log.info("clicked on submit");
		Thread.sleep(3000);
	}

	public String getInvalidLoginText() {
		return authenticationfailed.getText();

	}

}
