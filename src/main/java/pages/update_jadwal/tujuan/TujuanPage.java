package pages.update_jadwal.tujuan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TujuanPage {
    WebDriver driver;
    private WebDriverWait wait;
    TujuanObject tujuanObject;

    public TujuanPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
        tujuanObject = new TujuanObject(driver);
    }

    public void editTujuan(String destinasi) {
        driver.findElement(tujuanObject.tujuan()).sendKeys("");
        driver.findElement(tujuanObject.tujuan()).sendKeys(destinasi);
    }
    public void saveTujuan() {
        driver.findElement(tujuanObject.saveBtn()).click();
    }
}
