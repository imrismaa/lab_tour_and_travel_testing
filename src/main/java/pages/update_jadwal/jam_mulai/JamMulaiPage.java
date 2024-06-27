package pages.update_jadwal.jam_mulai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JamMulaiPage {
    WebDriver driver;
    private WebDriverWait wait;
    JamMulaiObject jamMulaiObject;

    public JamMulaiPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
        jamMulaiObject = new JamMulaiObject(driver);
    }

    public void editJamMulai(String destinasi) {
        driver.findElement(jamMulaiObject.jamMulai()).clear();
        driver.findElement(jamMulaiObject.jamMulai()).sendKeys(destinasi);
    }
    public void saveJamMulai() {
        driver.findElement(jamMulaiObject.saveBtn()).click();
    }
}
