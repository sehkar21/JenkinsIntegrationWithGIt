package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.WaitHelper;


public class CustomerPage {

	
	public WebDriver ldriver;
	WaitHelper waithelp;
	
	public CustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelp = new WaitHelper(rdriver);
	}
	
	// 
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]	")
	@CacheLookup
	WebElement NewCustomer;
	
	@FindBy(xpath="//input[@name='name']")
	@CacheLookup
	WebElement CustomerName;
	
	@FindBy(xpath="//tr[5]//td[2]//input[2]")
	@CacheLookup
	WebElement FRadio_Btn;
	
	@FindBy(xpath="//input[@id='dob']")
	@CacheLookup
	WebElement DOB;
	
	@FindBy(xpath="//textarea[@name='addr']")
	@CacheLookup
	WebElement Address;
	
	@FindBy(xpath="//input[@name='city']")
	@CacheLookup
	WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	@CacheLookup
	WebElement State;
	
	@FindBy(xpath="//input[@name='pinno']")
	@CacheLookup
	WebElement PinCode;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	@CacheLookup
	WebElement Mobile;
	
	@FindBy(xpath="//input[@name='emailid']")
	@CacheLookup
	WebElement Email;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath="//input[@name='sub']")
	@CacheLookup
	WebElement Submit_Btn;
	
	@FindBy(xpath="/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/p[1]")
	@CacheLookup
	WebElement SuccessMsg;
	
	public WebElement NewCustomer() {
		waithelp.WaitForElement(NewCustomer, 30);
		return NewCustomer;
	}
	
	public WebElement CustomerName() {
		waithelp.WaitForElement(CustomerName, 30);
		return CustomerName;
	}
	
	public WebElement FRadio_Btn() {
		waithelp.WaitForElement(FRadio_Btn, 30);
		return FRadio_Btn;
	}
	
	public WebElement DOB() {
		waithelp.WaitForElement(DOB, 30);
		return DOB;
	}
	
	public WebElement Address() {
		waithelp.WaitForElement(Address, 30);
		return Address;
	}
	
	public WebElement City() {
		waithelp.WaitForElement(City, 30);
		return City;
	}
	
	public WebElement State() {
		waithelp.WaitForElement(State, 30);
		return State;
	}
	
	public WebElement PinCode() {
		waithelp.WaitForElement(PinCode, 30);
		return PinCode;
	}
	
	public WebElement Mobile() {
		waithelp.WaitForElement(Mobile, 30);
		return Mobile;
	}
	
	public WebElement Email() {
		waithelp.WaitForElement(Email, 30);
		return Email;
	}
	
	public WebElement Password() {
		waithelp.WaitForElement(Password, 30);
		return Password;
	}	
	
	public WebElement Submit_Btn() {
		waithelp.WaitForElement(Submit_Btn, 30);
		return Submit_Btn;
	}	
	
	public WebElement SuccessMsg() {
		waithelp.WaitForElement(SuccessMsg, 30);
		return SuccessMsg;
	}	
	
	
	
}
