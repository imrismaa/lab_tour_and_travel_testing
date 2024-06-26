package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PackagePage {
    WebDriver driver;
    private WebDriverWait wait;

    public PackagePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
    }

    By tambahPaket = By.id("tambah-paket");

    public void clickTambahPaket() {
        WebElement tambahPaketButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tambah-paket")));
        tambahPaketButton.click();
    }
}
