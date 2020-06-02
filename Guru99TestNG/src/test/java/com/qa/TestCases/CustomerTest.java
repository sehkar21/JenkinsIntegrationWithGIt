package com.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Base.BasePage;
import com.qa.pages.CustomerPage;
import com.qa.utility.XLUtils;



public class CustomerTest extends LoginTest{

	@Test(priority=3,enabled=true)
	public void Customer() throws InterruptedException {
		CustomerPage cus = new CustomerPage(driver);
		cus.NewCustomer().click();
		
		String Name = randomAlphabetic(); // randomAlphabetic
		cus.CustomerName().sendKeys(Name);
		
		cus.FRadio_Btn().click();
		cus.DOB().sendKeys("15-08-1997");
		cus.Address().sendKeys("147 TTV Nagar");
		cus.City().sendKeys("Chennai");
		cus.State().sendKeys("TN");
		cus.PinCode().sendKeys("600100");
		
		String mobile = randomNumeric();  //randomNumeric
		cus.Mobile().sendKeys(mobile);
		
		String mail = randomAlphabetic()+"@gmail.com";  //randomAlphabetic + gmail.com
		cus.Email().sendKeys(mail);
		
		cus.Password().sendKeys("deskasdas");
		cus.Submit_Btn().click();
		Thread.sleep(5000);
		String Message = cus.SuccessMsg().getText();
		Assert.assertEquals(Message, "Customers Registered Successfully!!!");
		
	}
	
	
	@Test(priority=5,dataProvider = "LoginDatas",enabled=false)
	public void DataDriven(String Name, String DOB, String Address, String City, String State, String PinCode, String mobile, String mail , String Password) throws InterruptedException, IOException {
		CustomerPage cus = new CustomerPage(driver);
		cus.NewCustomer().click();
		cus.CustomerName().sendKeys(Name);
		cus.FRadio_Btn().click();
		cus.DOB().sendKeys(DOB);
		cus.Address().sendKeys(Address);
		cus.City().sendKeys(City);
		cus.State().sendKeys(State);
		cus.PinCode().sendKeys(PinCode);
		cus.Mobile().sendKeys(mobile);
		cus.Email().sendKeys(mail);
		cus.Password().sendKeys(Password);
		cus.Submit_Btn().click();
		
		Thread.sleep(5000);
		String Message = cus.SuccessMsg().getText();
		Assert.assertEquals(Message, "Customer Registered Successfully!!!");
		
		BasePage base = new BasePage();
		base.getScreenshot();
		
	}
	
	
	@DataProvider(name="LoginDatas")
	String[][] getData() throws IOException
	{
		
		String path = "C:\\Users\\sehkar\\eclipse-workspace\\Guru99TestNG\\src\\main\\java\\com\\qa\\TestData\\GuruDDTCus.xlsx";
		
		int rowcount = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1",1);
		String LoginData[][]=new String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				
				LoginData[i-1][j]= XLUtils.getCellData(path, "Sheet1", i,j);
			}
		}
		
		return LoginData;
		
	}
	
	
	
	
	
	
}
