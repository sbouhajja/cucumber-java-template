package pageobjects;

import org.openqa.selenium.WebDriver;

abstract class BaseClass {
    private static WebDriver driver;
    private static boolean bResult;

    BaseClass(WebDriver driver) {
        BaseClass.driver = driver;
        BaseClass.bResult = true;
    }

}
