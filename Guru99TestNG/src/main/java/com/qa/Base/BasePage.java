package com.qa.Base;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public  WebDriver driver;
	
	public Logger log = LogManager.getLogger(this.getClass());
	
	
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	
	public static synchronized WebDriver getdriver() 
	{
		return tldriver.get();
	}
	
	@Parameters("Browser")
	
	public WebDriver openbrowser( String br) {
		
		if(br.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		if(br.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		if(br.equals("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		
		}
		tldriver.set(driver);
		return getdriver();
	}
	
	public String randomAlphabetic() {
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);
	}

	public static String randomNumeric() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}
	
	public String getScreenshot() {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		File src = ((TakesScreenshot)getdriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + timeStamp+ ".png";
		File dest = new File(path);
		try {
		FileUtils.copyFile(src, dest);
		}
		catch(IOException e) {
			System.out.println("screenshot captured failed...");
		}
		return path;
	}
	
	public String getFailureScreenshots() {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		File src = ((TakesScreenshot)getdriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/failureScreenshots/" + System.currentTimeMillis() + timeStamp+ ".png";
		File dest = new File(path);
		try {
		FileUtils.copyFile(src, dest);
		}
		catch(IOException e) {
			System.out.println("screenshot captured failed...");
		}
		return path;
	}
	
	
}
