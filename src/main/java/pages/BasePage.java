package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    public WebElement findElement(By by) {
        return DriverManager.getDriver().findElement(by);
    }
}