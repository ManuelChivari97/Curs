package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Driver;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUP(){
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        String url = "http://demo.automationtesting.in/Index.html";
        driver.get(url);
        LOG.info("Open browser");
        driver.manage().window().maximize();
    }

    public static void teardown(){
        LOG.info("Close the browser");
        driver.quit();
    }
}
