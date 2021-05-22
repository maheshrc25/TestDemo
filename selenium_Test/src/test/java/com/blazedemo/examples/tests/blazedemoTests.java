package com.blazedemo.examples.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class blazedemoTests extends BlazedemoTestCase {

	@Test
	public void loginTest() throws InterruptedException {

		// Navigate to URL.
		getDriver().get(loginPage.getSitePage().getURL());
		 // explicit wait condition
	    WebDriverWait wait = new WebDriverWait(getDriver(),3);
		getDriver().manage().window().maximize();
		// Type 'Hello World' to text box.
		String headerText = loginPage.getSitePage().getPageHeadertext().getText();
		Reporter.log("headerText :" + headerText);
		
		
		wait.until(ExpectedConditions.visibilityOfAllElements(loginPage.getSitePage().getSlectDeparcherCity()));
		loginPage.getSitePage().chooseYourOption(loginPage.getSitePage().getSlectDeparcherCity(),"San Diego");
		loginPage.getSitePage().chooseYourOption(loginPage.getSitePage().getSlectdestinationCity(),"Dublin");
		// Wait before closing browser..
		wait.until(ExpectedConditions.visibilityOfAllElements(loginPage.getSitePage().getButton()));
		loginPage.getSitePage().getButton().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(loginPage.getSitePage().getflightFromTo()));
		String flightFromTo =loginPage.getSitePage().getflightFromTo().getText();
		Reporter.log("flightFromTo :" + flightFromTo);
		loginPage.getSitePage().getButton().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(loginPage.getSitePage().getdetailsPageHeadertext()));
		String detailsPageText =loginPage.getSitePage().getdetailsPageHeadertext().getText();
		String flightdetails =loginPage.getSitePage().getflightdetails().getText();
		Reporter.log("detailsPageText :" + detailsPageText);
		Reporter.log("flightdetails :" + flightdetails);
		wait.until(ExpectedConditions.visibilityOfAllElements(loginPage.getSitePage().getInputName()));
		
		loginPage.getSitePage().getInputName().sendKeys("Rajesh Murugan");
		loginPage.getSitePage().getAddress().sendKeys("Newyark");
		loginPage.getSitePage().getCity().sendKeys("Newyark");
		loginPage.getSitePage().getState().sendKeys("US");
		loginPage.getSitePage().getZipCode().sendKeys("533522");
		loginPage.getSitePage().chooseYourOption(loginPage.getSitePage().getCardType(),"American Express");
		loginPage.getSitePage().getCreditCardNumber().sendKeys("12345678901234");
		loginPage.getSitePage().getCreditCardMonth().sendKeys("02");
		loginPage.getSitePage().getCreditCardYear().sendKeys("2024");
		loginPage.getSitePage().getNameOnCard().sendKeys("Rajesh Murugan");
		loginPage.getSitePage().getButton().click();
		wait.until(ExpectedConditions.visibilityOfAllElements(loginPage.getSitePage().getPageHeadertext()));
		String ThanksforParches = loginPage.getSitePage().getPageHeadertext().getText();
		Reporter.log("Order Message :"+ThanksforParches);
		
		wait.until(ExpectedConditions.visibilityOfAllElements(loginPage.getSitePage().getOrderID()));
		String orderID = loginPage.getSitePage().getOrderID().getText();
		String OrderStatus = loginPage.getSitePage().getStatus().getText();
		String AuthCode = loginPage.getSitePage().getAuthCode().getText();
		String OrderDate = loginPage.getSitePage().getDate().getText();
		String ExpirationDate = loginPage.getSitePage().getExpiration().getText();
		String CardNumber = loginPage.getSitePage().getCardNumber().getText();
		Reporter.log("orderID :"+orderID);
		Reporter.log("OrderStatus :"+OrderStatus);
		Reporter.log("AuthCode :"+AuthCode);
		Reporter.log("OrderDate :"+OrderDate);
		Reporter.log("ExpirationDate :"+ExpirationDate);
		Reporter.log("CardNumber :"+CardNumber);
		
		Assert.assertNotNull(orderID);
		Assert.assertEquals(OrderStatus, "PendingCapture","Statuse verifyed sucessfully");
        
		//Close the broser
		waitBeforeClosingBrowser();
	}
}
