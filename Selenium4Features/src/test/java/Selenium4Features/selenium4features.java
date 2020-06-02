package Selenium4Features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium4features {

	//@Test
	public void screenshotWebelement() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		File src =logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("logo.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(5000);
		driver.quit();
	}
	
	//@Test
	public void newtab() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://demo.guru99.com/V4/manager/addcustomerpage.php");
		Thread.sleep(5000);
		driver.quit();
	}
	
	//@Test
	public void newwindow() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("http://demo.guru99.com/V4/manager/addcustomerpage.php");
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void ObjectLocation() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		System.out.println("height:" + logo.getRect().getHeight());
		System.out.println("width:" + logo.getRect().getWidth());
		System.out.println("x cordinates:" + logo.getRect().getX());
		System.out.println("y cordinates:" + logo.getRect().getY());
		System.out.println("height:" + logo.getRect().getDimension().getHeight());
		System.out.println("width:" + logo.getRect().getDimension().getWidth());
}

} 