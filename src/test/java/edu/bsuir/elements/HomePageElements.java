package edu.bsuir.elements;

import org.openqa.selenium.By;

public class HomePageElements {
    public static String URL = "http://testing.cld.iba.by";
    public static String RECRUITING_URL = "http://testing.cld.iba.by/web/guest/recruiting";
    public static String HOME_URL = "http://testing.cld.iba.by/web/guest/home";

    public static By OPEN_MENU_BUTTON = By.id("banner");
    public static By RECRUITING_BUTTON = By.xpath("//a[@href = '"+RECRUITING_URL +"']");
    public static By HOME_BUTTON = By.xpath("//a[@href = '"+HOME_URL +"']");
}
