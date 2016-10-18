package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.SignInAction;
import modules.SignOutAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.util.HashMap;


public class ShoppingCart {
    private WebDriver driver;
    private HashMap<String, String> data = null;


    public ShoppingCart() {
        driver = Hooks.driver;
        data = new HashMap<>();
        data.put("username", "abc@xyz.com");
        data.put("password", "Test@123");
    }

    @When("^I go to the website$")
    public void i_go_to_the_website() throws Throwable {
        driver.get("http://automationpractice.com");
        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, LoginPage.class);
    }

    @When("^I sign in$")
    public void i_sign_in() throws Throwable {
        SignInAction.Execute(driver, data);
    }

    @Then("^I sign out$")
    public void i_sign_out() throws Throwable {
        SignOutAction.Execute(driver);
    }

}