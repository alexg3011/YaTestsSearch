package ru.yandex.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTestPage {

    private static WebDriverSettings wds;

    public static String searchField = "//input[@class='input__control input__input mini-suggest__input']";
    public static String searchButton = "//button[@class='button mini-suggest__button button_theme_search button_size_search i-bem button_js_inited']";
    public static String yandexMap = "//*[contains(@class, 'map2__container')]";

    public static WebElement findByXpath(String element) {
        ChromeDriver driver = wds.init();

        return driver.findElement(By.xpath(element));
    }

}
