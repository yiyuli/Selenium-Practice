package personalPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;	
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;

public class PhantomJSAndHTMLUnit {
	public static void main(String[] args) {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Driver 1");
		System.out.println("working1");
		driver.quit();	
		
//        System.setProperty("phantomjs.binary.path", "/Users/liyiyu1/Downloads/chromedriver/phantomjs-2.1.1-macosx/bin/phantomjs");		
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setJavascriptEnabled(true); // enabled by default
//        caps.setCapability(
//            PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
//            "/Users/liyiyu1/Downloads/chromedriver/phantomjs-2.1.1-macosx/bin/phantomjs"
//        );       
//        driver = new PhantomJSDriver(caps);
//        driver.get("http://demo.guru99.com/V4/");
//		driver.findElement(By.name("uid")).sendKeys("Driver 2");
//		System.out.println("working2");
//		driver.quit();				
	}
}
