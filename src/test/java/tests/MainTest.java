package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class MainTest extends BaseTest {

    @Test
    public void test (){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        ProductPage productPage = new ProductPage(driver);
        productPage.product();


    }




}
