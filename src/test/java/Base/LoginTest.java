package Base;

import PageObject.LoginPage;
import org.junit.Test;
import org.testng.Assert;


public class LoginTest extends BaseTest {

    @Test
    public void successLogin() throws InterruptedException {
        LoginPage loginPage = homePage.clickLoginPage();
        loginPage.setUsername("efmlolipop@gmail.com");
        Thread.sleep(5000);
        loginPage.setSelanjutnyaButton();
        Thread.sleep(5000);
        loginPage.setPasswordField("Kevinunited42!");
        Thread.sleep(5000);
        loginPage.setSelanjutnyaButton2();
    }
}
