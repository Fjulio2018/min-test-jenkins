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
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Adiciona o modo headless
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");  // Adiciona esta linha se estiver usando a versão do Chrome para Linux
        driver = new ChromeDriver(options);
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