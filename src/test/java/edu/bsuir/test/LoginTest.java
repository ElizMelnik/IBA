//package edu.bsuir.test;
//
//import edu.bsuir.driver.WebDriverSingleton;
//import edu.bsuir.elements.Element;
//import edu.bsuir.pages.LoginPage;
//import io.qameta.allure.*;
//import io.qameta.allure.junit4.DisplayName;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class LoginTest {
//    private WebDriver driver = WebDriverSingleton.getInstance();
//
//    LoginPage loginPage = new LoginPage();
//
//    @Test
//    @DisplayName("Загрузка резюме")
//    @Description("Загрузка резюме используя Sikuli")
//    @Feature("Кандидаты")
//    @Story("Сценарий 1 - Создание кандидата")
//    @Severity(SeverityLevel.BLOCKER)
//    public void checkNegativeDataForLogin() {
//        loginPage.getLoginPage();
//        loginPage.typeLogin("username@tc.by");
//        loginPage.typePassword("welcome");
//        loginPage.clickLoginButton();
//        Element errorMessage = new Element("Ваш запрос завершился с ошибкой.",By.xpath("//div[@class = 'alert alert-error']"));
//        Assert.assertTrue(errorMessage.isElementPresent());
//    }
//
////    @Test
////    public void checkNegativeUsernameForLogin() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement login = driver.findElement(By.xpath("//input[@id='_58_login']"));
////        login.sendKeys("kabanov");
////        WebElement password = driver.findElement(By.xpath("//input[@id='_58_password']"));
////        password.sendKeys("welcome");
////        password.sendKeys(Keys.RETURN);
////        WebElement errorMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-error']"));
////        Assert.assertEquals("Ваш запрос завершился с ошибкой.", errorMessage.getText());
////    }
////
////    @Test
////    public void checkNegativePasswordForLogin() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement login = driver.findElement(By.xpath("//input[@id='_58_login']"));
////        login.sendKeys("kabanov@tc.by");
////        WebElement password = driver.findElement(By.xpath("//input[@id='_58_password']"));
////        password.sendKeys("password");
////        password.sendKeys(Keys.RETURN);
////        WebElement errorMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-error']"));
////        Assert.assertEquals("Ваш запрос завершился с ошибкой.", errorMessage.getText());
////    }
////
////    @Test
////    public void checkEmptyDataForLogin() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement button = driver.findElement(By.xpath("//button[text()=' Войти ']"));
////        button.click();
////        WebElement errorMessage = driver.findElement(By.className("required"));
////        Assert.assertEquals("Это обязательное поле.", errorMessage.getText());
////    }
////
////    @Test
////    public void сheckEmptyUsername() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement password = driver.findElement(By.xpath("//input[@id='_58_password']"));
////        password.sendKeys("welcome");
////        WebElement button = driver.findElement(By.xpath("//button[text()=' Войти ']"));
////        button.click();
////        WebElement errorMessage = driver.findElement(By.className("required"));
////        Assert.assertEquals("Это обязательное поле.", errorMessage.getText());
////    }
////
////    @Test
////    public void сheckEmptyPassword() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement login = driver.findElement(By.xpath("//input[@id='_58_login']"));
////        login.sendKeys("kabanov@tc.by");
////        WebElement button = driver.findElement(By.xpath("//button[text()=' Войти ']"));
////        button.click();
////        WebElement errorMessage = driver.findElement(By.className("required"));
////        Assert.assertEquals("Это обязательное поле.", errorMessage.getText());
////    }
////
////    @Test
////    public void swapLoginAndPassword() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement login = driver.findElement(By.xpath("//input[@id='_58_login']"));
////        login.sendKeys("welcome");
////        WebElement password = driver.findElement(By.xpath("//input[@id='_58_password']"));
////        password.sendKeys("kabanov@tc.by");
////        password.sendKeys(Keys.RETURN);
////        WebElement errorMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-error']"));
////        Assert.assertEquals("Ваш запрос завершился с ошибкой.", errorMessage.getText());
////    }
////
////    @Test
////    public void сheckLoginEndsWithSpace() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement login = driver.findElement(By.xpath("//input[@id='_58_login']"));
////        login.sendKeys("kabanov@tc.by   ");
////        WebElement password = driver.findElement(By.xpath("//input[@id='_58_password']"));
////        password.sendKeys("welcome");
////        password.sendKeys(Keys.RETURN);
////        WebElement errorMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-error']"));
////        Assert.assertEquals("Ваш запрос завершился с ошибкой.", errorMessage.getText());
////    }
////
////    @Test
////    public void сheckPasswordEndsWithSpace() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement login = driver.findElement(By.xpath("//input[@id='_58_login']"));
////        login.sendKeys("kabanov@tc.by");
////        WebElement password = driver.findElement(By.xpath("//input[@id='_58_password']"));
////        password.sendKeys("welcome  ");
////        password.sendKeys(Keys.RETURN);
////        WebElement errorMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-error']"));
////        Assert.assertEquals("Ваш запрос завершился с ошибкой.", errorMessage.getText());
////    }
////
////    @Test
////    public void сheckPasswordStartsWithSpace() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement login = driver.findElement(By.xpath("//input[@id='_58_login']"));
////        login.sendKeys("kabanov@tc.by");
////        WebElement password = driver.findElement(By.xpath("//input[@id='_58_password']"));
////        password.sendKeys("  welcome");
////        password.sendKeys(Keys.RETURN);
////        WebElement errorMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-error']"));
////        Assert.assertEquals("Ваш запрос завершился с ошибкой.", errorMessage.getText());
////    }
////
////    @Test
////    public void сheckUsernameCaseSensitivity() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement login = driver.findElement(By.xpath("//input[@id='_58_login']"));
////        login.sendKeys("KABANOV@TC.BY");
////        WebElement password = driver.findElement(By.xpath("//input[@id='_58_password']"));
////        password.sendKeys("welcome");
////        password.sendKeys(Keys.RETURN);
////        WebElement userName = driver.findElement(By.xpath("//div[@class = 'float-box']//div//h3"));
////        Assert.assertEquals("Александр Евгеньевич Кабанов", userName.getText());
////    }
////
////    @Test
////    public void сheckPasswordCaseSensitivity() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement login = driver.findElement(By.xpath("//input[@id='_58_login']"));
////        login.sendKeys("kabanov@tc.by");
////        WebElement password = driver.findElement(By.xpath("//input[@id='_58_password']"));
////        password.sendKeys("WELCOME");
////        password.sendKeys(Keys.RETURN);
////        WebElement errorMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-error']"));
////        Assert.assertEquals("Ваш запрос завершился с ошибкой.", errorMessage.getText());
////    }
////
////    @Test
////    public void сheckUsernameWithDifferentCase() {
////        driver.get("http://testing.cld.iba.by");
////        WebElement login = driver.findElement(By.xpath("//input[@id='_58_login']"));
////        login.sendKeys("KaBanoV@tc.by");
////        WebElement password = driver.findElement(By.xpath("//input[@id='_58_password']"));
////        password.sendKeys("welcome");
////        password.sendKeys(Keys.RETURN);
////        WebElement userName = driver.findElement(By.xpath("//div[@class = 'float-box']//div//h3"));
////        Assert.assertEquals("Александр Евгеньевич Кабанов", userName.getText());
////    }
////
//   @After
//    public void shutDown() {
//        driver.close();
//        WebDriverSingleton.destroyInstance();
//    }
//}
