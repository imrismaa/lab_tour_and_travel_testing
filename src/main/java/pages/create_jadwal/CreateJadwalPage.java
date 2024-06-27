package pages.create_jadwal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateJadwalPage {
    WebDriver driver;
    private WebDriverWait wait;
    CreateJadwalObject createJadwalObject;

    public CreateJadwalPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
        createJadwalObject = new CreateJadwalObject(driver);
    }

    public String getActualURL() {
        return driver.getCurrentUrl();
    }

    // Method untuk menekan tombol OK pada alert
    public void handleAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (org.openqa.selenium.NoAlertPresentException e) {
            System.out.println("No alert present");
        }
    }

    public void enterHariJadwal() {
        driver.findElement(createJadwalObject.hariJadwal()).click();
    }
    public void enterJrkTphJadwal(String jarak) {
        driver.findElement(createJadwalObject.jrkTphJadwal()).sendKeys(jarak);
    }
    public void enterWktTphJadwal(String waktu) {
        driver.findElement(createJadwalObject.wktTphJadwal()).sendKeys(waktu);
    }
    public void enterIdDestinasiJadwal(String destinasi) {
        driver.findElement(createJadwalObject.idDestinasi()).sendKeys(destinasi);
    }
    public void enterJamMulaiJadwal(String mulai) {
        driver.findElement(createJadwalObject.jamMulaiJadwal()).sendKeys(mulai);
    }
    public void enterJamSelesaiJadwal(String selesai) {
        driver.findElement(createJadwalObject.jamSelesaiJadwal()).sendKeys(selesai);
    }
    public void enterJamLokasiJadwal(String lokasi) {driver.findElement(createJadwalObject.jamLokasiJadwal()).sendKeys(lokasi);}

    public void clickSave() {
        driver.findElement(createJadwalObject.saveJadwal()).click();
    }
}
