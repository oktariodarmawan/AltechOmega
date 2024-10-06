package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.xpath("//input[@autocomplete='']");
    private By passwordField = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div/div/input");
    private By selanjutnyaButton = By.xpath("(//button[@aria-label='button'])[4]");
    private By selanjutnyaButton2 = By.xpath("(//button[@aria-label='button'])[2]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setSelanjutnyaButton(){
        driver.findElement(selanjutnyaButton).click();
    }
    public Product setSelanjutnyaButton2(){
        driver.findElement(selanjutnyaButton2).click();
        return new Product(driver);
    }
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public String actualURL(){
        return driver.getCurrentUrl();
    }

}
