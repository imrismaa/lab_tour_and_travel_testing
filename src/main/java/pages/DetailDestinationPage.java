package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailDestinationPage {
    WebDriver driver;
    public DetailDestinationPage(WebDriver driver) {
        this.driver = driver;
    }
    By editBtn = By.xpath("//a[text()='Edit Destinasi']");

    public void clickEditButton() {
        driver.findElement(editBtn).click();
    }
}
