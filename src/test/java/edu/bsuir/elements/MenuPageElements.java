package edu.bsuir.elements;

import org.openqa.selenium.By;

public class MenuPageElements {
    public static By APPLICATIONS = By.xpath("//a//div[text() = ' Заявки ']");
    public static By VACANCIES = By.xpath("//a//div[text() = ' Вакансии ']");
   // public static By CANDIDATES = By.xpath("//a//[id=\"layout_19\"]");
    public static By ANNOUNCEMENT_PATTERNS = By.xpath("//a//div[text() = ' Шаблоны объявлений ']");
    public static By VACANCIES_REPORTS = By.xpath("//a//div[text() = ' Отчёт по вакансиям ']");
    public static By RECRUITERS_REPORTS = By.xpath("//a//div[text() = ' Отчёт по рекрутерам ']");

    public static By LEFT_ICON = By.id("navigationIcon3");
    public static By CANDIDATES = By.xpath("//*[contains(text(), 'Кандидаты')]");
}
