package pages.update_jadwal.jarak_tempuh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JarakTempuhObject {
    WebDriver driver;

    public JarakTempuhObject(WebDriver driver) {
        this.driver = driver;
    }

    public By jarakTempuh() {
        return By.id("jarak");
    }

    public By saveBtn() {
        return By.id("edit-jarak-tempuh");
    }
}
