import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class beli {
    public static void main(String[] args) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("f913c22b")
                .setApp("C:/Users/user/Downloads/app-release.apk");
        AndroidDriver driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://127.0.0.1:4723"), options
        );
        try {

        } finally {
            WebElement logoutbutton = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
            logoutbutton.click();
            WebElement emailfield = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            emailfield.click();
            emailfield.sendKeys("yari@mail.com");
            WebElement passwordfield = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            passwordfield.click();
            passwordfield.sendKeys("123");
            WebElement loginbutton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
            loginbutton.click();
            WebElement belibutton = driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]"));
            belibutton.click();
            WebElement cartbutton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"0\"]"));
            cartbutton.click();
            driver.quit();
        }
    }
}