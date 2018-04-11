package edu.bsuir.pages;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.elements.HomePageElements;
import edu.bsuir.elements.MenuPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void openSidebar() {
        WebElement element = driver.findElement(HomePageElements.OPEN_MENU_BUTTON);
        element.click();
    }
    public void clickHomeButton() {
        WebElement element = driver.findElement(HomePageElements.HOME_BUTTON);
        element.click();
    }
    public void clickRecruiting() {
        WebElement element = driver.findElement(HomePageElements.RECRUITING_BUTTON);
        element.click();
    }
    public void clickApplications() {
        WebElement element = driver.findElement(MenuPageElements.APPLICATIONS);
        element.click();
    }
    public void clickVacancies() {
        WebElement element = driver.findElement(MenuPageElements.VACANCIES);
        element.click();

    }
    public void clickCandidates() {
//        WebElement element = driver.findElement(MenuPageElements.CANDIDATES);
//        element.click();
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(MenuPageElements.LEFT_ICON);
        actions.moveToElement(element).build().perform();
        WebElement element1 = driver.findElement(MenuPageElements.CANDIDATES);
        actions.moveToElement(element1).build().perform();
        element1.click();

    }
    public void clickPatterns() {
        WebElement element  = driver.findElement(MenuPageElements.ANNOUNCEMENT_PATTERNS);
        element.click();

    }
    public void clickVacanciesReports() {
        WebElement element = driver.findElement(MenuPageElements.VACANCIES_REPORTS);
        element.click();

    }
    public void clickRecruitersReports() {
        WebElement element = driver.findElement(MenuPageElements.RECRUITERS_REPORTS);
        element.click();
    }

}
