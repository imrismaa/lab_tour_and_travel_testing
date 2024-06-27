package pages.update_jadwal.jam_selesai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JamSelesaiPage {
    WebDriver driver;
    private WebDriverWait wait;
    JamSelesaiObject jamSelesaiObject;

    public JamSelesaiPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
        jamSelesaiObject = new JamSelesaiObject(driver);
    }

    public void editJamSelesai(String destinasi) {
        driver.findElement(jamSelesaiObject.jamSelesai()).clear();
        driver.findElement(jamSelesaiObject.jamSelesai()).sendKeys(destinasi);
    }
    public void saveJamSelesai() {
        driver.findElement(jamSelesaiObject.saveBtn()).click();
    }
}
