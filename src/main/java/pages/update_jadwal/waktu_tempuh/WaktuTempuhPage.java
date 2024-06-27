package pages.update_jadwal.waktu_tempuh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.update_jadwal.jarak_tempuh.JarakTempuhObject;

import java.time.Duration;

public class WaktuTempuhPage {
    WebDriver driver;
    private WebDriverWait wait;
    WaktuTempuhObject waktuTempuhObject;

    public WaktuTempuhPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
        waktuTempuhObject = new WaktuTempuhObject(driver);
    }

    public void editWaktuTempuh(String waktu) {
        driver.findElement(waktuTempuhObject.waktuTempuh()).clear();
        driver.findElement(waktuTempuhObject.waktuTempuh()).sendKeys(waktu);
    }
    public void saveWaktuTempuh() {
        driver.findElement(waktuTempuhObject.saveBtn()).click();
    }
}
