package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public static String ENDPOINT = "inventory.html";
    private static By LOGO = By.className("app_logo");
    private static By ITEM = By.partialLinkText("Sauce Labs");
    private static By ADD = By.xpath("//button[@class='btn_primary btn_inventory']");


    public ProductPage(WebDriver driver) {
        super(driver);
    }


    public boolean isPageOpened () {
        return driver.findElement(LOGO).isDisplayed();
    }

    public void product (){
        openPage(BASE_URL + ENDPOINT);
        driver.findElement(ITEM).click();
        driver.findElement(ADD).click();


    }


}
