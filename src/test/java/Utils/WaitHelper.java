package Utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {

    public static void waitForElement(AppiumDriver driver, By locator, int timeout) {
        new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
