package Grid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUsingChromeInWindows {

	WebDriver driver;
	
	@Test(priority=1)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test(priority=2)
	public void login() {
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sehkar21@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("csksehkar5");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		String text = driver.findElement(By.xpath("//strong[contains(text(),'sehkar21')]")).getText();
		if(text.contains("sehkar21")) {
			System.out.println("Test passsed");
		}
		else 
		{
			System.out.println("Test failed");
		}
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
