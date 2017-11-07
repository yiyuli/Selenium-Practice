package pageFactoryPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoginWithPageFactory {
	WebDriver driver;
    Login objLogin;
    HomePage objHomePage;

    @BeforeTest
    public void setup(){
    	System.setProperty("webdriver.chrome.driver",
				"/Users/liyiyu1/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
    }

    @Test(priority=0)
    	public void test_Home_Page_Appear_Correct(){
    	objLogin = new Login(driver);
    	String loginPageTitle = objLogin.getLoginTitle();
    	Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
    	objLogin.loginToGuru99("mngr104317", "ysupuje");
    	objHomePage = new HomePage(driver);
    	Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr104317"));
    }
}
