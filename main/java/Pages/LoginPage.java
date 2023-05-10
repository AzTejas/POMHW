package Pages;

import Utilities.Constant;
import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    Utils utils;
//    1.Create your object/object repo in the form of by Locators
    By loginLink = By.className("ico-login");
    By emailId = By.id("Email");
    By password = By.id("Password");
    By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

//    2.Create a constructor of page class
    public LoginPage(WebDriver driver){
        this.driver = driver;
        utils = new Utils(driver);

    }

//    3. Page Actions
    public void clickOnLoginLink(){
        utils.doClick(loginLink);
    }

    public String getPageTitle(){
        return utils.waitForTitlePresent(5, Constant.LOGIN_PAGE_TITLE);
    }

    public void doLogin(String Username, String Password){
        utils.doSendKeys(emailId, Username);
        utils.doSendKeys(password, Password);
        utils.doClick(loginButton);
    }

}
