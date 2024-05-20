package ui_Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestNG {
    WebDriver driver;

    @BeforeSuite
    public void setUp() {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();




    }
    @Test
    public void subirPagona(){
        driver.navigate().to("https://blog.testproject.io/");
        System.out.println("To Title: " + driver.getTitle());

    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }


}