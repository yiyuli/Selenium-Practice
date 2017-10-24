package personalPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
	public static void main(String[] args) {
		String baseUrl = "https://www.nytimes.com/";
		System.setProperty("webdriver.chrome.driver",
				"/Users/liyiyu1/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);

		driver.findElement(By.linkText("World")).click();
		System.out.println(driver.getCurrentUrl());	// shoudl be https://www.nytimes.com/section/world?action=click&pgtype=Homepage&region=TopBar&module=HPMiniNav&contentCollection=World&WT.nav=page

		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Wor")).click();
		System.out.println(driver.getCurrentUrl());	// should be https://www.nytimes.com/section/world?action=click&pgtype=Homepage&region=TopBar&module=HPMiniNav&contentCollection=World&WT.nav=page

		driver.navigate().back();

		driver.quit();
	}
}
