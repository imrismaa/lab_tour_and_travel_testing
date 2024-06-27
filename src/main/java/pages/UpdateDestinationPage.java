package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateDestinationPage {
    WebDriver driver;
    By namaDestinasi = By.id("nama_destinasi");
    By saveBtn = By.id("edit-destinasi");

    public UpdateDestinationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void editNamaDestinasi(String destinasi) {
        driver.findElement(namaDestinasi).clear();
        driver.findElement(namaDestinasi).sendKeys(destinasi);
    }
    public void saveUpdateDestinasi() {
        driver.findElement(saveBtn).click();
    }
}
