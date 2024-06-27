package pages.update_jadwal.jam_selesai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JamSelesaiObject {
    WebDriver driver;

    public JamSelesaiObject(WebDriver driver) {
        this.driver = driver;
    }

    public By jamSelesai() {
        return By.id("jam");
    }

    public By saveBtn() {
        return By.id("edit-jam-selesai");
    }
}
