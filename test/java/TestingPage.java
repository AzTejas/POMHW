import Base.BasePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Properties;

public class TestingPage {

    WebDriver driver;
    BasePage basePage;
    Properties prop = new Properties();
    RegistrationPage regPage;
    LoginPage loginPage;

    @BeforeClass
    public void openBrowser(){
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));

        regPage = new RegistrationPage(driver);
    }
    @Test(priority = 1)
    public void registrationPage(){
        regPage.clickOneRegLink();
        regPage.doRegistration(prop.getProperty("firstname"),prop.getProperty("lastname"),prop.getProperty("dayofbirth"),prop.getProperty("monthofbirth"),prop.getProperty("yearofmonth"),prop.getProperty("email"),prop.getProperty("password"),prop.getProperty("confirmpassword"));
    }
//    @Test(priority = 2)
//    public void loginPage(){
//        loginPage.clickOnLoginLink();
//        loginPage.doLogin(prop.getProperty("email"),prop.getProperty("password"));
//    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
