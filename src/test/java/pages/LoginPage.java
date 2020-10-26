package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private static By LOGIN_LOGO = By.className("login_logo");
    private static By LOGIN_WRAPPER = By.className("login_wrapper");
    private static By LOGIN_CREDENTIALS_WRAP = By.className("login_credentials_wrap");
    private static By LOGIN_BUTTON_CONTAINER = By.id("login_button_container");
    private static By LOGIN_BOX = By.className("login-box");
    private static By USERNAME = By.id("user-name");
    private static By PASSWORD = By.id("password");
    private static By LOGIN_BUTTON = By.id("login-button");
    private static By BOT_COLUMN = By.className("bot_column");
    private static By LOGIN_CREDENTIALS = By.className("login_credentials");
    private static By PASSWORD_FOR_ALL = By.className("login_password");
    private static By STANDARD_USER = By.partialLinkText("standard_user");
    private static By LOCK_OUT_USER = By.partialLinkText("locked_out_user");
    private static By PROBLEM_USER = By.partialLinkText("problem_user");
    private static By PERFORMANCE_USER = By.partialLinkText("performance_glitch_user");
    private static By PASSWORD_FOR_USERS = By.partialLinkText("secret_sauce");



    public LoginPage( WebDriver driver ) {
        super(driver);
    }

    public void openPage (String URL) {
        driver.get( BASE_URL );

    }

    public boolean isPageOpened () {
        return driver.findElement(LOGIN_LOGO).isDisplayed();
    }

    public void login () {
        openPage(BASE_URL);
        driver.findElement(USERNAME).sendKeys("standard_user");
        driver.findElement(PASSWORD).sendKeys("secret_sauce");
        driver.findElement(LOGIN_BUTTON).click();


    }

}
