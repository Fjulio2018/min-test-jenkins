package ui_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestNG {
    WebDriver driver;

    @BeforeSuite
    public void setUp() {

        String caminhoDoChromeDriver = "src/test/resources/drivers/chromedriver.exe";  // Assuming this is the correct path

        ChromeOptions chromeOptions = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver", caminhoDoChromeDriver);  // Fix property name

        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void openWindow() {
        driver.navigate().to("https://blog.testproject.io/");
        System.out.println("To Title:  " + driver.getTitle());
    }
}
