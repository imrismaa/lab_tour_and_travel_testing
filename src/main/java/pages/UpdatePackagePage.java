package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdatePackagePage {
    WebDriver driver;
    private WebDriverWait wait;

    public UpdatePackagePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void editNamaPaket(String paket) {
        driver.findElement(By.id("nama_paket")).clear();
        driver.findElement(By.id("nama_paket")).sendKeys(paket);
    }

    public void clickSaveButton() {
        driver.findElement(By.id("edit-paket")).click();
    }
}
