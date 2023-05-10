import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("f913c22b")
                .setApp("C:/Users/user/Downloads/app-release.apk");
        AndroidDriver driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://127.0.0.1:4723"), options
        );
        try {
            // User correct credentials
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
            // User login with incorrect email
            WebElement logout1button = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
            logout1button.click();
            WebElement email1field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            email1field.click();
            email1field.sendKeys("yabdakwdajwvhjhw.com");
            WebElement password1field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            password1field.click();
            password1field.sendKeys("123");
            WebElement login1button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
            login1button.click();
            // User login with incorrect password
            WebElement logout2button = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
            logout2button.click();
            WebElement email2field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            email2field.click();
            email2field.sendKeys("yari@mail.com");
            WebElement password2field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            password2field.click();
            password2field.sendKeys("123234235");
            WebElement login2button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
            login2button.click();
            // User login with incorrect email and password
            WebElement logout7button = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
            logout7button.click();
            WebElement email7field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            email7field.click();
            email7field.sendKeys("yari@maiadl.com");
            WebElement password7field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            password7field.click();
            password7field.sendKeys("123234235");
            WebElement login7button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
            login7button.click();
            // User login with blank email field
            WebElement logout3button = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
            logout3button.click();
            WebElement email3field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            email3field.click();
            email3field.sendKeys("");
            WebElement password3field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            password3field.click();
            password3field.sendKeys("123");
            WebElement login3button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
            login3button.click();
            // User login with blank password field
            WebElement logout4button = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
            logout4button.click();
            WebElement email4field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            email4field.click();
            email4field.sendKeys("yari@mail.com");
            WebElement password4field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            password4field.click();
            password4field.sendKeys("");
            WebElement login4button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
            login4button.click();
            // User login with blank field credentials
            WebElement logout5button = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
            logout5button.click();
            WebElement email5field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            email5field.click();
            email5field.sendKeys("");
            WebElement password5field = driver.findElement(AppiumBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            password5field.click();
            password5field.sendKeys("");
            WebElement login5button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
            login5button.click();
            driver.getPageSource();
        } finally {
            driver.quit();
        }
    }
}
