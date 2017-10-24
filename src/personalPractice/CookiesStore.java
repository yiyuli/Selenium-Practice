package personalPractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

public class CookiesStore {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/liyiyu1/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("//html/body/div[4]/div/div/div/div/div/form/div/div[1]/p/a"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("//html/body/div[4]/div/div/div/div/div/form/fieldset[1]/input"))
				.sendKeys("ghostlyy");
		driver.findElement(
				By.xpath("//html/body/div[4]/div/div/div/div/div/form/fieldset[2]/input"))
				.sendKeys("951753");
		driver.findElement(By.xpath("//html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")).click();
		File file = new File("Cookies.data");
		try {
			file.delete();
			file.createNewFile();
			FileWriter fileWrite = new FileWriter(file);
			BufferedWriter Bwrite = new BufferedWriter(fileWrite);
			for (Cookie ck : driver.manage().getCookies()) {
				Bwrite.write((ck.getName() + ";" + ck.getValue() + ";"
						+ ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));
				Bwrite.newLine();
			}
			Bwrite.flush();
			Bwrite.close();
			fileWrite.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		driver.quit();
	}
}
