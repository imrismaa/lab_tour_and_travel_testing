package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreatePackagePage {
    WebDriver driver;
    private WebDriverWait wait;

    By namaPaket = By.id("nama_paket");
    By saveButton = By.id("create-paket");

    public CreatePackagePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getActualURL() {
        return driver.getCurrentUrl();
    }

    public void enterNamaPaket(String paket) {
        driver.findElement(namaPaket).sendKeys(paket);
    }

    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }
}
