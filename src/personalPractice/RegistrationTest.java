package personalPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
 * Use the sample website on way2automation to test registration automation.
 * Automation includes mainly element extraction, textbox input, checkbox checking, 
 * radio button checking, form input, button click, file uploading.
 */
public class RegistrationTest {
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver",
				"/Users/liyiyu1/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://way2automation.com/way2auto_jquery/registration.php";
		driver.get(baseUrl);
		
		// find elements
		WebElement firstName = driver.findElement(By.name("name"));
		WebElement lastName = driver.findElement(By.xpath("//html/body/section/div/div/div/form/fieldset[1]/p[2]/input"));
		WebElement phone = driver.findElement(By.name("phone"));
		WebElement about = driver.findElement(By.cssSelector("textarea[rows='5']"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement pwd = driver.findElement(By.cssSelector("input[name='password']"));
		WebElement repwd = driver.findElement(By.name("c_password"));
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		// no ways to use css.selector contains, have to use xpath
		WebElement singleButton = driver.findElement(By.xpath("//html/body/section/div/div/div/form/fieldset[2]/div/label[1]/input"));
		WebElement cricketButton = driver.findElement(By.xpath("//html/body/section/div/div/div/form/fieldset[3]/div/label[3]/input"));
		// drop-down
		Select monthDrop = new Select(driver.findElement(By.xpath("//html/body/section/div/div/div/form/fieldset[5]/div[1]/select")));
		Select dayDrop = new Select(driver.findElement(By.xpath("//html/body/section/div/div/div/form/fieldset[5]/div[2]/select")));
		Select yearDrop = new Select(driver.findElement(By.xpath("//html/body/section/div/div/div/form/fieldset[5]/div[3]/select")));
		//upload
		WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));
		
		// fill content
		firstName.sendKeys("John");
		lastName.sendKeys("Lee");
		phone.sendKeys("2178888888");
		about.sendKeys("UIUC CS527 Student");
		email.sendKeys("JL@illinois.edu");
		pwd.sendKeys("123456");
		repwd.sendKeys("123456");
		
		monthDrop.selectByVisibleText("1");
		dayDrop.selectByVisibleText("1");
		yearDrop.selectByVisibleText("1");
		
		upload.sendKeys("/Users/liyiyu1/Downloads/test.pdf");
		upload.click();
		
		singleButton.click();
		cricketButton.click();
		if (singleButton.isSelected()) {
			System.out.println("Single is Toggled On");

		}
		if (cricketButton.isSelected()) {
			System.out.println("Cricket is Toggled On");

		}
		
		submit.submit();
		
		
		driver.quit();
	}
}
