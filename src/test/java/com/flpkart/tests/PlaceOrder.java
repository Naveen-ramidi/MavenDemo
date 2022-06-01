package com.flpkart.tests;

import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.searchproductpage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @Test (priority =1 )
  public void loginTest() {
	  LoginPage loginPage = new LoginPage();
	  String actResult = loginPage.validateLogin("7036945228", "Naveen410");
	  Assert.assertEquals(actResult, "Naveen");
  }
  @Test (dependsOnMethods = {"loginTest"})
public void searchproductpage() {
	  searchproductpage product = new searchproductpage();
	  String actResult = product.validatesearchproductpage("Mobile");
	  System.out.println(actResult);
	  Assert.assertEquals("Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com", "Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  launchBrowser();
	  navigateToURL();
  }

  @AfterClass
  public void afterClass() {
  }

}
