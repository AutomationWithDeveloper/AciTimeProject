package com.aciTime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aciTime.qa.base.TestBase;

public class AddNewCustomerAndProject extends TestBase {
	@FindBy(name="name")
	private WebElement addNewProjectEdit;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectBtn;

	public WebElement getAddNewProjectEdit() {
		return addNewProjectEdit;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}
}
