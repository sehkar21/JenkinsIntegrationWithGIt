package com.qa.TestCases;





import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.Base.BasePage;
import com.qa.Config.Readconfig;
import com.qa.pages.LoginPage;


public class LoginTest extends BasePage{

	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		BasePage bs =new  BasePage();
		Readconfig config = new Readconfig();
		String Url = config.ApplicationUrl();
		driver = bs.openbrowser("chrome");
		driver.get(Url);
		log.info("***************URL Entered***************");
	}
	
	@Test(priority=1 , enabled=true)
	public void Login() throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		Readconfig config = new Readconfig();
		login.setusername().sendKeys(config.AppUsername());
		login.setpassword().sendKeys(config.AppPassword());
		login.Login().click();
		/*
		 * Thread.sleep(5000); login.Logout().click();
		 * 
		 * Alert alert = driver.switchTo().alert(); alert.accept();
		 */
		log.info("****************logging into the Apllication*************");
	}
	
	@DataProvider(name="LoginData")
	public Object[][] getLoginInvaliData(){
		Object data[][] = { 
									{"test11111@gmail.com", "test123"},  //different combinations of Login data using DataProvider
									{"test2@gmail.com", " "}, 
									{"  ", "test12345"}, 
									{"test", "test"},
									{"   " , "   "},
									{"mngr260582", "rEdabYp"}
						    };
		
		return data;
	}
	
	
	
	@Test(priority=2, dataProvider= "LoginData" ,enabled =false)
	public void DataDriven(String Username ,String Password) throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		login.setusername().sendKeys(Username);
		login.setpassword().sendKeys(Password);
		login.Login().click();
		Thread.sleep(5000);
		login.Logout().click();
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		
	}
	
	@AfterClass(alwaysRun=true)
	public void teardown() {
		driver.quit();
	}
	
}
