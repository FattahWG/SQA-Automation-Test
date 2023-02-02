package driverSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSetup {
    public static WebDriver webDriver;
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        String URL = "https://www.tokopedia.com/";
        webDriver.get(URL);
        webDriver.manage().window().maximize();
    }
    @After
    public void closeBrowser(){
        webDriver.quit();
    }
}
