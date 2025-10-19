package StepDefinitions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

import Hooks.DriverHooks;
import Pages.CartPage;
import Pages.ProductPage;

public class MyDemoApp {

    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @Given("the user launches the application")
    public void the_user_launches_the_application() {

    }

    @And("he selects product {string}")
    public void he_selects_product(String productName) {
        productPage.openBackpackProduct();
    }

    @When("he increases quantity to {int} and adds it to cart")
    public void he_increases_quantity_to_and_adds_it_to_cart(Integer qty) {
        productPage.increaseQuantityTo(qty);
        productPage.chooseBlueColorAndAddToCart();
    }

    @Then("the cart should display quantity {int}")
    public void the_cart_should_display_quantity(Integer expectedQty) {
        Assert.assertEquals(String.valueOf(expectedQty), cartPage.getCartQuantity());
    }

    @And("the product {string} should be shown in cart")
    public void the_product_should_be_shown_in_cart(String expectedProduct) {
        Assert.assertEquals(expectedProduct, cartPage.getProductName());
    }

}
