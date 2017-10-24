package personalPractice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"/Users/liyiyu1/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("/Users/liyiyu1/Downloads/screenshot.png");
		FileUtils.copyFile(SrcFile, DestFile);
		driver.quit();
	}
}
