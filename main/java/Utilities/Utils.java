package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
    WebDriver driver;

    public Utils(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getElement(By locator){
        WebElement element = driver.findElement(locator);
        return element;
    }

    public void doClick(By locator){
        getElement(locator).click();
    }

    public void doSendKeys(By locator, String value){
        getElement(locator).sendKeys(value);
    }
    public String waitForTitlePresent(int timeout,String titleValue){
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.titleIs(titleValue));
        return driver.getTitle();
    }
}
