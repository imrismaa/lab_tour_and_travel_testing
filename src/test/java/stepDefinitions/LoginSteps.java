package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    public LoginSteps() {
        this.driver = Hooks.getDriver(); // Mendapatkan instance WebDriver dari Hooks
        this.loginPage = new LoginPage(driver);
        this.dashboardPage = new DashboardPage(driver);
    }
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("http://127.0.0.1:8001/Login");
        Hooks.test.log(Status.PASS, "user on login page");
    }
    @When("User submit valid credentials")
    public void user_submit_valid_credentials() throws InterruptedException {
        loginPage.enterUsername("naufal");
        loginPage.enterPassword("rahasia");
        loginPage.clickLogin();
        Hooks.test.log(Status.PASS, "user submit credential");
    }
    @Then("User should be redirected to the dashboard")
    public void user_should_be_redirected_to_the_dashboard() throws InterruptedException {

                //verify the current URL
        String expectedUrl = "http://127.0.0.1:8001/Dashboard";
        Assert.assertEquals(dashboardPage.getActualURL(), expectedUrl);
        Hooks.test.log(Status.PASS, "redirect to dashboard");

    }
}
