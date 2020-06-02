package HeadlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sehkar\\eclipse-workspace\\HeadlessBrowser\\driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/V4/");
		System.out.println("the title of the website is : " + driver.getTitle());
		
	}
}
