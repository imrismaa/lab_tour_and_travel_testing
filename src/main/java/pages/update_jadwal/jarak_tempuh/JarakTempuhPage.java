package pages.update_jadwal.jarak_tempuh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JarakTempuhPage {
    WebDriver driver;
    private WebDriverWait wait;
    JarakTempuhObject jarakTempuhObject;

    public JarakTempuhPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
        jarakTempuhObject = new JarakTempuhObject(driver);
    }

    public void editJarakTempuh(String jarak) {
        driver.findElement(jarakTempuhObject.jarakTempuh()).clear();
        driver.findElement(jarakTempuhObject.jarakTempuh()).sendKeys(jarak);
    }
    public void saveJarakTempuh() {
        driver.findElement(jarakTempuhObject.saveBtn()).click();
    }
}
