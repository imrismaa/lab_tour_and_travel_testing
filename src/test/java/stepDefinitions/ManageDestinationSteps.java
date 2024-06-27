package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class ManageDestinationSteps {

    WebDriver driver;
    DestinationPage destinationPage;
    CreateDestinationPage createDestinationPage;
    DetailDestinationPage detailDestinationPage;
    UpdateDestinationPage updateDestinationPage;
    private WebDriverWait wait;

    public ManageDestinationSteps() {
        this.driver = Hooks.getDriver(); // Get WebDriver instance from Hooks
        this.destinationPage = new DestinationPage(driver);
        this.createDestinationPage = new CreateDestinationPage(driver);
        this.detailDestinationPage = new DetailDestinationPage(driver);
        this.updateDestinationPage = new UpdateDestinationPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("a web browser is at list destination page")
    public void a_web_browser_is_at_list_destination_page() {
        driver.get("http://127.0.0.1:8001/AdminDestinasi");
        Hooks.test.log(Status.PASS, "user at destination page");
    }

    @When("the user click \"Tambah Destinasi\" button")
    public void the_user_click_tambah_destinasi_button() {
        destinationPage.clickTambahDestinasi();
        Hooks.test.log(Status.PASS, "user click tambah destinasi button");
        String expectedUrl = "http://127.0.0.1:8001/CreateDestinasi";
        Assert.assertEquals(createDestinationPage.getActualURL(), expectedUrl);
        Hooks.test.log(Status.PASS, "user redirect to create destinasi page");
    }

    @When("enter valid data new destination")
    public void enter_valid_data_new_destination() {
        createDestinationPage.enterNamaDestinasi("Destinasi Baru");
        createDestinationPage.enterJenisDestinasi();
        createDestinationPage.enterNamaKota("Yogyakarta");
        createDestinationPage.enterJamBuka("05:00");
        createDestinationPage.enterJamTutup("17:00");
        createDestinationPage.enterZonaWaktu();
        createDestinationPage.enterHariTutup();
        createDestinationPage.enterHargaWni("10000");
        createDestinationPage.enterHargaWna("20000");
        createDestinationPage.enterTema();
        createDestinationPage.enterKoordinat("-7.7956,110.3695");
        createDestinationPage.enterDeskripsi("Bagus");
        Hooks.test.log(Status.PASS, "user enter new destination");
    }
    @When("user save valid new destination")
    public void user_save_valid_new_destination() {
        createDestinationPage.clickSave();
        Hooks.test.log(Status.PASS, "user save new destination");
    }
    @Then("user see create success alert")
    public void user_see_create_success_alert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Hooks.test.log(Status.PASS, "create succes alert");
        } catch (NoAlertPresentException e) {
            Hooks.test.log(Status.PASS, "No alert present to accept");
        }
    }

    @Given("a web browser is at destination detail page")
    public void a_web_browser_is_at_destination_detail_page() {
        driver.get("http://127.0.0.1:8001/AdminDestinasiShow/207");
        Hooks.test.log(Status.PASS, "user at detail destination page");
    }
    @When("the user click edit destiantion button")
    public void the_user_click_edit_destiantion_button() {
        detailDestinationPage.clickEditButton();
    }
    @When("the user update destiantion")
    public void the_user_update_destiantion() {
        updateDestinationPage.editNamaDestinasi("Edit Nama Destiansi");
    }
    @When("user save updated destination")
    public void user_save_updated_destination() {
        updateDestinationPage.saveUpdateDestinasi();
        Hooks.test.log(Status.PASS, "user update new destination");
    }
    @Then("user see update success alert")
    public void user_see_update_success_alert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Hooks.test.log(Status.PASS, "update succes alert");
        } catch (NoAlertPresentException e) {
            Hooks.test.log(Status.PASS, "No alert present to accept");
        }
    }

    @Given("the user opens the destination details page")
    public void the_user_opens_the_destination_details_page() {
        driver.get("http://127.0.0.1:8001/AdminDestinasiShow/246");
        Hooks.test.log(Status.PASS, "user at detail destination page");
    }
    @When("the user click hapus destinasi button")
    public void the_user_click_hapus_destinasi_button() {
        detailDestinationPage.clickHapusButton();
        Hooks.test.log(Status.PASS, "user click delete button");
        try {
            // Menangani alert konfirmasi penghapusan
            driver.switchTo().alert().accept();
            Hooks.test.log(Status.PASS, "delete confirmation alert");
        } catch (NoAlertPresentException e) {
            Hooks.test.log(Status.FAIL, "No alert present to accept");
        }

        try {
            // Setelah menghapus, jika ada alert dengan pesan "Destinasi berhasil dihapus."
            driver.switchTo().alert().accept();
            Hooks.test.log(Status.PASS, "delete success alert");
        } catch (NoAlertPresentException e) {
            Hooks.test.log(Status.FAIL, "No success alert present to accept");
        }

        driver.get("http://localhost:8000/api/delete-destinasi/246");
    }
    @Then("the user hapus destiansi")
    public void the_user_hapus_destiansi() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Hooks.test.log(Status.PASS, "user confirmed hapus destinasi");
        } catch (NoAlertPresentException e) {
            Hooks.test.log(Status.PASS, "No alert present to accept");
        }
    }
}
