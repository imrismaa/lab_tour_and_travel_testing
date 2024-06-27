package pages.update_jadwal.waktu_tempuh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaktuTempuhObject {
    WebDriver driver;

    public WaktuTempuhObject(WebDriver driver) {
        this.driver = driver;
    }

    public By waktuTempuh() {
        return By.id("waktu");
    }

    public By saveBtn() {
        return By.id("edit-waktu-tempuh");
    }
}
