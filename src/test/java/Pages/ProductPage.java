package Pages;

import Hooks.DriverHooks;
import Utils.WaitHelper;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class ProductPage {

    private final By backpackProduct = By.xpath("//android.widget.ImageView[@content-desc=\"Sauce Lab Back Packs\"]");
    private final By quantityText = By.id("com.saucelabs.mydemoapp.android:id/noTV");
    private final By plusButton = By.id("com.saucelabs.mydemoapp.android:id/plusIV");
    private final By blueColor = new AppiumBy.ByAndroidUIAutomator("new UiSelector().description(\"Blue color\")");
    private final By addToCartBtn = By.id("com.saucelabs.mydemoapp.android:id/cartBt");
    private final By cartIcon = By.id("com.saucelabs.mydemoapp.android:id/cartIV");

    public void openBackpackProduct() {
        WaitHelper.waitForElement(DriverHooks.driver, backpackProduct, 1);
        DriverHooks.driver.findElement(backpackProduct).click();
    }

    public void increaseQuantityTo(int qty) {
        String currentQtyText = DriverHooks.driver.findElement(quantityText).getText();
        int currentQty = Integer.parseInt(currentQtyText);

        while (currentQty < qty) {
            DriverHooks.driver.findElement(plusButton).click();
            currentQty++;
        }
    }

    public void chooseBlueColorAndAddToCart() {
        DriverHooks.driver.findElement(blueColor).click();
        DriverHooks.driver.findElement(addToCartBtn).click();
        DriverHooks.driver.findElement(cartIcon).click();
    }

    public String getFinalQuantity() {
        return DriverHooks.driver.findElement(quantityText).getText();
    }
}
