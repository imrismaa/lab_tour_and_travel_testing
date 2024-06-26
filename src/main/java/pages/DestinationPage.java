package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DestinationPage {
    WebDriver driver;
    private WebDriverWait wait;

    public DestinationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
    }

    By tambahDestinasi = By.id("tambah-destinasi");

    public void clickTambahDestinasi() {
//        driver.findElement(tambahDestinasi).click();
        WebElement tambahDestinasiButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tambah-destinasi")));
        tambahDestinasiButton.click();
    }
}
