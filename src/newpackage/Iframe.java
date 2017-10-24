package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.NoSuchElementException;

public class Iframe {
	public static void main(String[] args) throws NoSuchElementException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/liyiyu1/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/guru99home/");
		driver.manage().window().maximize();

//		int size = driver.findElements(By.tagName("iframe")).size();
//
//		for (int i = 0; i <= size; i++) {
//			driver.switchTo().frame(i);
//			int total = driver.findElements(By.xpath("html/body/a/img")).size();
//			System.out.println(total);
//			driver.switchTo().defaultContent();
//		}

		driver.switchTo().frame(1); // Switching to the frame
		System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("//html/body/a/img")).click();

		System.out.println("*********We are done***************");
		driver.quit();

		// driver.get("Url");
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//
		// int size = driver.findElements(By.tagName("iframe")).size();
		// System.out.println("Total Frames --" + size);
		//
		// // prints the total number of frames
		// driver.switchTo().frame(0); // Switching the Outer Frame
		// System.out.println
		// (driver.findElement(By.xpath("xpath of the outer element ")).getText());
		//
		// //Printing the text in outer frame
		// size = driver.findElements(By.tagName("iframe")).size();
		// // prints the total number of frames inside outer frame
		//
		// System.out.println("Total Frames --" + size);
		// driver.switchTo().frame(0); // Switching to innerframe
		// System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());
		//
		// //Printing the text in inner frame
		// driver.switchTo().defaultContent();
	}
}
