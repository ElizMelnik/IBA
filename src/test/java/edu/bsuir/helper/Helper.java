package edu.bsuir.helper;

import edu.bsuir.driver.WebDriverSingleton;

public class Helper {
    public static void closeDriver() {
        WebDriverSingleton.getInstance().close();
        WebDriverSingleton.destroyInstance();
    }

    public static void wait(int seconds) throws InterruptedException {
            Thread.sleep(seconds * 1000);
    }

}
