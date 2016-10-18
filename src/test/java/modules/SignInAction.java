package modules;

import config.Log;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.util.HashMap;

import static org.junit.Assert.assertFalse;


public class SignInAction {

    public static void Execute(WebDriver driver, HashMap<String, String> map) throws Exception {

        HomePage.sign_in.click();
        Log.info("Click action is perfromed on My Account link");

        LoginPage.email.sendKeys(map.get("username"));
        Log.info(map.get("username") + " is entered in UserName text box");

        LoginPage.password.sendKeys(map.get("password"));
        Log.info(map.get("password") + " is entered in Password text box");

        LoginPage.signin_button.click();
        Log.info("Click action is performed on Submit button");


        if (driver.getCurrentUrl().equalsIgnoreCase("http://automationpractice.com/index.php?controller=authentication")) {
            Log.info("Sign in is not performed");
            assertFalse(true);
        } else
            Log.info("Sign in is performed");
    }
}
