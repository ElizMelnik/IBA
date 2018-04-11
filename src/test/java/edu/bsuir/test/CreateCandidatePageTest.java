package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.Element;
import edu.bsuir.helper.Helper;
import edu.bsuir.pages.CreateCandidatePage;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.xml.bind.JAXBException;

/*
*Также, следует тестировать следующее:
  * сохранение кандидата в БД
  * поля для ввода данных(регистр, языковая поддержка (Данные ФИО и тд можно вводить  на русском/других языках), спецсимволы, граничные значения )
  * не происходит ли замещение старого кандидата новым в БД, в случае совпадения некоторых данных(например, ФИО)
  * удаление кандидата из бд, при выборе "удалить кандидата"
  * повторяющийся email, skype, phone
  *
*/

public class CreateCandidatePageTest extends LoginPageTest {
    private WebDriver driver = WebDriverSingleton.getInstance();
    CreateCandidatePage createCandidatePage = new CreateCandidatePage();
    private static final String ERROR_MESSAGE_CREATING = "Проверьте обязательные поля";

    @Before
    public void candidatesPreconditions() throws JAXBException {
        testLogin();
        createCandidatePage.openCreateCandidatePage();
    }

    @Test
    @DisplayName("Создание кандидата")
    @Description("Позитивное создание кандидата")
    @Feature("Кандидаты")
    @Story("Сценарий 1 - Создание кандидата")
    @Severity(SeverityLevel.BLOCKER)
    public void createCandidateSuccessfully(){
        createCandidatePage.enterSurname("Евсей");
        createCandidatePage.enterName("Ирина");
        createCandidatePage.enterSecondName("Сергеевна");
        createCandidatePage.enterPhone("80333496571");
        createCandidatePage.enterEmail("irinaevsei.ie@gmail.com");
        createCandidatePage.enterSkype("irina_evsei");
        createCandidatePage.enterCountry("Беларусь");
        createCandidatePage.enterCity("Минск");
        createCandidatePage.clickRelocationCheckbox();
        createCandidatePage.enterBirthDay("11");
        createCandidatePage.enterBirthMonth("04");
        createCandidatePage.enterBirthYear("1998");
        createCandidatePage.enterDesiredPosition("Тестировщик");
        createCandidatePage.enterAdditionalInfo("Дополнительная информация.");
        createCandidatePage.clickSaveButton();
        Element successMessage = new Element("Резюме было успешно сохранено", By.xpath("//*[@id=\"successMessage\"]"));
        Assert.assertTrue(successMessage.isElementPresent());
    }

    @Test
    @DisplayName("Удаление кандидата")
    @Description("удаление после создания")
    @Feature("Кандидаты")
    @Story("Сценарий 2 - удаление")
    @Severity(SeverityLevel.BLOCKER)

    public void createCandidateAndDelete() throws InterruptedException {
        createCandidatePage.enterSurname("Евсей");
        createCandidatePage.enterName("Ирина");
        createCandidatePage.enterSecondName("Сергеевна");
        createCandidatePage.enterPhone("3496576781");
        createCandidatePage.enterEmail("iricmvmnaevsei@gmail.com");
        createCandidatePage.enterSkype("iraevkbvsei");
        createCandidatePage.enterCountry("Беларусь");
        createCandidatePage.enterCity("Минск");
        createCandidatePage.clickRelocationCheckbox();
        createCandidatePage.enterBirthDay("11");
        createCandidatePage.enterBirthMonth("04");
        createCandidatePage.enterBirthYear("1998");
        createCandidatePage.enterDesiredPosition("Тестировщик");
        createCandidatePage.enterAdditionalInfo("Дополнительная информация.");
        createCandidatePage.clickSaveButton();
        Helper.wait(5);
        Element deleteCandidate = new Element("Удалить", By.xpath("//a[text() = 'Удалить ']"));
        deleteCandidate.clickElement();
        Helper.wait(3);
        Element deleteSureCandidate = new Element("подтверждение удаления", By.xpath("//button[text() = 'Удалить']"));
        deleteSureCandidate.clickElement();
        Helper.wait(5);
        Element successDeleteMessage = new Element(" Профиль кандидата был успешно удален из системы ", By.xpath("//*[@id=\"successMessage\"]"));
        Assert.assertTrue(successDeleteMessage.isElementPresent());
    }

    @Test
    @DisplayName("Создание кандидата")
    @Description("Создание кандидата с пустыми обязательными полями")
    @Feature("Кандидаты")
    @Story("Сценарий 3 - пустой")
    @Severity(SeverityLevel.BLOCKER)
    public void emptyCandidateSave() throws InterruptedException {
        CreateCandidatePage createCandidate = new CreateCandidatePage();
        createCandidate.openCreateCandidatePage();
        createCandidate.clickSaveButton();
        Helper.wait(3);
        Element alert = new Element("Alert", By.xpath("//*[@id=\"yui_patched_v3_11_0_1_1523183791436_233\"]"));
        Assert.assertTrue(alert.isElementPresent());

    }

//    @Test
//    @DisplayName("Поиск по имени")
//    @Description("Поиск по имени кандидата")
//    @Feature("Кандидаты")
//    @Story("Проверка поиска")
//    @Severity(SeverityLevel.CRITICAL)
//    public void checkBack(){
//        createCandidatePage.clickBackToListLink();
//        Assert.assertEquals("http://testing.cld.iba.by/web/guest/recruiting/candidates/-/candidates/", driver.getCurrentUrl());
//    }


    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }
}
