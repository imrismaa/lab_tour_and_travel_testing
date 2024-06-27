package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.RegisterPage;

import java.time.Duration;

public class RegisterSteps {
    WebDriver driver;
    RegisterPage registerPage;
    HomePage homePage;
    WebDriverWait wait;
    public RegisterSteps() {
        this.driver = Hooks.getDriver(); // Mendapatkan instance WebDriver dari Hooks
        this.registerPage = new RegisterPage(driver);
        this.homePage = new HomePage(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("User is on the register page")
    public void user_is_on_the_register_page() {
        driver.get("http://localhost:8001/Register");
        Hooks.test.log(Status.PASS, "user on register page");
    }

    @When("User submit valid credentials for register")
    public void user_submit_valid_credentials() throws InterruptedException {
        registerPage.enterFullName("Sakuraa3");
        registerPage.enterUsername("sakuchann3");
        registerPage.enterEmail("sakuchan32@gmail.com");
        registerPage.enterPassword("rahasia");
        registerPage.enterConfirmPassword("rahasia");
        registerPage.clickRegister();
        Hooks.test.log(Status.PASS, "user submit credential");
    }

    @Then("User should see a success message")
    public void user_see_a_success_message() throws InterruptedException {
        //verify the current URL
        Assert.assertTrue(registerPage.isAlertSuccessDisplayed());
        Hooks.test.log(Status.PASS, "user see a success message");
    }

    @When("User submit existing credentials for register")
    public void user_submit_existing_credentials() throws InterruptedException {
        registerPage.enterFullName("Adiel Boanerge G");
        registerPage.enterUsername("erge08");
        registerPage.enterEmail("erge_08@gmail.com");
        registerPage.enterPassword("rahasia");
        registerPage.enterConfirmPassword("rahasia");
        registerPage.clickRegister();
        Hooks.test.log(Status.PASS, "user submit existing credential");
    }

    @Then("User should see an error message")
    public void user_should_see_an_error_message() {
        Assert.assertTrue(registerPage.isErrorMessageDisplayed());
        Hooks.test.log(Status.PASS, "user see an error message");
    }

    @When("User submit invalid credentials for register")
    public void user_submit_invalid_credentials() throws InterruptedException {
        registerPage.enterFullName("");
        registerPage.enterUsername("erge08");
        registerPage.enterEmail("");
        registerPage.clickRegister();
        Hooks.test.log(Status.PASS, "user submit invalid credential");
    }
}
