package Base;

import PageObject.HomePage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @Before
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.bhinneka.com/");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    @After
    public void teardown(){
        driver.quit();
    }
}