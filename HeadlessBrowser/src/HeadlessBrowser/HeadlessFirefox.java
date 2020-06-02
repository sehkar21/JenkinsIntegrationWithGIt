package HeadlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {
	
public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sehkar\\eclipse-workspace\\HeadlessBrowser\\driver\\geckodriver.exe");
	FirefoxOptions options = new FirefoxOptions();
	options.setHeadless(true);
	WebDriver driver = new FirefoxDriver(options);
	driver.get("http://demo.guru99.com/V4/");
	System.out.println("the title of the website is : " + driver.getTitle());
	
}
}
