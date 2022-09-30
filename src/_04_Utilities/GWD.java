package _04_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class GWD {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    @Parameters("browser")
    public void getDriver(String browser) {

        switch (browser) {
            case "chrome":
                System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                break;
        }


        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.a101.com.tr/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
@AfterClass
    public void quitDriver(){
        driver.quit();
    }

}
