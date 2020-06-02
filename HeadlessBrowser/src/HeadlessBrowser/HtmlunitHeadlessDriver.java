package HeadlessBrowser;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlunitHeadlessDriver {

	public static void main(String[] args) {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://demo.guru99.com/V4/");
		System.out.println("the title of the website is : " + driver.getTitle());
		
		
		
		
		
	}
	
}
