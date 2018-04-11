package edu.bsuir.elements;

import edu.bsuir.driver.WebDriverSingleton;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Element {
    public String name;
    public By by;

    public Element(String name, By by) {
        this.name = name;
        this.by = by;
    }

    public String getName() {
        return name;
    }

     public void setName(String name) {
        this.name = name;
     }

     public By getBy() {
        return by;
     }

     public void setBy(By by) {
        this.by = by;
     }

     public boolean isElementClickable() {
        assertPresence();
        try {
            getElement().click();
            return true;
        } catch (WebDriverException e) {
            return false;
        }
     }

     public void assertClickable() {
        Assert.assertTrue(isElementClickable());
     }

     public boolean isElementPresent() {
        try {
           getElement();
           return true;
        } catch (NoSuchElementException e) {
            return false;
        }
     }

     public WebElement getElement() {
         return WebDriverSingleton.getInstance().findElement(by);
     }

     public void assertPresence() {
         Assert.assertTrue("Element doesn't exist", isElementPresent());
     }

     public void clickElement() {
         assertPresence();
         assertClickable();
         getElement().click();
     }

     public void typeText(String text) {
         assertPresence();
         getElement().sendKeys(text);
     }

     public String getElementText() {
         assertPresence();
         return getElement().getText();
     }
     public void doubleClick() {
         assertPresence();
         assertClickable();
         Actions actions = new Actions(WebDriverSingleton.getInstance());
         actions.doubleClick(getElement());
         actions.perform();
     }
}