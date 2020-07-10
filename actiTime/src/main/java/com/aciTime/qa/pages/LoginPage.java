package com.aciTime.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aciTime.qa.base.TestBase;

public class LoginPage extends TestBase {
//Page Factory Object Repository
	
@FindBy(xpath="//input[@id='username']")
WebElement username;

@FindBy(name="pwd")
WebElement password;

@FindBy(xpath="//a[@id='loginButton']//div[contains(text(),'Login')]")
WebElement signInBtn;

@FindBy(xpath="//div[@class='atLogoImg']")
WebElement aciTimeImage;


//Initializing Page Objects
public LoginPage(){
	PageFactory.initElements(driver,this);		
}

//Actions
public String validateLoginPageTitle(){
	return driver.getTitle();
}
public boolean validateaciImage(){
	return aciTimeImage.isDisplayed();
}
public HomePage login(String email,String passwrd) throws InterruptedException{
	
	username.sendKeys(email+Keys.TAB);
	password.sendKeys(passwrd+Keys.ENTER);
	Thread.sleep(5000);
	signInBtn.click();
	
	
	return new HomePage();
}
}
