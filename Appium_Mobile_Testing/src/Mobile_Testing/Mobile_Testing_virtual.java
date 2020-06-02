package Mobile_Testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile_Testing_virtual {

	public static void main(String[] args) throws MalformedURLException  {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 10.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability(MobileCapabilityType.APP,"D:\\Appium\\Mobi_Usage_AppBackup\\Apk Info.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		
		AppiumDriver<WebElement> driver = new AppiumDriver<WebElement>(url,dc);
		
		
	}
	
}
