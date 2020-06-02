package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.WaitHelper;

public class LoginPage {

	
		public WebDriver ldriver;
	
		WaitHelper waithelp;
		
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelp = new WaitHelper(rdriver);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	@CacheLookup
	WebElement Txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement Txt_password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	@CacheLookup
	WebElement Btn_Login;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	@CacheLookup
	WebElement Btn_Logout;
	
	
	
	
	
	
	
	public WebElement setusername() {
		waithelp.WaitForElement(Txt_username, 30);
		return Txt_username;
	}
	
	public WebElement setpassword() {
		waithelp.WaitForElement(Txt_password, 30);
		return Txt_password;
		
	}
	
	public WebElement Login() {
		waithelp.WaitForElement(Btn_Login, 30);
		return Btn_Login;
	}
	
	public WebElement Logout() {
		waithelp.WaitForElement(Btn_Logout, 30);
		return Btn_Logout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
