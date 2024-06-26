package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    WebDriver driver;
    private WebDriverWait wait;

    public RegisterPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By fullName = By.id("full_name");
    By username = By.id("username");
    By password = By.id("password");
    By confirmPassword = By.id("password_confirmation");
    By email = By.id("email");
    By registerBtn = By.id("register-btn");
    By alertSucces = By.xpath("//div[contains(@class, 'alert alert-success')]");
    By errorMessage = By.xpath("//p[contains(@class, 'invalid-feedback')]");

    public void enterFullName(String name) {
        driver.findElement(fullName).sendKeys(name);
    }

    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }
    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void enterConfirmPassword(String pass) {
        driver.findElement(confirmPassword).sendKeys(pass);
    }
    public void clickRegister() {
        driver.findElement(registerBtn).click();
    }

    public boolean isAlertSuccessDisplayed() {
        try {
            return driver.findElement(alertSucces).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return driver.findElement(errorMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
