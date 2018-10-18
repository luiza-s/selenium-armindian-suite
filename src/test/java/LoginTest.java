import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class LoginTest {

    private WebDriver driver;
    @Test
    public void successLogin(){
        System.setProperty("webdriver.chrome.driver", "/Users/studentb/BrowserDriver/chromedriver_win32/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://google.com");


        assertTrue(driver.getCurrentUrl().contains("https://www.google.com"), "incorrect page");
        driver.quit();
    }
    @AfterMethod
    public void closeBrwoser(){
        driver.quit();
    }


}
