package com.qa.TestCases;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.qa.pages.EditCustomerPage;





public class EditCustomerTest extends LoginTest {


	
	@Test(priority=4)
	public void EditCustomer() throws InterruptedException {
		
		EditCustomerPage edit = new EditCustomerPage(driver);
		edit.EditCustomer().click();
		edit.CustomerId().sendKeys("2012");
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement loginbutton = edit.Submit_Id_Btn();
		js.executeScript("arguments[0].click();",loginbutton);
		
		//edit.Submit_Id_Btn().click();
		
		String Address = "1234" + randomAlphabetic()+ "  "+ "Nagar";
		edit.CustomerAddress().sendKeys(Address);
		
		String Mobile = randomNumeric();
		edit.CustomerMobile().sendKeys(Mobile);
		
		edit.Submit_Cus_Btn().click();
		
		Thread.sleep(5000);
	
		String successMsg = 	edit.SuccessMsg().getText();
		
		Assert.assertEquals(successMsg, "Customer details updated Successfully!!!");
		
	}
	
	
	
}
