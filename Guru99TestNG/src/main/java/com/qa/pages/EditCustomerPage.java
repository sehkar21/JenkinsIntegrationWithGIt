package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.WaitHelper;

public class EditCustomerPage {

	public WebDriver ldriver;
	WaitHelper waithelp;
	
	public EditCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelp = new WaitHelper(rdriver);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Edit Customer')]")
	@CacheLookup
	WebElement EditCustomer;
	
	@FindBy(xpath="//input[@name='cusid']")
	@CacheLookup
	WebElement CustomerId;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[11]/td[2]/input[1]")
	@CacheLookup
	WebElement Submit_Id_Btn;
	
	@FindBy(xpath="//textarea[@name='addr']")
	@CacheLookup
	WebElement CustomerAddress;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	@CacheLookup
	WebElement CustomerMobile;
	
	@FindBy(xpath="//input[@name='sub']")
	@CacheLookup
	WebElement Submit_Cus_Btn;
	
	@FindBy(xpath="/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/p[1]")
	@CacheLookup
	WebElement SuccessMsg;
	

	public WebElement EditCustomer() {
		waithelp.WaitForElement(EditCustomer, 30);
		return EditCustomer;
	}
	
	public WebElement CustomerId() {
		waithelp.WaitForElement(CustomerId, 30);
		return CustomerId;
		
	}
	
	public WebElement Submit_Id_Btn() {
		waithelp.WaitForElement(Submit_Id_Btn, 30);
		return Submit_Id_Btn;
	}
	
	public WebElement CustomerAddress() {
		waithelp.WaitForElement(CustomerAddress, 30);
		return CustomerAddress;
	}
	
	public WebElement CustomerMobile() {
		waithelp.WaitForElement(CustomerMobile, 30);
		return CustomerMobile;
	}
	
	public WebElement Submit_Cus_Btn() {
		waithelp.WaitForElement(Submit_Cus_Btn, 30);
		return Submit_Cus_Btn;
		
	}
	
	public WebElement SuccessMsg() {
		waithelp.WaitForElement(SuccessMsg, 30);
		return SuccessMsg;
	}
	
}
