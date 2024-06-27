package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private static WebDriver driver;
    public  static ExtentReports extent;
    public static ExtentTest test;
    @Before
    public void setUp(Scenario scenario) {
        extent = ExtentReportManager.getInstance();
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            test = extent.createTest(scenario.getName());
        }
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        if (extent != null) {
            extent.flush();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
