package com.qa.Config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	
	Properties prop;
	
	public Readconfig()  {
		File src = new File("C:\\Users\\sehkar\\eclipse-workspace\\Guru99TestNG\\Configurations\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e){
			System.out.println("Exception is : "+ e.getMessage());
			
		}
	}
	
	public String ApplicationUrl() {
		String url = prop.getProperty("url");
		return url;
	}
	
	public String AppUsername() {
		String user = prop.getProperty("Username");
		return user;
	}
	public String AppPassword() {
		String pwd = prop.getProperty("password");
		return pwd;
	}
	
	public String AppBrowser() {
		String browser = prop.getProperty("browser");
		return browser;
	}
}
