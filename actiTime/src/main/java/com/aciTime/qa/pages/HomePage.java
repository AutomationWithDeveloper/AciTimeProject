package com.aciTime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aciTime.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//td[@class='profileCell preventPanelsHiding']")
	WebElement userNameLabel;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	WebElement tasksLink;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	WebElement usersLink;

public HomePage(){
	PageFactory.initElements(driver,this);		
}
public String verifyHomePageTitle(){
	return driver.getTitle();
}
public boolean verifyCorrectUserName(){
	return userNameLabel.isDisplayed();	
}

public UserNamePage clickOnuserNameLabel(){
	Actions act = new Actions(driver);
	act.moveToElement(userNameLabel).click().build().perform();
	userNameLabel.click();
	return new UserNamePage();
}
public TasksLinkPage clickOntasksLink(){
	tasksLink.click();
	return new TasksLinkPage();
}
public UsersLinkPage clickOnusersLink(){
	usersLink.click();
	return new UsersLinkPage();
}
}