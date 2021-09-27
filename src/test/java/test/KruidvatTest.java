package test;

import driver.DriverManager;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import pages.CartPage;
import pojo.CreateCartResponse;
import utils.Template;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.CoreMatchers.equalTo;

public class KruidvatTest {
    DriverManager driverManager;
    CartPage cartPage = new CartPage();

    @Test
    public void addToCartTest() {
        CreateCartResponse createCartResponse =
                given().
                        when().
                        post("https://www.kruidvat.nl/api/v2/kvn/users/anonymous/carts/").
                        as(CreateCartResponse.class);

        Map<String, Object> cartValues = new HashMap<>();
        cartValues.put("code", "2876350");
        cartValues.put("quantity", "1");

        String request = Template.getTemplate("postCart.txt", cartValues);
        given().
                header("Content-Type", "application/json").
                body(request).
                post("https://www.kruidvat.nl/api/v2/kvn/users/anonymous/carts/" + createCartResponse.getGuid() + "/entries").
                then().log().ifValidationFails().
                assertThat().
                statusCode(200).
                and().
                contentType(ContentType.JSON).
                body(matchesJsonSchemaInClasspath("cartResponseSchema.json")).
                body("entry.product.code", equalTo("2876350")).
                body("quantity", equalTo(1)).
                body("quantityAdded", equalTo(1));

        cartPage.openCartPage();
        driverManager.getDriver().manage().deleteAllCookies();
        driverManager.getDriver().manage().addCookie(new Cookie("kvn-cart", createCartResponse.getGuid()));
        driverManager.getDriver().navigate().refresh();
        cartPage.clickOnAcceptButton();
        cartPage.clickOutside();
        Assert.assertEquals("Added incorrect product to the cart!", "Kruidvat Sensitive Handzeep Navulling", cartPage.getTextOfProductTitle());
        driverManager.quitDriver();
    }
}