package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By loginPageButton = By.xpath("//*[@id='wrapwrap']/header/nav/div[3]/div[4]/span/a[1]");
    public By checkOutButton = By.xpath("//*[@id=\"wrapwrap\"]/header/nav/div[3]/div[4]/a");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickLoginPage(){
        driver.findElement(loginPageButton).click();
        return new LoginPage(driver);
    }
    public CheckOut clickCheckOut(){
        driver.findElement(checkOutButton).click();
        return new CheckOut(driver);
    }

}
