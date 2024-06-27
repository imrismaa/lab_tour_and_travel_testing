package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.create_jadwal.CreateJadwalPage;
import pages.jadwal.JadwalPage;
import pages.update_jadwal.jam_mulai.JamMulaiPage;
import pages.update_jadwal.jam_selesai.JamSelesaiPage;
import pages.update_jadwal.jarak_tempuh.JarakTempuhPage;
import pages.update_jadwal.tujuan.TujuanPage;
import pages.update_jadwal.waktu_tempuh.WaktuTempuhPage;

import java.time.Duration;

public class ManageJadwalSteps {
    WebDriver driver;
    JadwalPage jadwalPage;
    CreateJadwalPage createJadwalPage;
    JarakTempuhPage jarakTempuhPage;
    WaktuTempuhPage waktuTempuhPage;
    TujuanPage tujuanPage;
    JamMulaiPage jamMulaiPage;
    JamSelesaiPage jamSelesaiPage;
    private WebDriverWait wait;

    public ManageJadwalSteps() {
        this.driver = Hooks.getDriver(); // Get WebDriver instance from Hooks
        this.jadwalPage = new JadwalPage(driver);
        this.createJadwalPage = new CreateJadwalPage(driver);
        this.jarakTempuhPage = new JarakTempuhPage(driver);
        this.waktuTempuhPage = new WaktuTempuhPage(driver);
        this.tujuanPage = new TujuanPage(driver);
        this.jamMulaiPage = new JamMulaiPage(driver);
        this.jamSelesaiPage = new JamSelesaiPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("a web browser is at admin jadwal destinati page")
    public void a_web_browser_is_at_admin_jadwal_destinasi_page() {
        driver.get("http://127.0.0.1:8001/AdminJadwalDestinasi/53");
        Hooks.test.log(Status.PASS, "user at admin jadwal destinasi page");
    }

    @When("the user click \"Tambah Jadwal Destinasi\" button")
    public void the_user_click_tambah_jadwal_destinasi_button() {
        jadwalPage.clickTambahJadwal();
        Hooks.test.log(Status.PASS, "user click tambah jadwal destinasi button");
        String expectedUrl = "http://127.0.0.1:8001/CreateJadwal/53";
        createJadwalPage.handleAlert();
        Assert.assertEquals(createJadwalPage.getActualURL(), expectedUrl);
        Hooks.test.log(Status.PASS, "user redirect to create jadwal destinasi page");
    }

    @When("enter valid data new jadwal destination")
    public void enter_valid_data_new_jadwal_destination() {
        // Setiap setelah test script dijalankan, hapus hasil jadwalnya dulu jika ingin di run lagi.
        // Karena data yang masuk tidak bisa sama seperti ini,
        createJadwalPage.enterHariJadwal();
        createJadwalPage.enterJrkTphJadwal("3.2");
        createJadwalPage.enterWktTphJadwal("13");
        createJadwalPage.enterIdDestinasiJadwal("Green Kayen");
        createJadwalPage.enterJamMulaiJadwal("06:15");
        createJadwalPage.enterJamSelesaiJadwal("07:30");
        createJadwalPage.enterJamLokasiJadwal("WIB");
        Hooks.test.log(Status.PASS, "user enter new jadwal destinasi");
    }

    @Then("user save valid new jadwal destination")
    public void user_save_valid_new_jadwal_destination() {
        createJadwalPage.clickSave();
        Hooks.test.log(Status.PASS, "user click save jadwal destinasi button");

        try {
            Thread.sleep(4000);  // Tunggu 4 detik, sesuaikan waktu ini jika perlu
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        jadwalPage.handleAlert();
        String expectedUrl = "http://127.0.0.1:8001/AdminJadwalDestinasi/53";
        Assert.assertEquals(jadwalPage.getActualURL(), expectedUrl);
        Hooks.test.log(Status.PASS, "user back to jadwal destinasi page");
    }

    @When("the user click edit angka jarak tempuh")
    public void the_user_click_edit_angka_jarak_tempuh() {
        jadwalPage.clickEditJarak();
        Hooks.test.log(Status.PASS, "user click nilai angka jarak tempuh destinasi");
    }

    @When("the user update jarak tempuh")
    public void the_user_update_jarak_tempuh() {
        jarakTempuhPage.editJarakTempuh("0.9");
        Hooks.test.log(Status.PASS, "user enter new jarak tempuh destinasi");
    }
    @Then("user save updated jarak tempuh")
    public void user_save_updated_jarak_tempuh() {
        jarakTempuhPage.saveJarakTempuh();
        jadwalPage.handleAlert();
        Hooks.test.log(Status.PASS, "user update jarak tempuh jadwal");
    }

    @When("the user click edit angka waktu tempuh")
    public void the_user_click_edit_angka_waktu_tempuh() {
        jadwalPage.clickEditWaktu();
        Hooks.test.log(Status.PASS, "user click nilai angka waktu tempuh destinasi");
    }

    @When("the user update waktu tempuh")
    public void the_user_update_waktu_tempuh() {
        waktuTempuhPage.editWaktuTempuh("19");
        Hooks.test.log(Status.PASS, "user enter new waktu tempuh destinasi");
    }
    @Then("user save updated waktu tempuh")
    public void user_save_updated_waktu_tempuh() {
        waktuTempuhPage.saveWaktuTempuh();
        jadwalPage.handleAlert();
        Hooks.test.log(Status.PASS, "user update waktu tempuh jadwal");
    }

    @When("the user click edit tujuan destinasi")
    public void the_user_click_edit_tujuan_destinasi() {
        jadwalPage.clickEditTujuan();
        Hooks.test.log(Status.PASS, "user click nama tujuan destinasi");
    }

    @When("the user update tujuan destinasi")
    public void the_user_update_tujuan_destinasi() {
        tujuanPage.editTujuan("Puncak Saka");
        Hooks.test.log(Status.PASS, "user enter tujuan destinasi");
    }
    @Then("user save updated tujuan destinasi")
    public void user_save_updated_tujuan_destinasi() {
        tujuanPage.saveTujuan();
        jadwalPage.handleAlert();
        Hooks.test.log(Status.PASS, "user update tujuan destinasi");
    }

    @When("the user click edit jam mulai")
    public void the_user_click_edit_jam_mulai() {
        jadwalPage.clickEditMulai();
        Hooks.test.log(Status.PASS, "user click jam mulai destinasi");
    }

    @When("the user update jam mulai")
    public void the_user_update_jam_mulai() {
        jamMulaiPage.editJamMulai("10:00");
        Hooks.test.log(Status.PASS, "user enter jam mulai destinasi");
    }
    @Then("user save updated jam mulai")
    public void user_save_updated_jam_mulai() {
        jamMulaiPage.saveJamMulai();
        jadwalPage.handleAlert();
        Hooks.test.log(Status.PASS, "user update jam mulai destinasi");
    }

    @When("the user click edit jam selesai")
    public void the_user_click_edit_jam_selesai() {
        jadwalPage.clickEditSelesai();
        Hooks.test.log(Status.PASS, "user click jam selesai destinasi");
    }

    @When("the user update jam selesai")
    public void the_user_update_jam_selesai() {
        jamSelesaiPage.editJamSelesai("10:45");
        Hooks.test.log(Status.PASS, "user enter jam selesai destinasi");
    }
    @Then("user save updated jam selesai")
    public void user_save_updated_jam_selesai() {
        jamSelesaiPage.saveJamSelesai();
        jadwalPage.handleAlert();
        Hooks.test.log(Status.PASS, "user update jam selesai destinasi");
    }

    @When("the user click trash icon delete jadwal")
    public void the_user_click_icon_trash_icon_delete_jadwal() {
        jadwalPage.clickHapusJadwal();
        Hooks.test.log(Status.PASS, "user click ikon sampah untuk hapus jadwal");
    }

    @Then("user accept confirm to deleted jadwal")
    public void user_accept_confirm_to_delete_jadwal() {
        jadwalPage.handleAlert();
        try {
            Thread.sleep(5000);  // Tunggu 4 detik, sesuaikan waktu ini jika perlu
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jadwalPage.handleAlert();
        Hooks.test.log(Status.PASS, "user telah berhasil menghapus jadwal");
    }
}
