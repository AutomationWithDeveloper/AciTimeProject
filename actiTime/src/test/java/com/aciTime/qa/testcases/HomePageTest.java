package com.aciTime.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aciTime.qa.base.TestBase;
import com.aciTime.qa.pages.HomePage;
import com.aciTime.qa.pages.LoginPage;
import com.aciTime.qa.utils.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	public HomePageTest(){
		super();
	}
@BeforeMethod
public void setup() throws InterruptedException {
initializatiion();
loginPage = new LoginPage();
homePage =  loginPage.login(prop.getProperty("username"+Keys.TAB), prop.getProperty("password"+Keys.ENTER));
testUtil = new TestUtil();
	  }
@Test(priority=4)
public void verifyHomePageTitleTest(){
	String homePageTitle=homePage.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "actiTIME - Login","Home page Title Not matched");
}

@Test(priority=5)
public void verifyCorrectUserNameTest(){
	
	System.out.println(driver.getTitle());
	
	Assert.assertTrue(homePage.verifyCorrectUserName());
}




@AfterMethod
public void tearDown(){
	  driver.quit();
}
}
