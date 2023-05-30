package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetupAndTearDown {
    public static WebDriver driver;

    @Before
    public static void setupClass(){
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
//
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
    }

    @After
    public static void terminateClass(){
//        driver.quit();
    }

    public static WebDriver getFinalDriver(){
        return null;
    }
}
