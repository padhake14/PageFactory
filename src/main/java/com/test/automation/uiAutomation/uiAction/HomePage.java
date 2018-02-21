package com.test.automation.uiAutomation.uiAction;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
	
	///////////////
	@FindBy(id = "email_create")
	WebElement createUser;
	
	@FindBy(id = "SubmitCreate")
	WebElement submitEmail;

	@FindBy(id = "id_gender1")
	WebElement selectGender;
	
	@FindBy(id = "customer_firstname")
	WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	WebElement lastName;

	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(id = "firstname")
	WebElement userFirstname;

	@FindBy(id = "lastname")
	WebElement userLastname;
	
	@FindBy(id = "company")
	WebElement companyName;
	
	@FindBy(id = "address1")
	WebElement address;
	
	@FindBy(id = "id_state")
	WebElement Select;
	

	@FindBy(id = "city")
	WebElement cityName;
	
	@FindBy(id = "postcode")
	WebElement pastCode;
	
	@FindBy(id = "other")
	WebElement otherDetails;
	
	@FindBy(id = "phone")
	WebElement phone;

	@FindBy(id = "phone_mobile")
	WebElement mobile;
	
	@FindBy(id = "alias")
	WebElement setAlias;
	
	@FindBy(id = "submitAccount")
	WebElement submitDeatils;

	

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
	
	public void registarUser() throws InterruptedException {
		signIn.click();
		createUser.sendKeys("ssd@gdnd.com");
		submitEmail.click();
		Thread.sleep(2000);
		selectGender.click();
		
		firstName.sendKeys("parag");
		lastName.sendKeys("dsd");
	
		password.sendKeys("12345");
		userFirstname.sendKeys("firstname");
		userLastname.sendKeys("lastname");
		companyName.sendKeys("company");
		address.sendKeys("address1");
		cityName.sendKeys("city");
		
		((org.openqa.selenium.support.ui.Select) Select).selectByIndex(3);
		pastCode.sendKeys("124571");
		
		otherDetails.sendKeys("company");
		phone.sendKeys("1234567890");
		mobile.sendKeys("9876541230");
		setAlias.sendKeys("alias");
		submitDeatils.click();
	}

}
