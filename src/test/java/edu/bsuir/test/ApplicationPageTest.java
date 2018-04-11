package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.Element;
import edu.bsuir.pages.ApplicationPage;
import edu.bsuir.pages.CandidatePage;
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

public class ApplicationPageTest {
    private WebDriver driver = WebDriverSingleton.getInstance();

    LoginPage lp3 = new LoginPage();
    MenuPage mp2 = new MenuPage();
    ApplicationPage applicationPage = new ApplicationPage();

    @Before
    @DisplayName("Авторизация")
    @Description("Вход в аккаунт как Кабанов")
    @Feature("Конструктор талантов")
    @Story("Сценарий 1 – Авторизация")
    @Severity(SeverityLevel.BLOCKER)
    public void loginTest3(){
        lp3.getLoginPage();
        lp3.typeLogin("kabanov@tc.by");
        lp3.typePassword("welcome");
        lp3.clickLoginButton();
        Assert.assertEquals("Главная - Конструктор Талантов", lp3.getTitle());
    }

    @Test
    @DisplayName("Поиск по меню")
    @Description("Поиск по меню пункт кандидаты")
    @Feature("Кандидаты")
    @Story("Проверка поиска")
    @Severity(SeverityLevel.BLOCKER)
    public void menuTest3(){
        mp2.openSidebar();
        mp2.clickRecruiting();
        Element message = new Element("Кандидаты", By.xpath("//*[@id=\"content\"]/div[1]"));
        Assert.assertTrue(message.isElementPresent());
    }
    @Test
    @DisplayName("Создание заявки")
    @Description("Заполнение заявки")
    @Feature("Подбор и адаптация")
    @Story("Сценарий 1 – Хаполнение заявки")
    @Severity(SeverityLevel.BLOCKER)
    public void createApplication() throws Exception {
        applicationPage.application();
    }

    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }
}
