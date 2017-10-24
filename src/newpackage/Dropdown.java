package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class Dropdown {
 public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","/Users/liyiyu1/Downloads/chromedriver");
	    String baseURL = "http://demo.guru99.com/selenium/newtours/register.php";
	    WebDriver driver = new ChromeDriver();
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		driver.quit();
 }
}
