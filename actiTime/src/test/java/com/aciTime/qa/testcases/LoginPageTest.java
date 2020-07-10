package com.aciTime.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aciTime.qa.base.TestBase;
import com.aciTime.qa.pages.HomePage;
import com.aciTime.qa.pages.LoginPage;
import com.aciTime.qa.utils.TestUtil;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	String sheetName = "LoginPage";
	public LoginPageTest(){
		super();
	}
  
  @BeforeMethod
  public void setup() throws InterruptedException {
	  initializatiion();
	  loginPage = new LoginPage();
	  testUtil = new TestUtil();
  }
  
  @Test(priority=1)
  public void loginPageTitle(){
	 String title= loginPage.validateLoginPageTitle();
	 Assert.assertEquals(title,"actiTIME - Login");
	  
  }
  @Test(priority=2)
  public void validateaciImageTest(){
	  boolean flag=loginPage.validateaciImage();
	  Assert.assertTrue(flag);
	  System.out.println(flag);
  }
  
  @DataProvider
  public Object[][] getloginTestData(){
	  Object data [][]=TestUtil.getTestData(sheetName);
	  return data;
	  
  }
  @Test(priority=3, dataProvider="getloginTestData")
  public void loginTest(String email,String passwrd) throws InterruptedException {
 // homePage=loginPage.login(prop.getProperty("username"+Keys.TAB), prop.getProperty("password"+Keys.ENTER));
	homePage=loginPage.login(prop.getProperty("email"+Keys.TAB), prop.getProperty("passwrd"+Keys.ENTER));
	  
  System.out.println(driver.getTitle());
  Thread.sleep(4000);
  }
  
 @AfterMethod
  public void tearDown(){
	  driver.quit();
  }
   

}
