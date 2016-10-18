package modules;

import config.Log;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;


public class SignOutAction {

    public static void Execute(WebDriver driver) throws Exception {
        HomePage.sign_out.click();
        Log.info("Sign out is performed");

    }
}
