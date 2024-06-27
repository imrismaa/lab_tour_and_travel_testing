package pages.update_jadwal.jam_mulai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JamMulaiObject {
    WebDriver driver;

    public JamMulaiObject(WebDriver driver) {
        this.driver = driver;
    }

    public By jamMulai() {
        return By.id("jam");
    }

    public By saveBtn() {
        return By.id("edit-jam-mulai");
    }
}
