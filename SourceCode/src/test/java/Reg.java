import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class Reg {
    public static void main(String[] args) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("f913c22b")
                .setApp("C:/Users/user/Downloads/app-release.apk");
        AndroidDriver driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://127.0.0.1:4723"), options
        );
        try {
            // register with correct credentials
            WebElement logoutbutton = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
            logoutbutton.click();
            WebElement registerbutton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"));
            registerbutton.click();
            WebElement fullnamefield = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            fullnamefield.click();
            fullnamefield.sendKeys("yari23ard13");
            WebElement emailfield = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            emailfield.click();
            emailfield.sendKeys("ardia@mail23123.com");
            WebElement passwordfield = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"));
            passwordfield.click();
            passwordfield.sendKeys("123234245");
            WebElement regbutton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"));
            regbutton.click();
            // register with blank fullname field
            WebElement logout1button = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
            logout1button.click();
            WebElement register1button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"));
            register1button.click();
            WebElement fullname1field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            fullname1field.click();
            fullname1field.sendKeys("");
            WebElement email1field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            email1field.click();
            email1field.sendKeys("ardi@mail.com");
            WebElement password1field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"));
            password1field.click();
            password1field.sendKeys("12345");
            WebElement reg1button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"));
            reg1button.click();
            // register with blank email field
            WebElement fullname2field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            fullname2field.click();
            fullname2field.sendKeys("yariar");
            WebElement email2field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            email2field.click();
            email2field.sendKeys("");
            WebElement password2field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"));
            password2field.click();
            password2field.sendKeys("12345");
            WebElement reg2button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"));
            reg2button.click();
            // register with blank password field
            WebElement fullname3field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            fullname3field.click();
            fullname3field.sendKeys("yariar");
            WebElement email3field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            email3field.click();
            email3field.sendKeys("ardi@mail.com");
            WebElement password3field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"));
            password3field.click();
            password3field.sendKeys("");
            WebElement reg3button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"));
            reg3button.click();
            // register with blank fullname and email
            WebElement fullname4field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            fullname4field.click();
            fullname4field.sendKeys("");
            WebElement email4field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            email4field.click();
            email4field.sendKeys("");
            WebElement password4field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"));
            password4field.click();
            password4field.sendKeys("12345");
            WebElement reg4button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"));
            reg4button.click();
            // register with blank fullname and password
            WebElement fullname5field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            fullname5field.click();
            fullname5field.sendKeys("");
            WebElement email5field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            email5field.click();
            email5field.sendKeys("ardi@mail.com");
            WebElement password5field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"));
            password5field.click();
            password5field.sendKeys("");
            WebElement reg5button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"));
            reg5button.click();
            // register with blank email and password
            WebElement fullname6field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            fullname6field.click();
            fullname6field.sendKeys("yariar");
            WebElement email6field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            email6field.click();
            email6field.sendKeys("");
            WebElement password6field = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"));
            password6field.click();
            password6field.sendKeys("");
            WebElement reg6button = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"));
            reg6button.click();
            driver.getPageSource();
        } finally {
            driver.quit();
        }
    }
}
