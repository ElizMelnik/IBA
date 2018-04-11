package edu.bsuir.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.LoginPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void getLoginPage() {
        driver.get(LoginPageElements.URL);
    }

    public void typeLogin(String username) {
        WebElement element = driver.findElement(LoginPageElements.USERNAME);
        element.sendKeys(username);
    }

    public void typePassword(String password) {
        WebElement element = driver.findElement(LoginPageElements.PASSWORD);
        element.sendKeys(password);

    }
    public void clickLoginButton() {
        WebElement element = driver.findElement(LoginPageElements.LOGIN_BUTTON);
        element.click();

    }
    public String getTitle() {
        return driver.getTitle();
    }
//    public void destroy() {
//        driver = null;
//    }
}
