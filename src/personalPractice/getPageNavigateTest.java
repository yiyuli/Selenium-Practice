package personalPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageNavigateTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/liyiyu1/Downloads/chromedriver");
		String baseURL = "https://www.nytimes.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);

		String expectedTitle = "The New York Times - Breaking News, World News & Multimedia";
		String actualTitle = "";

		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		driver.get("https://www.ft.com/");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());	// should be https://www.nytimes.com/
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());	// should be https://www.ft.com/
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());	// should be https://www.google.com/
		driver.quit();

	}

}
