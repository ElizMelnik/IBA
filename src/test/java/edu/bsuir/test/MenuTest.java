package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.Element;
import edu.bsuir.pages.LoginPage;
import edu.bsuir.pages.MenuPage;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuTest {
    private WebDriver driver = WebDriverSingleton.getInstance();

    LoginPage lp = new LoginPage();
    MenuPage mp = new MenuPage();

    @Before
    public void loginTest2(){
        lp.getLoginPage();
        lp.typeLogin("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        //Element errorMessage = new Element("Ваш запрос завершился с ошибкой.", By.xpath("//div[@class = 'alert alert-error']"));
        Assert.assertEquals("Главная - Конструктор Талантов", lp.getTitle());

    }

    @Test
    @DisplayName("SideBar")
    @Description("Поиск пункта заявки")
    @Feature("Главная")
    @Story("Поиск пункта заявка в SideBar")
    @Severity(SeverityLevel.BLOCKER)
    public void menuTest(){
        mp.openSidebar();
        mp.clickRecruiting();
        Element errorMessage = new Element("Заявки",By.xpath("//*[@id=\"content\"]/div[1]"));
        Assert.assertTrue(errorMessage.isElementPresent());
    }
    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }
}
