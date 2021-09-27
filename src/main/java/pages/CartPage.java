package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartPage extends BasePage {
    private static final String cartPage_URL = "https://www.kruidvat.nl/cart";
    private static final String acceptButton = "//*[@id='onetrust-accept-btn-handler']";
    private static final String productTitle = "//img[@class='product-summary__img-link__tag']";

    public void openCartPage() {
        DriverManager.getDriver().get(cartPage_URL);
    }

    public WebElement acceptButton() {
        return findElement(By.xpath(acceptButton));
    }

    public void clickOnAcceptButton() {
        acceptButton().click();
    }

    public void clickOutside() {
        Actions action = new Actions(DriverManager.getDriver());
        action.moveByOffset(50, 50).click().build().perform();
    }

    public WebElement productTitle() {
        return findElement(By.xpath(productTitle));
    }

    public String getTextOfProductTitle() {
        return productTitle().getAttribute("title");
    }
}