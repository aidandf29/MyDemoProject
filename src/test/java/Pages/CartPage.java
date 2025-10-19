package Pages;

import Hooks.DriverHooks;
import Utils.WaitHelper;
import org.openqa.selenium.By;

public class CartPage {

    private final By cartProductName = By.id("com.saucelabs.mydemoapp.android:id/titleTV");
    private final By cartQty = By.id("com.saucelabs.mydemoapp.android:id/noTV");

    public String getProductName() {
        WaitHelper.waitForElement(DriverHooks.driver, cartProductName, 5);
        return DriverHooks.driver.findElement(cartProductName).getText();
    }

    public String getCartQuantity() {
        return DriverHooks.driver.findElement(cartQty).getText();
    }
}
