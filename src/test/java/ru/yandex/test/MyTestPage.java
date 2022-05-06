package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyTestPage extends WebDriverSettings {

    public static String searchField = "//input[@class='input__control input__input mini-suggest__input']";
    public static String searchButton = "//button[@class='button mini-suggest__button button_theme_search button_size_search i-bem button_js_inited']";

    public static WebElement findByXpath(String element) {
        return driver.findElement(By.xpath(element));
    }

}
