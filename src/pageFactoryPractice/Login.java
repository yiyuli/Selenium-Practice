package pageFactoryPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    @FindBy(name="uid")
    WebElement user99GuruName;

    @FindBy(name="password")
    WebElement password99Guru;

    @FindBy(className="barone")
    WebElement titleText;

    @FindBy(name="btnLogin")
    WebElement login;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String strUserName){
        user99GuruName.sendKeys(strUserName);
    }

    public void setPassword(String strPassword){
    	password99Guru.sendKeys(strPassword);
    }

    public void clickLogin(){
        login.click();

    }

    public String getLoginTitle(){
    	return titleText.getText();
    }

    public void loginToGuru99(String strUserName,String strPasword){
        this.setUserName(strUserName);
        this.setPassword(strPasword);
        this.clickLogin();
    }
}
