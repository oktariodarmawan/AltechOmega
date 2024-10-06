package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product {
    private WebDriver driver;
    private By computerProductButton = By.xpath("(//A[@class='item'])[1]");
    private By netbookProductButton = By.xpath("//A[@href='https://www.bhinneka.com/jual-laptop-notebook/y81WyE6']");
    private By cart1 = By.xpath("(//img[@itemprop='image'])[1]");
    private By addToCart = By.xpath("//a[@id='add_to_cart']");
    private By lanjutKeKeranjang = By.xpath("(//button[@type='button'])[5]");
    public Product(WebDriver driver){
        this.driver = driver;
    }

    public void clickProduct(){
        driver.findElement(computerProductButton).click();
    }
    public void clickNetbookProductButton(){
        driver.findElement(netbookProductButton).click();
    }
    public void clickCart1(){
        driver.findElement(cart1).click();
    }
    public void clickAddToCart(){
        driver.findElement(addToCart).click();
    }
    public void clickLanjutKeranjang(){
        driver.findElement(lanjutKeKeranjang).click();
    }
    public String actualText(){
        return driver.findElement(By.xpath("//strong[text()='DELL Latitude 3440 (Core i7-1355U, 8GB, 512GB SSD, Win 11 Home)']")).getText();
    }
    public String expectedText(){
        return driver.findElement(By.xpath("//*[@id='cart_products']/div[2]/div[2]/a/strong")).getText();
    }

}
