package Pages;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver;
    Utils utils;

    By regLink = By.className("ico-register");
    By genderSelection = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dayOfBirth = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    By monthOfBirth = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    By yearOfBirth = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
    By emailSection = By.id("Email");
    By passwordSection = By.id("Password");
    By confirmPasswordSection = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");


    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);
    }

    public void clickOneRegLink(){
        utils.doClick(regLink);
    }

    public void doRegistration(String FirstName, String LastName, String Day, String Month, String Year, String Email, String Password, String ConfirmPassword){
        utils.doClick(genderSelection);
        utils.doSendKeys(firstName, FirstName);
        utils.doSendKeys(lastName, LastName);
        utils.doSendKeys(dayOfBirth, Day);
        utils.doSendKeys(monthOfBirth,Month);
        utils.doSendKeys(yearOfBirth, Year);
        utils.doSendKeys(emailSection, Email);
        utils.doSendKeys(passwordSection,Password);
        utils.doSendKeys(confirmPasswordSection,ConfirmPassword);
        utils.doClick(registerButton);
    }
}
