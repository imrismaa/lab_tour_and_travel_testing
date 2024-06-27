package pages.jadwal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JadwalPage {
    WebDriver driver;
    private WebDriverWait wait;
    JadwalObject jadwalObject;

    public JadwalPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
        jadwalObject = new JadwalObject(driver);
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

    public void clickTambahJadwal() {
        WebElement tambahJadwalButton = wait.until(ExpectedConditions.visibilityOfElementLocated(jadwalObject.tambahJadwal()));
        tambahJadwalButton.click();
    }

    public void clickEditJarak() {
        WebElement editJarakButton = wait.until(ExpectedConditions.visibilityOfElementLocated(jadwalObject.editJarak()));
        editJarakButton.click();
    }

    public void clickEditWaktu() {
        WebElement editWaktuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(jadwalObject.editWaktu()));
        editWaktuButton.click();
    }

    public void clickEditTujuan() {
        WebElement editTujuanButton = wait.until(ExpectedConditions.visibilityOfElementLocated(jadwalObject.editTujuan()));
        editTujuanButton.click();
    }

    public void clickEditMulai() {
        WebElement editJamMulaiButton = wait.until(ExpectedConditions.visibilityOfElementLocated(jadwalObject.editMulai()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editJamMulaiButton);
        try {
            Thread.sleep(4000);  // Tunggu 4 detik, sesuaikan waktu ini jika perlu
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        editJamMulaiButton.click();
    }

    public void clickEditSelesai() {
        WebElement editJamSelesaiButton = wait.until(ExpectedConditions.visibilityOfElementLocated(jadwalObject.editSelesai()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editJamSelesaiButton);
        try {
            Thread.sleep(4000);  // Tunggu 4 detik, sesuaikan waktu ini jika perlu
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        editJamSelesaiButton.click();
    }

    public void clickHapusJadwal() {
        WebElement hapusJadwalButton = wait.until(ExpectedConditions.visibilityOfElementLocated(jadwalObject.hapusJadwal()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hapusJadwalButton);
        try {
            Thread.sleep(4000);  // Tunggu 4 detik, sesuaikan waktu ini jika perlu
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hapusJadwalButton.click();
    }
}
