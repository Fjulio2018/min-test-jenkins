package ui_Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG {
    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        // Configurar o WebDriverManager para baixar automaticamente o ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Inicializar o driver do Chrome
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void subirPagina() {
        // Navegar para a página de teste
        driver.get("https://blog.testproject.io/");
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterSuite
    public void tearDown() {
        // Fechar o navegador após os testes
        if (driver != null) {
            driver.quit();
        }
    }
}
