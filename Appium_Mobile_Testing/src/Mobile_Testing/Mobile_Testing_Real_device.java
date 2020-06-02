package Mobile_Testing;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile_Testing_Real_device {

public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ROG_phone2");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		
		dc.setCapability("appPackage" , "com.google.android.apps.messaging");
		dc.setCapability("appActivity", "com.google.android.apps.messaging.home.HomeActivity");
			
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,dc);	
		
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("com.google.android.apps.messaging:id/start_new_conversation_button").click();
		driver.findElementById("com.google.android.apps.messaging:id/contact_details").click();
		Thread.sleep(5000);
		driver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("Hi This is Automated Msg ignore It");
		driver.findElementById("com.google.android.apps.messaging:id/send_message_button_container").click();
	
}
}