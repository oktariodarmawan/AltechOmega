package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class CheckOut {
    private WebDriver driver;

    public CheckOut(WebDriver driver){
        this.driver = driver;
    }
    public String actualText(){
        return driver.findElement(By.xpath("//strong[text()='DELL Latitude 3440 (Core i7-1355U, 8GB, 512GB SSD, Win 11 Home)']")).getText();
    }
    public String expectedText(){
        return driver.findElement(By.xpath("//*[@id='cart_products']/div[2]/div[2]/a/strong")).getText();
    }
    public String actualTitle(){
        return driver.getTitle();
    }
}
