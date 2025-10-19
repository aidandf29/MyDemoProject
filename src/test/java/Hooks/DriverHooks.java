package Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverHooks {

    public static AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("deviceName", "sdk_gphone64_x86_64");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "16");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage", "com.saucelabs.mydemoapp.android");
        cap.setCapability("appActivity", "com.saucelabs.mydemoapp.android.view.activities.SplashActivity");

        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, cap);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
