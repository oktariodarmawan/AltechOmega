package Base;

import PageObject.CheckOut;
import PageObject.LoginPage;
import PageObject.Product;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BuyProduct extends BaseTest {
    @Test
    public void buyProduct() throws InterruptedException{
        LoginPage loginPage = homePage.clickLoginPage();
        loginPage.setUsername("efmlolipop@gmail.com");
        Thread.sleep(5000);
        loginPage.setSelanjutnyaButton();
        Thread.sleep(5000);
        loginPage.setPasswordField("Kevinunited42!");
        Thread.sleep(5000);
        Product productpage = loginPage.setSelanjutnyaButton2();
        Thread.sleep(5000);
        productpage.clickProduct();
        productpage.clickNetbookProductButton();
        Thread.sleep(2000);
        productpage.clickCart1();
        productpage.clickAddToCart();
        Thread.sleep(3000
        );
        productpage.clickLanjutKeranjang();
        Thread.sleep(2000);
        assertEquals(productpage.expectedText(), productpage.actualText());
    }

    @Test
    public void checkProduct() throws InterruptedException{
        LoginPage loginPage = homePage.clickLoginPage();
        loginPage.setUsername("efmlolipop@gmail.com");
        Thread.sleep(5000);
        loginPage.setSelanjutnyaButton();
        Thread.sleep(5000);
        loginPage.setPasswordField("Kevinunited42!");
        Thread.sleep(5000);
        loginPage.setSelanjutnyaButton2();
        Thread.sleep(5000);
        CheckOut checkOutPage = homePage.clickCheckOut();
        Thread.sleep(5000);
        assertEquals(checkOutPage.expectedText(), checkOutPage.actualText());
        String expectedTitle = "Cart";
        assertEquals(expectedTitle, checkOutPage.actualTitle());
    }
}
