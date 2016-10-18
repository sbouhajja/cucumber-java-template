package stepdefinitions;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;


public class SeleniumFramework {
    private WebDriver driver;

    public SeleniumFramework() {
        driver = Hooks.driver;
    }

    @When("^I go to selenium framework website$")
    public void i_go_to_selenium_framework_website() throws Throwable {
        driver.get("http://www.seleniumframework.com");
    }

    @Then("^I validate title and URL$")
    public void i_print_title_and_URL() throws Throwable {
        assertEquals(driver.getTitle(), "Selenium Framework | Selenium, Cucumber, Ruby, Java et al.");
        assertEquals(driver.getCurrentUrl(), "http://www.seleniumframework.com/");
    }

}