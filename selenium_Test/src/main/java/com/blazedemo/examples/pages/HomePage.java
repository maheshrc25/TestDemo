package com.blazedemo.examples.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	/** Default timeout of waiting for web elements in the page. */
	private final int DEFAULT_ELEMENT_TIMEOUT = 30;
	private final String XPATH_CHILD_ELEMENTS_LOCATOR = ".//*";
	private final String URL = "https://blazedemo.com/";

	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Constructor /////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////

	public HomePage(WebDriver driver) {
		PageFactory.initElements(
				new AjaxElementLocatorFactory(
				        driver, DEFAULT_ELEMENT_TIMEOUT), this);
	}

	/////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Web Elements ////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////

	/** Define the web element of title image by class name. */
	@FindBy(xpath ="//div[@class='container']/following::h1")
	private WebElement pageHeadertext;

	@FindBy(xpath ="//div[@class='container']/following::h3")
	private WebElement flightFromTo;
	
	@FindBy(xpath ="//div[@class='container']/p")
	private WebElement flightdetails;

	@FindBy(xpath ="//div[@class='container']/following::h2")
	private WebElement detailsPageHeadertext;
	
	/** Define the web element of title image by class name. */
	@FindBy(xpath ="//select[@name='fromPort']")
	private WebElement fromPort;
	
	/** Define the web element of title image by class name. */
	@FindBy(xpath ="//select[@name='toPort']")
	private WebElement toPort;
	
	/** Define the web element of title image by class name. */
	@FindBy(className = "form-control")
	private WebElement textBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement sButton;
	
	@FindBy(name = "submitEnabled")
	private WebElement submitButton;
	
	@FindBy(xpath ="//td[text()='Id']/following::td[1]")
	private WebElement orderID;
	
	public WebElement getOrderID() {
		return orderID;
	}

	@FindBy(xpath ="//td[text()='Status']/following::td[1]")
	private WebElement Status;
	
	public WebElement getStatus() {
		return Status;
	}

	@FindBy(xpath ="//td[text()='Amount']/following::td[1]")
	private WebElement Amount;
	
	public WebElement getAmount() {
		return Amount;
	}

	@FindBy(xpath ="//td[text()='Card Number']/following::td[1]")
	private WebElement CardNumber;
	
	public WebElement getCardNumber() {
		return CardNumber;
	}

	@FindBy(xpath ="//td[text()='Expiration']/following::td[1]")
	private WebElement Expiration;
	
	public WebElement getExpiration() {
		return Expiration;
	}

	@FindBy(xpath ="//td[text()='Auth Code']/following::td[1]")
	private WebElement AuthCode;
	
	public WebElement getAuthCode() {
		return AuthCode;
	}

	@FindBy(xpath ="//td[text()='Date']/following::td[1]")
	private WebElement Date;
	
	
	
    public WebElement getDate() {
		return Date;
	}

	@FindBy(id = "amazingText")
	private WebElement feedbackText;
   
    @FindBy(id = "inputName")
 	private WebElement inputName;
	
    public WebElement getInputName() {
		return inputName;
	}

	@FindBy(id = "address")
 	private WebElement address;
    
    public WebElement getAddress() {
		return address;
	}

	@FindBy(id = "city")
 	private WebElement city;
    
    public WebElement getCity() {
		return city;
	}
    @FindBy(id = "cardType")
 	private WebElement cardType;
    
	public WebElement getCardType() {
		return cardType;
	}

	@FindBy(id = "state")
 	private WebElement state;
    
    public WebElement getState() {
		return state;
	}

	@FindBy(id = "zipCode")
 	private WebElement zipCode;
    
    public WebElement getZipCode() {
		return zipCode;
	}

	@FindBy(id = "creditCardNumber")
 	private WebElement creditCardNumber;
    public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	@FindBy(id = "creditCardMonth")
 	private WebElement creditCardMonth;
    public WebElement getCreditCardMonth() {
		return creditCardMonth;
	}

	@FindBy(id = "creditCardYear")
 	private WebElement creditCardYear;
    
    public WebElement getCreditCardYear() {
		return creditCardYear;
	}

	@FindBy(id = "nameOnCard")
   	private WebElement nameOnCard;
	
	public WebElement getNameOnCard() {
		return nameOnCard;
	}
	public WebElement getButton() {
		return sButton;
	}
	public WebElement getflightFromTo() {
		return flightFromTo;
	}

	public WebElement getPageHeadertext() {
		return pageHeadertext;
	}
	
	public WebElement getdetailsPageHeadertext() {
		return detailsPageHeadertext;
	}
	public WebElement getflightdetails() {
		return flightdetails;
	}
	
	public WebElement getSlectDeparcherCity() {
		return fromPort;
	}
	
	public WebElement getSlectdestinationCity() {
		return toPort;
	}
	
	
	public WebElement getTextBox() {
		return textBox;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	

	public WebElement getTextAfterSubmit() {
		return feedbackText;
	}

    public String getURL() {
            return URL;
    }
    
    public boolean chooseYourOption(WebElement element,String city) {
	   
	 Select se = new Select(element);
    se.selectByVisibleText(city);
	return false;
    	
    }
}
