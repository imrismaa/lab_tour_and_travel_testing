package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;

public class ManagePackageSteps {
    WebDriver driver;
    PackagePage packagePage;
    CreatePackagePage createPackagePage;
    UpdatePackagePage updatePackagePage;
    private WebDriverWait wait;

    public ManagePackageSteps() {
        this.driver = Hooks.getDriver(); // Get WebDriver instance from Hooks
        this.packagePage = new PackagePage(driver);
        this.createPackagePage = new CreatePackagePage(driver);
        this.updatePackagePage = new UpdatePackagePage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("a web browser is at list package page")
    public void a_web_browser_is_at_list_pakcage_page() {
        driver.get("http://127.0.0.1:8001/AdminPaketDestinasi");
        Hooks.test.log(Status.PASS, "user at package page");
    }

    @When("the user click Tambah Paket button")
    public void the_user_click_tambah_package_button() {
        packagePage.clickTambahPaket();
        Hooks.test.log(Status.PASS, "user click tambah paket button");
        String expectedUrl = "http://127.0.0.1:8001/CreatePaket";
        Assert.assertEquals(createPackagePage.getActualURL(), expectedUrl);
        Hooks.test.log(Status.PASS, "user redirect to create package page");
    }

    @When("enter valid data new package")
    public void enter_valid_data_new_package() {
        createPackagePage.enterNamaPaket("Paket Risma");
        Hooks.test.log(Status.INFO, "user enter new package");
    }

    @Then("user save valid new package")
    public void user_save_valid_new_package() {
        createPackagePage.clickSaveButton();
        Hooks.test.log(Status.PASS, "user save new package");
    }

    @When("the user click edit package button")
    public void the_user_click_edit_button() {
        driver.get("http://127.0.0.1:8001/EditPaket/55");
        Hooks.test.log(Status.PASS, "user click edit button");
    }

    @When("the user update package")
    public void the_user_update_package() {
        updatePackagePage.editNamaPaket("5 Hari di SGLC");
        Hooks.test.log(Status.INFO, "user edit package name");
    }

    @Then("user save updated package")
    public void user_save_updated_package() {
        updatePackagePage.clickSaveButton();
        Hooks.test.log(Status.PASS, "user update new package");
    }

    @When("the user click delete package button")
    public void the_user_click_delete_button() {
        driver.get("http://127.0.0.1:8001/DeletePaket/83");
        Hooks.test.log(Status.PASS, "user click delete button");
    }

    @Then("user delete package")
    public void user_delete_package() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Hooks.test.log(Status.PASS, "user delete package");
    }

    @When("enter invalid data new package")
    public void enter_invalid_data_new_package() {
        createPackagePage.enterNamaPaket("");
        Hooks.test.log(Status.INFO, "user enter invalid new package");
    }

    @When("the user click save button")
    public void the_user_click_save_button() {
        createPackagePage.clickSaveButton();
        Hooks.test.log(Status.PASS, "user click save button");
    }

    @Then("user redirect to the same page with error message")
    public void user_redirect_to_the_same_create_package_page_with_error_message() {
        Assert.assertTrue(createPackagePage.isErrorMessageDisplayed());
        Hooks.test.log(Status.PASS, "user redirect to the same create package page with error message");
    }

    @When("the user update package with invalid data")
    public void the_user_update_package_with_invalid_data() {
        updatePackagePage.editNamaPaket("");
        Hooks.test.log(Status.INFO, "user edit package name with invalid data");
    }

    @When("the user click save button on update package page")
    public void the_user_click_save_button_on_update_package_page() {
        updatePackagePage.clickSaveButton();
        Hooks.test.log(Status.PASS, "user click save button on update package page");
    }
}
