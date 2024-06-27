package pages.update_jadwal.tujuan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TujuanObject {
    WebDriver driver;

    public TujuanObject(WebDriver driver) {
        this.driver = driver;
    }

    public By tujuan() {
        return By.id("id_destinasi");
    }

    public By saveBtn() {
        return By.id("edit-id-destinasi");
    }
}
